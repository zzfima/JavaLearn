package com.zzfima.lil.learningspring.data.repository;

import com.zzfima.lil.learningspring.data.entity.Guest;
import com.zzfima.lil.learningspring.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {
}
