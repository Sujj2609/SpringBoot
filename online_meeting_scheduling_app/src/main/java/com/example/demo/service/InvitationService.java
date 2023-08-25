package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Invitations;
import com.example.demo.repository.InvitationRepo;

@Service
public class InvitationService {
	@Autowired
	InvitationRepo ir;
	
	//POST
		public List<Invitations> savedetails3(List<Invitations> i)
		{
			return (List<Invitations>)ir.saveAll(i);
		}
		
		//GET
		public List<Invitations> showinfo3(){
			return ir.findAll();
		}
		
		//GET BY ID
		public Optional<Invitations> showbyid3(int id)
		{
			return ir.findById(id);
		}
		
		//PUT
		public Invitations changeinfo3(Invitations i)
		{
			return ir.saveAndFlush(i);
		}
		
		//PUT BY ID
		public String updateinfobyid3(int id,Invitations i)
		{
			ir.saveAndFlush(i);
			if(ir.existsById(id))
			{
				return "Updated";
			}
			else
			{
				return "Enter valid id";
			}
		}
		
		//DELETE
		public void deleteinfo3(Invitations i)
		{
			ir.delete(i);
		}
		//DELETE BY ID(PathVariable)
		public void deleteid3(int id)
		{
			ir.deleteById(id);
		}
		

}
