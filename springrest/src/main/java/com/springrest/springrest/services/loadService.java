package com.springrest.springrest.services;

import java.util.List;
import java.util.Optional;

import com.springrest.springrest.entities.load;

public interface loadService {
	public List<load> getAllLoads();
	public List<load> getLoadsWithShipperId(int shipperId);
	public Optional<load> getLoadWithId(int loadId);
	public load postNewLoad(load load);
	public load updateLoadWithId(int loadId, load load);
	public String deleteLoadWithId(int loadId);
}
