package com.example.logic;

import com.example.interfaces.RegisterI;
import com.example.interfaces.StaffI;
import com.example.model.Staff;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("staff")
@RequestScoped
public class StaffRegister implements StaffI {

    @Inject
    DBconnect toDB;


    @Override
    public boolean register(Staff e) {
        return false;
    }
}
