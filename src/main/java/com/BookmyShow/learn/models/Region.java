package com.BookmyShow.learn.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Region extends BaseModel
{
    private String name;

    @OneToMany(mappedBy = "region")
    private List<Theatre> theatres;
}

/*
* Region : Theatre
* 1             M
* 1             1
* Region: Theatre = 1: M
* */
