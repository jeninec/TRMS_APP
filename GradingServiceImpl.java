package dev.clay.services;

import java.util.List;

import dev.clay.models.Grading;
import dev.clay.repos.GradingRepo;

public class GradingServiceImpl implements GradingService {

	public GradingRepo gr;
	
	public GradingServiceImpl(GradingRepo gr) {
		this.gr = gr;
	}
	@Override
	public Grading getGrading(int id) {
		return gr.getGrading(id);
	}

	@Override
	public List<Grading> getAllGradings() {
		return gr.getAllGradings();
		
	}

	@Override
	public Grading addGrading(Grading g) {
		return gr.addGrading(g);
	}

	@Override
	public Grading updateGrading(Grading change) {
		return gr.updateGrading(change);
	}

	@Override
	public Grading deleteGrading(int id) {
		return gr.deleteGrading(id);
	}

}
