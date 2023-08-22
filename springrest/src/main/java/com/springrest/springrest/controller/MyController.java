package com.springrest.springrest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.load;
import com.springrest.springrest.services.loadService;

@RestController
public class MyController {
	
	@Autowired
	private loadService object;
	//Autowired will automatically create object
	
	@GetMapping("/servercheck")
	public String serverCheck(){
		return "The Server Is Running";
	}
	
	@GetMapping("/allloads")
	public List<load> getAllLoads(){
		return this.object.getAllLoads();
	}
	
	@RequestMapping(value="/load", method = RequestMethod.GET)
	public @ResponseBody
	List<load> getLoadsWithShipperId(@RequestParam("shipperId") int shipperId) { 
		return this.object.getLoadsWithShipperId(shipperId);
	}
	
	@GetMapping("/load/{loadId}")
	public Optional<load> getLoadWithId(@PathVariable String loadId) {
		return this.object.getLoadWithId(Integer.parseInt(loadId));
	}
	
	@PostMapping("/load")
	public load postNewLoad(@RequestBody load load) {
		return this.object.postNewLoad(load);
	}
	
	@PutMapping("/load/{loadId}")
	public load updateLoadWithId(@PathVariable String loadId, @RequestBody load load) {
		return this.object.updateLoadWithId(Integer.parseInt(loadId),load);
	}
	
	@DeleteMapping("/load/{loadId}")
	public String deleteLoadWithId(@PathVariable String loadId) {
		return this.object.deleteLoadWithId(Integer.parseInt(loadId));
	}
}
