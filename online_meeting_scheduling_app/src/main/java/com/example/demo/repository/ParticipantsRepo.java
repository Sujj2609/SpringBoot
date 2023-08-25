package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Participants;

public interface ParticipantsRepo extends JpaRepository<Participants, Integer> {

}
