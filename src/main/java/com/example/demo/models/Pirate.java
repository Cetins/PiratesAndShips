//  POJO
//  Plain Old Java Object

//  **  All properties should be private and have getters setters
//  **  Must have default constructor

//  Pirate pirate = new Pirate("Jack", "Sparrow", 32)

//  Pirate pirate = new Pirate();
//  pirate.setFirstName("Jack");
//  pirate.setLastName("Sparrow");
//  pirate.setAge(32);

package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name="pirates")
public class Pirate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "age")
    private int age;

    @ManyToOne
    @JoinColumn(name = "ship_id", nullable = false)
    private Ship ship;

    public Pirate(String firstName, String lastName, int age, Ship ship) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ship = ship;
    }

    public Pirate() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }
}
