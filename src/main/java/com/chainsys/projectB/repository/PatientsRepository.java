package com.chainsys.projectB.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.chainsys.projectB.entity.Patients;

public interface PatientsRepository extends CrudRepository<Patients,Integer>{
		Patients findById(int id);
		Patients save(Patients patients);
	    void deleteById(int id);
	    List <Patients> findAll();
}
