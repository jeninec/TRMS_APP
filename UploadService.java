package dev.clay.services;

import java.util.List;

import dev.clay.models.Upload;

public interface UploadService {

	public Upload getUpload(int id);
	
	public List<Upload> getAllUploads();
	
	public Upload addUpload(Upload u);
	
	public Upload updateUpload(Upload change);
	
	public Upload deleteUpload(int id);
	
}
