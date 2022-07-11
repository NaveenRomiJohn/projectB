package com.chainsys.projectB.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.chainsys.projectB.entity.Appointments;
import com.chainsys.projectB.entity.Doctor;
import com.chainsys.projectB.repository.DoctorRepository;

@RestController
public class DoctorControl {
	@Autowired
	private DoctorRepository doctorRepo;

	@GetMapping("/getDoctor")
	public Doctor getDoctor(int id) {
		return doctorRepo.findById(id);
	}

	@GetMapping("/getalldoctors")
	public List<Doctor> getDoctors() {
		return doctorRepo.findAll();
	}
	
	@GetMapping(value = "/getdoctorappointments")
	public String getAppointments(int id) {
		Doctor doc = doctorRepo.findById(id);
		List<Appointments> appointments = doc.getAppointments();
		return appointments.toString();
	}

	@DeleteMapping("/deletedoctor")
	public RedirectView deleteDoctor(int id) {
		doctorRepo.deleteById(id);
		return new RedirectView("/getalldoctors");
	}

	@PostMapping(value = "/newdoctor", consumes = "application/json")
	public RedirectView addDoctor(@RequestBody Doctor dr) {
		doctorRepo.save(dr);
		return new RedirectView("/getalldoctors");
	}

	@PutMapping(value = "/modifydoctor", consumes = "application/json")
	public String modifyDoctor(@RequestBody Doctor dr) {
		doctorRepo.save(dr);
		return "redirect:/getalldoctors";
	}
}