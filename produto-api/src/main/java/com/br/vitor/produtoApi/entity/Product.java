package com.br.vitor.produtoApi.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
@With
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "tb_product")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    @Column(name = "bar_code")
    private String barCode;

    private String series;

    private String name;

    private String description;

    private BigDecimal price;

    private BigDecimal tax;

    @Column(name = "manufacturing_date")
    private LocalDate manufacturingDate;

    @Column(name = "expiration_date")
    private LocalDate expirationDate;

    private String color;

    private String material;

    private String category;

    private Integer amount;


}
