package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Participants;
import com.example.demo.repository.ParticipantsRepo;

@Service
public class ParticipantsService {
	@Autowired
	
	ParticipantsRepo pr;
	//POST
	public List<Participants> savedetails2(List<Participants> p)
	{
		return (List<Participants>)pr.saveAll(p);
	}
	
	//GET
	public List<Participants> showinfo2(){
		return pr.findAll();
	}
	
	//GET BY ID
	public Optional<Participants> showbyid2(int id)
	{
		return pr.findById(id);
	}
	
	//PUT
	public Participants changeinfo2(Participants p)
	{
		return pr.saveAndFlush(p);
	}
	
	//PUT BY ID
	public String updateinfobyid2(int id,Participants p)
	{
		pr.saveAndFlush(p);
		if(pr.existsById(id))
		{
			return "Updated";
		}
		else
		{
			return "Enter valid id";
		}
	}
	
	//DELETE
	public void deleteinfo2(Participants p)
	{
		pr.delete(p);
	}
	//DELETE BY ID(PathVariable)
	public void deleteid2(int id)
	{
		pr.deleteById(id);
	}
	

}
