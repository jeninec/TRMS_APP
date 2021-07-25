package dev.clay.repos;

import java.util.List;

import dev.clay.models.Feedback;

public interface FeedbackRepo {
	
	public Feedback getFeedback(int id);
	
	public List<Feedback> getAllFeedback();
	
	public Feedback addFeedback(Feedback f);
	
	public Feedback updateFeedback(Feedback change);
	
	public Feedback deleteFeedback(int id);

}
