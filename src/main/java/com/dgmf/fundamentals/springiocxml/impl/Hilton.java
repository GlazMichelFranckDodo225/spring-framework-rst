package com.dgmf.fundamentals.springiocxml.impl;

import com.dgmf.fundamentals.springiocxml.interfaces.Hotel;

public class Hilton implements Hotel {
    @Override
    public String getStartRating() {
        return null;
    }

    @Override
    public String getHotelName() {
        return "Hilton";
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public int getAvailability() {
        return 0;
    }
}
