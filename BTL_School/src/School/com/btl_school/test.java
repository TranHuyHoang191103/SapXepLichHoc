/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package School.com.btl_school;

import School.com.DAO.CourseDAO;
import School.com.DAO.GiangVienDAO;
import School.com.DAO.RoomDAO;
import School.com.DAO.StudentGroupDAO;
import School.com.Modal.Course;
import School.com.Modal.Data;
import School.com.Modal.Room;
import School.com.Modal.Schedule;
import School.com.Modal.StudentGroup;
import School.com.Modal.Teacher;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author 84397
 */
public class test {
    public static void main(String [] args){
         GiangVienDAO teacherDA0=new GiangVienDAO();
        StudentGroupDAO studentGroupDAO=new StudentGroupDAO();
        ArrayList<Teacher>teachers=teacherDA0.get();
        RoomDAO roomDAO=new RoomDAO();
        int ki=1;
        int nam=2024;
        ArrayList<StudentGroup> studentGroups=studentGroupDAO.getList(nam,ki);
        CourseDAO courseDAO=new CourseDAO();
        HashMap<String,Course> courses=courseDAO.getList();
        ArrayList<Room>rooms=roomDAO.getList();
        Data data = new Data(teachers, rooms, studentGroups, courses);
        for(Room it:rooms)
            System.out.println(it.toString());
        for(Teacher it:teachers)
            System.out.println(it.toString());
        for(StudentGroup it:studentGroups)
            System.out.println(it.toString());
        for (Map.Entry<String, Course> entry : courses.entrySet()){
            String key = entry.getKey();
            Course course = entry.getValue();
            System.out.println(key+" "+course.toString());
        }
        System.exit(0);
        // Generate initial population
        List<Schedule> population = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Schedule schedule = new Schedule(data);
            schedule.initialize();
            population.add(schedule);
        }

        // Genetic algorithm loop
        while (true) {
            population.sort(Schedule::compareTo);
                System.out.println(population.get(0).getFitness());
            if (population.get(0).getFitness()>= 1) {
                population.get(0).display();
                break;
            }

            List<Schedule> newGeneration = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                newGeneration.add(population.get(i));
            }

            Random random = new Random();
            for (int i = 0; i < 90; i++) {
                int index1 = random.nextInt(population.size());
                int index2 = random.nextInt(population.size());

                Schedule offspring = population.get(index1).mate(population.get(index2));
                newGeneration.add(offspring);
            }

            population = newGeneration;
        }
        
    }
}
