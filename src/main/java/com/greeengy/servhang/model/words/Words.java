package com.greeengy.servhang.model.words;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Words {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String word;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return word;
    }

    public void setName(String name) {
        this.word = word;
    }


    @Override
    public String toString() {
        return "Words{" +
                "id=" + id +
                ", name='" + word + '\'' +
                '}';
    }
}