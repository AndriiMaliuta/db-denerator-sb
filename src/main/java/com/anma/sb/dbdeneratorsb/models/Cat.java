package com.anma.sb.dbdeneratorsb.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cats")
public class Cat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cat_id")
    private long catId;
    private String id;
    private String name;
    private String color;
    private String breed;
    private String registry;
    private String origin;
    @Column(name = "country_codes") private String countryCodes;
    @Column(name = "wikipedia_url") private String wikipediaUrl;
    private int age;
    private int indoor;
    private int adaptability;
    @Column(name = "dog_friendly") private int dogFriendly;
    private int intelligence;
    private int hairless;
    @Column(name = "person_id") private long personId;
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "person_id", referencedColumnName = "person_id")
//    private Person owner;

}