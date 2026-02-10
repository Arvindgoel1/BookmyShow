package com.BookmyShow.learn.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "shows")
public class Show extends BaseModel
{
    @ManyToOne
    private Screen screen;

    @ManyToOne
    private Movie movie;
    private Date time;

    @OneToMany(mappedBy = "show")
    private List<ShowSeat> showSeats;

    @OneToMany(mappedBy = "show")
    private List<ShowSeatType> showSeatTypes;
}
