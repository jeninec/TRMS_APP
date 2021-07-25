package dev.clay.services;

import java.util.List;

import dev.clay.models.Feedback;
import dev.clay.repos.FeedbackRepo;

public class FeedbackServiceImpl implements FeedbackService {

	FeedbackRepo fr; 
	
	
	public FeedbackServiceImpl(FeedbackRepo fr) {
		this.fr = fr;
	}

	@Override
	public Feedback getFeedback(int id) {
		return fr.getFeedback(id);
	}

	@Override
	public List<Feedback> getAllFeedback() {
		return fr.getAllFeedback();
	}

	@Override
	public Feedback addFeedback(Feedback f) {
		return fr.addFeedback(f);
	}

	@Override
	public Feedback updateFeedback(Feedback change) {
		return fr.updateFeedback(change);
	}

	@Override
	public Feedback deleteFeedback(int id) {
		return fr.deleteFeedback(id);
	}

}
