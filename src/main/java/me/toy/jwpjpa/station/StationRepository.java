package me.toy.jwpjpa.station;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepository extends JpaRepository <Station, Long> {
    Station findByName(String name);
}
