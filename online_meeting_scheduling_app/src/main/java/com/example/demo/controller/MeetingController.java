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

import com.example.demo.model.Meetings;
import com.example.demo.service.MeetingService;
@RestController
public class MeetingController {
	@Autowired
	
	MeetingService  b;
	//MEETINGS 
	
		@PostMapping("addmeeting")
		public List<Meetings> add1(@RequestBody List<Meetings> m)
		{
			return b.savedetails1(m);
		}
		
		@GetMapping("showdetails1")
		public List<Meetings> show1(){
			return b.showinfo1();
		}
		
		@GetMapping("showid1/{id}")
		public Optional<Meetings> showid1(@PathVariable int id)
		{
			return b.showbyid1(id);
		}
		
		@PutMapping("update1")
		public Meetings modify1(@RequestBody Meetings m)
		{
			return b.changeinfo1(m);
		}
		
		@PutMapping("updatebyid1/{id}")
		public String change1(@PathVariable int id , @RequestBody Meetings m) 
		{
			return b.updateinfobyid1(id,m);
		}
		
		@DeleteMapping("delete1")
		public String del1(@RequestBody Meetings m)
		{
			 b.deleteinfo1(m);
			 return  "Deleted Suceessfully";
		}
		
		@DeleteMapping("del1/{id}")
		public void deletemyid1(@PathVariable int id)
		{
			b.deleteid1(id);
		}
}
