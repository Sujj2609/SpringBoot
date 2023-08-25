package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.Users;

import com.example.demo.repository.UserRepo;

@Service
public class UserService {
	@Autowired
	UserRepo ur;
	
	//USERS
	
	//POST
	public List<Users> savedetails(List<Users> u)
	{
		return (List<Users>)ur.saveAll(u);
	}
	
	//GET
	public List<Users> showinfo(){
		return ur.findAll();
	}
	
	//GET BY ID
	public Optional<Users> showbyid(int id)
	{
		return ur.findById(id);
	}
	
	//PUT
	public Users changeinfo(Users u)
	{
		return ur.saveAndFlush(u);
	}
	
	//PUT BY ID
	public String updateinfobyid(int id,Users u)
	{
		ur.saveAndFlush(u);
		if(ur.existsById(id))
		{
			return "Updated";
		}
		else
		{
			return "Enter valid id";
		}
	}
	
	//DELETE
	public void deleteinfo(Users u)
	{
		ur.delete(u);
	}
	//DELETE BY ID(PathVariable)
	public void deleteid(int id)
	{
		ur.deleteById(id);
	}
	
	
}
