package dev.clay.repos;

import java.util.List;

import dev.clay.models.Grading;

public interface GradingRepo {

	public Grading getGrading(int id);
	
	public List<Grading> getAllGradings();
	
	public Grading addGrading(Grading g);
	
	public Grading updateGrading(Grading change);
	
	public Grading deleteGrading(int id);
}
