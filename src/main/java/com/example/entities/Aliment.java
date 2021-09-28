package com.example.entities;


import javax.persistence.*;
import java.util.List;

@Entity
public class Aliment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Category category;
    private List<Nutriment> nutriments;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne
    public Category getCategory() {
         if (category == null) {
             return new Category();
         }
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @OneToMany
    public List<Nutriment> getNutriments() {
        return nutriments;
    }

    public void setNutriments(List<Nutriment> nutriments) {
        this.nutriments = nutriments;
    }

}
