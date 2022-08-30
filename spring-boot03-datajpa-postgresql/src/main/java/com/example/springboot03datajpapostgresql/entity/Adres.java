package com.example.springboot03datajpapostgresql.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "kisi_adres")
@Data // Getter, Setter, RequiredArgsConstructor, ToString, EqualsAndHashCode, lombok.Value (Hepsinin yerine geçer)
@NoArgsConstructor
@AllArgsConstructor
//@EqualsAndHashCode(of = "id")
//@ToString
public class Adres {
    @Id
    @SequenceGenerator(name = "seq_kisi_adres", allocationSize = 1)//alloc artış miktarı = 1
    @GeneratedValue(generator = "seq_kisi_adres", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "adres", length = 500)
    private String adres;

    @Enumerated
    private AdresTip adresTip;

    @Column(name = "aktif")
    private boolean aktif;

    @ManyToOne
    @JoinColumn(name="kisi_adres_id")
    private Kisi kisi;

    public enum AdresTip{
        EV_ADRESI,
        IS_ADRESI,
        DIGER
    }

}
