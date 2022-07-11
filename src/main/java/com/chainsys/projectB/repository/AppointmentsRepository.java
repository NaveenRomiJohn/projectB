package com.chainsys.projectB.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.chainsys.projectB.entity.Appointments;

public interface AppointmentsRepository extends CrudRepository<Appointments,Integer>
{
	Appointments save(Appointments app);
    Appointments findById(int id);
    void deleteById(int id);
    List <Appointments> findAll();
    List <Appointments> findByDoctorId(int doctorId);
    List <Appointments> findByPatientId(int patientId);
}