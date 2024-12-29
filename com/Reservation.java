package com;

public class Reservation {
    private String movieTitle;
    private String schedule;
    private int seats;
    private int totalPrice;

    public Reservation(String movieTitle, String schedule, int seats, int totalPrice) {
        this.movieTitle = movieTitle;
        this.schedule = schedule;
        this.seats = seats;
        this.totalPrice = totalPrice;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getSchedule() {
        return schedule;
    }

    public int getSeats() {
        return seats;
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}
