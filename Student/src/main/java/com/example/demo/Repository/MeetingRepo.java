package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.Meeting;

public interface MeetingRepo extends JpaRepository<Meeting,Integer>{

}

