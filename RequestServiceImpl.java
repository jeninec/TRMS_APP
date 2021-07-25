package dev.clay.services;

import java.util.List;

import dev.clay.models.Request;
import dev.clay.repos.RequestRepo;

public class RequestServiceImpl implements RequestService {

	RequestRepo rr;
	
	public RequestServiceImpl(RequestRepo rr) {
		this.rr = rr;
	}
	
	@Override
	public Request getRequest(int id) {
		return rr.getRequest(id);
	}

	@Override
	public List<Request> getAllRequests() {
		return rr.getAllRequests();
	}

	@Override
	public Request addRequest(Request rq) {
		return rr.addRequest(rq);
	}

	@Override
	public Request updateRequest(Request change) {
		return rr.updateRequest(change);
	}

	@Override
	public Request deleteRequest(int id) {
		return rr.deleteRequest(id);
	}

}
