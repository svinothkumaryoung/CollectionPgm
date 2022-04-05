package com.cognizant.collectionPgm;

import java.util.List;

public class StudentCollection {

    private List<StudentDetails> studentDetails;

    public List<StudentDetails> getStudentDetails() {
        return studentDetails;
    }

    public void setStudentDetails(List<StudentDetails> studentDetails) {
        this.studentDetails = studentDetails;
    }

    public void printData()
    {
        for(StudentDetails s:studentDetails)
        {
            System.out.println("Register Number is "+s.getRegisterNo());
            System.out.println("Name is "+s.getName());
            System.out.println("Address is "+s.getAddress());
        }
    }
}
