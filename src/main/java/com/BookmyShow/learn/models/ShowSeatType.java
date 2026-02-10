package com.BookmyShow.learn.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ShowSeatType extends BaseModel
{
    @ManyToOne
    private Show show;

    @ManyToOne
    private SeatType seatType;
    private double price;
}
