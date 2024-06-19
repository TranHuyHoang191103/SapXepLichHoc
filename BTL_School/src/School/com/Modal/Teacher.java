/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package School.com.Modal;

import java.util.ArrayList;

/**
 *
 * @author DO BINH
 */
public class Teacher {
     private String id;
    private String name;
    private String degree;
    private String idOfDepartment;
    private ArrayList<String>courses;

    public Teacher(String id,String idOfDepartment,String degree, String name) {
        this.id = id;
        this.degree=degree;
        this.name = name;
        this.idOfDepartment=idOfDepartment;
    }

    @Override
    public String toString() {
        return "Teacher{" + "id=" + id + ", name=" + name + ", degree=" + degree + ", idOfDepartment=" + idOfDepartment + ", courses=" + courses + '}';
    }
    public Teacher(String id,String idOfDepartment,String degree, String name,ArrayList<String>coures) {
        this.id = id;
        this.courses=coures;
        this.degree=degree;
        this.name = name;
        this.idOfDepartment=idOfDepartment;
    }
    public String getIdOfDepartment() {
        return idOfDepartment;
    }

    public void setIdOfDepartment(String idOfDepartment) {
        this.idOfDepartment = idOfDepartment;
    }
    
    public Teacher(){
        courses=new ArrayList<String>();
    }
    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

     public boolean check(String id){
        for(int i=0;i<courses.size();i++)
            if(null == courses.get(i) ? id == null : courses.get(i).equals(id))
                return true;
        return false;
    }
    
    

}
