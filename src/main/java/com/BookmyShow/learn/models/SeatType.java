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
public class SeatType extends BaseModel
{
    private String name;

    @OneToMany(mappedBy = "seatType")
    private List<Seat> seats;

    @OneToMany(mappedBy = "seatType")
    private List<ShowSeatType> showSeatTypes;
}
