package com.BookmyShow.learn.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Theatre extends BaseModel
{
    private String name;

    @ManyToOne
    private Region region;

    @OneToMany(mappedBy = "theatre")
    private List<Screen> screens;
}

