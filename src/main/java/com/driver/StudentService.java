package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
@Autowired
StudentRepository r;

    public boolean addStudent(Student st){
        boolean ans=r.addStudent(st);
        return ans;
    }
    public boolean addTeacher(Teacher te){
        boolean ans=r.addTeacher(te);
        return ans;
    }

    public boolean addPair(String st,String te){
        boolean ans=r.addPair(st,te);
        return ans;
    }

    public Student checkStudent(String st){
        Student ans=r.checkStudent(st);
        return ans;
    }

    public Teacher checkTeacher(String st){
        Teacher ans=r.checkTeacher(st);
        return ans;
    }

}
