package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Meetings;
import com.example.demo.repository.MeetingRepo;
@Service
public class MeetingService {
	@Autowired
	
	MeetingRepo mr;
	// MEETINGS
	
		//POST
			public List<Meetings> savedetails1(List<Meetings> m)
			{
				return (List<Meetings>)mr.saveAll(m);
			}
			
			//GET
			public List<Meetings> showinfo1(){
				return mr.findAll();
			}
			
			//GET BY ID
			public Optional<Meetings> showbyid1(int id)
			{
				return mr.findById(id);
			}
			
			//PUT
			public Meetings changeinfo1(Meetings m)
			{
				return mr.saveAndFlush(m);
			}
			
			//PUT BY ID
			public String updateinfobyid1(int id,Meetings m)
			{
				mr.saveAndFlush(m);
				if(mr.existsById(id))
				{
					return "Updated";
				}
				else
				{
					return "Enter valid id";
				}
			}
			
			//DELETE
			public void deleteinfo1(Meetings m)
			{
				mr.delete(m);
			}
			//DELETE BY ID(PathVariable)
			public void deleteid1(int id)
			{
				mr.deleteById(id);
			}
			
}
