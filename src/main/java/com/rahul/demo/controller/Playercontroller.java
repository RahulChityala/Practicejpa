package com.rahul.demo.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.rahul.demo.model.Player;
import com.rahul.demo.repo.Playerrepo;

@Controller
public class Playercontroller {

	@Autowired
	Playerrepo repo;
	
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	
	//CRUD Operations
	//Create(Post)
	@RequestMapping("/addplayer")
	public String addplayer(Player player)
	{
		repo.save(player);
		return "home.jsp";
	}
	
	//Read(fetch)
	@RequestMapping("/getplayer")
	public ModelAndView getplayer(@RequestParam int playerid)
	{
		ModelAndView mv = new ModelAndView("getplayer.jsp");
		Player player = repo.findById(playerid).orElse(new Player());
		
		mv.addObject(player);
		return mv;
	}
	
	@RequestMapping("/deleteplayer")
	public String deleteplayer(@RequestParam int playerid)
	{
		repo.deleteById(playerid);
		return "home.jsp";
		
	}
	
	
	@GetMapping("/players")
	@ResponseBody
	public ArrayList<Player> getallplayers()
	{
		
		return (ArrayList<Player>) repo.findAll();
	}
	
	@GetMapping("/player/{playerid}")
	@ResponseBody
	public Optional<Player> getplayerbyid(@PathVariable int playerid)
	{
		return repo.findById(playerid);
	}
	
	
	
	//Postman
	@PostMapping("/player")
	public Player postplayer(Player player)
	{
		repo.save(player);
		return player;
	}
	
	@PutMapping("/player")
	public Player putplayer(Player player)
	{
		repo.save(player);
		return player;
	}
	@DeleteMapping("/player/{playerid}")
	public String deleteplayerpost(@PathVariable int playerid)
	{
		repo.deleteById(playerid);
		return "deleted";
	}
}
