package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Users;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	@Autowired
	
	UserService a;
	
	//USERS
	
	@PostMapping("adduser")
	public List<Users> add(@RequestBody List<Users> u)
	{
		return a.savedetails(u);
	}
	
	@GetMapping("showdetails")
	public List<Users> show(){
		return a.showinfo();
	}
	
	@GetMapping("showid/{id}")
	public Optional<Users> showid(@PathVariable int id)
	{
		return a.showbyid(id);
	}
	
	@PutMapping("update")
	public Users modify(@RequestBody Users u)
	{
		return a.changeinfo(u);
	}
	
	@PutMapping("updatebyid/{id}")
	public String change(@PathVariable int id , @RequestBody Users u) 
	{
		return a.updateinfobyid(id,u);
	}
	
	@DeleteMapping("delete")
	public String del(@RequestBody Users u)
	{
		 a.deleteinfo(u);
		 return  "Deleted Suceessfully";
	}
	@DeleteMapping("del/{id}")
	public void deletemyid(@PathVariable int id)
	{
		a.deleteid(id);
	}

}
