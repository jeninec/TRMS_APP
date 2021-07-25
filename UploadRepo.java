package dev.clay.repos;

import java.util.List;

import dev.clay.models.Upload;

public interface UploadRepo {

	public Upload getUpload(int id);
	
	public List<Upload> getAllUploads();
	
	public Upload addUpload(Upload u);
	
	public Upload updateUpload(Upload change);
	
	public Upload deleteUpload(int id);
	
}
