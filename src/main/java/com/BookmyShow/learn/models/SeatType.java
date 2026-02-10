package com.BookmyShow.learn.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class SeatType extends BaseModel
{
    private String name;

    @OneToMany(mappedBy = "seatType")
    private List<Seat> seats;

    @OneToMany(mappedBy = "seatType")
    private List<ShowSeatType> showSeatTypes;
}
