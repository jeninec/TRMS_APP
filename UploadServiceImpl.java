package dev.clay.services;

import java.util.List;

import dev.clay.models.Upload;
import dev.clay.repos.UploadRepo;

public class UploadServiceImpl implements UploadService {

	UploadRepo ur;
	
	public UploadServiceImpl(UploadRepo ur) {
		this.ur = ur;
	}
	
	@Override
	public Upload getUpload(int id) {
		return ur.getUpload(id);
	}

	@Override
	public List<Upload> getAllUploads() {
		return ur.getAllUploads();
	}

	@Override
	public Upload addUpload(Upload u) {
		return ur.addUpload(u);
	}

	@Override
	public Upload updateUpload(Upload change) {
		return ur.updateUpload(change);
	}

	@Override
	public Upload deleteUpload(int id) {
		return ur.deleteUpload(id);
	}

}
