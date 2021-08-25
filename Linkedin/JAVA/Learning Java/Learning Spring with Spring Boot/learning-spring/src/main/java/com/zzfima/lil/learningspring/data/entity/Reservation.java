package com.zzfima.lil.learningspring.data.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "RESERVATION")
public class Reservation {
    @Id
    @Column(name = "RESERVATION_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long reservationId;

    @Column(name = "RES_DATE")
    private LocalDate resDate;

    @OneToOne
    @JoinColumn(name = "ROOM_ID")
    private Room room;

    @OneToOne
    @JoinColumn(name = "GUEST_ID")
    private Guest guest;

    // *** Getters and Setters ***

    public long getReservationId() {
        return reservationId;
    }

    public void setReservationId(long reservationId) {
        this.reservationId = reservationId;
    }

    public LocalDate getResDate() {
        return resDate;
    }

    public void setResDate(LocalDate resDate) {
        this.resDate = resDate;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }
}
