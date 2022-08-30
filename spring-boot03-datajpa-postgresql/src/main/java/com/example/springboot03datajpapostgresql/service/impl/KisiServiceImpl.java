package com.example.springboot03datajpapostgresql.service.impl;

import com.example.springboot03datajpapostgresql.dto.KisiDto;
import com.example.springboot03datajpapostgresql.entity.Adres;
import com.example.springboot03datajpapostgresql.entity.Kisi;
import com.example.springboot03datajpapostgresql.repo.AdresRepository;
import com.example.springboot03datajpapostgresql.repo.KisiRepository;
import com.example.springboot03datajpapostgresql.service.KisiService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor //KisiRepository için otomatik constructor oluşturur.
public class KisiServiceImpl implements KisiService {
    /*
    @Component
    @Service
    @RestController
    @Controller
    @Repository
     */

    private final KisiRepository kisiRepository;
    private final AdresRepository adresRepository;

//    public KisiServiceImpl(KisiRepository kisiRepository){
//        this.kisiRepository = kisiRepository;
//    }

    @Override
    public KisiDto save(KisiDto kisiDto) {

        Kisi kisi = new Kisi();
        kisi.setAdi(kisiDto.getAdi());
        kisi.setSoyadi(kisiDto.getSoyadi());
        final Kisi kisiDb = this.kisiRepository.save(kisi);

        List<Adres> liste = new ArrayList<>();

        kisiDto.getAdresler().forEach((item) ->{
            Adres adres = new Adres();
            adres.setAdres(item);
            adres.setAdresTip(Adres.AdresTip.DIGER);
            adres.setAktif(true);
            adres.setKisi(kisiDb);
            liste.add(adres);
        });
        adresRepository.saveAll(liste);
        kisiDto.setId(kisiDto.getId());

        return kisiDto;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<KisiDto> getAll() {
        List<Kisi> kisiler = kisiRepository.findAll();
        List<KisiDto> kisiDtos = new ArrayList<>();
        kisiler.forEach(it->{
            KisiDto kisiDto = new KisiDto();
            kisiDto.setId(it.getId());
            kisiDto.setAdi(it.getAdi());
            kisiDto.setSoyadi(it.getSoyadi());
            kisiDto.setAdresler(it.getAdresleri().stream().map(Adres::getAdres).collect(Collectors.toList()));
            kisiDtos.add(kisiDto);
        });
        return kisiDtos;
    }

    @Override
    public Page<KisiDto> getAll(Pageable pageable) {
        return null;
    }
}
