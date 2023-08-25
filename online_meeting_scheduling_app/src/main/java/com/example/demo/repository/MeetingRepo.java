package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Meetings;

public interface MeetingRepo extends JpaRepository<Meetings, Integer>{

}
