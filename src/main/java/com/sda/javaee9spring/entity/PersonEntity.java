package com.sda.javaee9spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity // usually we use javax.persistence
@Table(name = "PERSON_ENTITIES")
@Data // generates setters
@AllArgsConstructor
@NoArgsConstructor
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;
    private int age;
}
