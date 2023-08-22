package com.springrest.springrest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.loadDao;
import com.springrest.springrest.entities.load;

@Service
public class loadServiceImpl implements loadService {
	@Autowired
	private loadDao object;
	
	@Override
	public List<load> getAllLoads() {
		return object.findAll();
	}

	@Override
	public List<load> getLoadsWithShipperId(int shipperId) {
		return object.findByShipperId(shipperId);
	}

	@Override
	public Optional<load> getLoadWithId(int loadId) {
		return object.findById(loadId);
	}

	@Override
	public load postNewLoad(load load) {
		return object.save(load);
	}

	@Override
	public load updateLoadWithId(int loadId, load load) {
		if(load.getLoadId()==0)
			load.setLoadId(loadId);
		if(load.getDate()=="" || load.getDate()==null)
			load.setDate();
		return object.save(load);
	}

	@Override
	public String deleteLoadWithId(int loadId) {
		object.deleteById(loadId);
		return "Deleted";
	}
}
