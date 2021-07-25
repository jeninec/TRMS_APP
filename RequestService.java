package dev.clay.services;

import java.util.List;

import dev.clay.models.Request;

public interface RequestService {

	public Request getRequest(int id);
	
	public List<Request> getAllRequests();
	
	public Request addRequest(Request rq);
	
	public Request updateRequest(Request change);
	
	public Request deleteRequest(int id);
	
}
