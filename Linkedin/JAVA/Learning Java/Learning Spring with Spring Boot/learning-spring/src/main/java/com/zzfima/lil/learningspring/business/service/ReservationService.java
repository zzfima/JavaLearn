package com.zzfima.lil.learningspring.business.service;

import com.zzfima.lil.learningspring.business.domain.RoomReservation;
import com.zzfima.lil.learningspring.data.entity.Reservation;
import com.zzfima.lil.learningspring.data.entity.Room;
import com.zzfima.lil.learningspring.data.repository.GuestRepository;
import com.zzfima.lil.learningspring.data.repository.ReservationRepository;
import com.zzfima.lil.learningspring.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ReservationService {
    private final RoomRepository roomRepository;
    private final GuestRepository guestRepository;
    private final ReservationRepository reservationRepository;

    @Autowired
    public ReservationService(RoomRepository roomRepository,
                              GuestRepository guestRepository,
                              ReservationRepository reservationRepository) {
        this.roomRepository = roomRepository;
        this.guestRepository = guestRepository;
        this.reservationRepository = reservationRepository;
    }

    public List<RoomReservation> getRoomReservationForDate(LocalDate date) {
        Iterable<Room> rooms = this.roomRepository.findAll();
        Map<Long, RoomReservation> roomReservationMap = new HashMap<>();
        rooms.forEach(room -> {
            RoomReservation roomReservation = new RoomReservation();
            roomReservation.setRoomId(room.getRoomId());
            roomReservation.setRoomName(room.getRoomName());
            roomReservation.setRoomNumber(room.getRoomNumber());
            roomReservationMap.put(room.getRoomId(), roomReservation);
        });
        Iterable<Reservation> reservations = this.reservationRepository.findReservationByReservationDate(date);
        reservations.forEach(reservation -> {

        });
        return null;
    }
}
