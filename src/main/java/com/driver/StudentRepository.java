package com.driver;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class StudentRepository {
   private HashMap<String, Student> st = new HashMap<>();
   private HashMap<String, Teacher> te = new HashMap<>();
  private   HashMap<String, ArrayList<String>>ar=new HashMap<>();

    public boolean addStudent(Student s){
        String name=s.getName();
        if(name==null){
            return false;
        }else{
            st.put(name,s)  ;
            return true;
        }
    }


    public Student checkStudent(String s){
       // String name=s.getName();
        if(st.containsKey(s)){
            return st.get(s);
        }else{
            return null;
        }
    }

    public Teacher checkTeacher(String s){
        // String name=s.getName();
        if(te.containsKey(s)){
            return te.get(s);
        }else{
            return null;
        }

    }
    public boolean addTeacher(Teacher t){
        String name=t.getName();

        if(name==""||name==null){
            return false;
        }else{
            te.put(name,t);

            return true;

        }
    }


    public boolean addPair(String sname,String tname){
        if(st.containsKey(sname)==true&&te.containsKey(tname)==true){
            if(ar.containsKey(tname)){
                ArrayList<String>e=ar.get(tname);
                e.add(sname);
                ar.put(tname,e);
            }else{
                ArrayList<String>a=new ArrayList<>();
                a.add(sname);
                ar.put(tname,a);
            }
            return true;
        }else{
            return false;
        }
    }


}