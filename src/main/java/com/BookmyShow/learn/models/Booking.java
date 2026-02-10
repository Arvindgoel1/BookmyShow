package com.BookmyShow.learn.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Booking extends BaseModel
{
    private Date bookedAt;

    @ManyToOne
    private User bookedBy;
    private double totalAmount;

    @OneToMany(mappedBy = "booking")
    private List<Payment> payments;

    @Enumerated(EnumType.STRING)
    private BookingStatus status;

    @OneToMany(mappedBy = "booking")
    private List<ShowSeat> seats;
}

/*
* Booking : ShowSeat
* 1 : M
* */
