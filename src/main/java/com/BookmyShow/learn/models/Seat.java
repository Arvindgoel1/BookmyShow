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
public class Seat extends BaseModel
{
    private String name;

    @ManyToOne
    private Screen screen;

    @ManyToOne
    private SeatType seatType;

    @OneToMany(mappedBy = "seat")
    private List<ShowSeat> showSeats;
}

/*
* Seat SeatType
*  1      1
*  M      1
*
* Seat: SeatType = M:1
* */
