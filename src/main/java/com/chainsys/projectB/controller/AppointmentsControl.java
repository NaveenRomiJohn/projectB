package com.chainsys.projectB.controller;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chainsys.projectB.entity.Appointments;
import com.chainsys.projectB.entity.Doctor;
import com.chainsys.projectB.repository.AppointmentsRepository;

@RestController
public class AppointmentsControl {
    @Autowired
    private AppointmentsRepository aptRepo;
    
    @GetMapping(value = "/getDoctorByAppointmentId")
    public String getDoctorByAppointmentId(int id) {
        Appointments app=aptRepo.findById(id);
        Doctor doc=app.getDoctor();
        return doc.toString();
    } 
    
    @GetMapping(value = "/fetchappointment") //
    public Appointments getAppointmentById(int id) {
        return aptRepo.findById(id);
    }
    @GetMapping(value = "/fetchappointmentbydoctor")
    public String getAppointmentByDocId(int id) {
        List<Appointments> applist=aptRepo.findByDoctorId(id);
        Iterator<Appointments>itr=applist.iterator();
        String result="";
        while(itr.hasNext()) {
            Appointments app=itr.next();
            result+=app.toString()+"\n";
        }
        return result;
    }
    @GetMapping(value = "/fetchallappointments") //
    public List<Appointments> getAllAppointments(){
        return aptRepo.findAll();
    }
    @PostMapping(value = "/newappointment", consumes = "application/json")
    public String addAppointment(@RequestBody Appointments apt) {
         aptRepo.save(apt);
         return "redirect:/fetchallappointment";
    }
    @PostMapping(value = "/modifyappointment", consumes = "application/json")
    public String updateAppointment(@RequestBody Appointments apt) {
         aptRepo.save(apt);
         return "redirect:/fetchallappointment";
    }
    @DeleteMapping(value = "/removeappointment")
    public String deleteAppointment(int id) {
        aptRepo.deleteById(id);
         return "redirect:/fetchallappointment";
    }
}