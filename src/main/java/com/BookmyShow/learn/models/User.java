package com.BookmyShow.learn.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "users")
public class User extends BaseModel
{
    private String userName;
    private String password;

    @OneToMany(mappedBy = "bookedBy")
    private List<Booking> bookings;
}
