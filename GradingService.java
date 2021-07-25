package dev.clay.services;

import java.util.List;

import dev.clay.models.Grading;

public interface GradingService {

	public Grading getGrading(int id);
	
	public List<Grading> getAllGradings();
	
	public Grading addGrading(Grading g);
	
	public Grading updateGrading(Grading change);
	
	public Grading deleteGrading(int id);
}
