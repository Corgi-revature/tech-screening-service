package com.revature.screenforce.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.screenforce.beans.ViolationType;
import com.revature.screenforce.data.ViolationTypeRepository;

import java.util.List;

@Service
public class ViolationTypeServiceImpl implements ViolationTypeService {

	@Autowired
	ViolationTypeRepository violationTypeRepository;
	
	@Override
	public ViolationType getViolationType(int id) {
		return violationTypeRepository.findById(id).orElse(null);
	}

	@Override
	public List<ViolationType> getAll() {
		return violationTypeRepository.findAll();
	}


}
