package me.scpark;


import jakarta.persistence.*;


@Entity
public class Member {
    @Id  //zhu jian
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",updatable = false)//bu ke gen xin
    private Long id;
    @Column(name="name",nullable=false)  //bu ke wei kong
    private String name;

}
