package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.Host;

public interface HostRepo extends JpaRepository<Host,Integer>{

}

