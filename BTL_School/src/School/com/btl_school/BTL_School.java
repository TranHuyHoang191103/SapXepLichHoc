/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package School.com.btl_school;

import School.com.Modal.Course;
import School.com.Modal.Data;
import School.com.Modal.Room;
import School.com.Modal.Schedule;
import School.com.Modal.StudentGroup;
import School.com.Modal.Teacher;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
/**
 *
 * @author DO BINH
 */
public class BTL_School {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(new Room("123","", 35, true));
        rooms.add(new Room("234","", 40, false));
        rooms.add(new Room("235","", 40, false));
        rooms.add(new Room("236","", 40, false));
        rooms.add(new Room("124","", 40, true));
        rooms.add(new Room("125","", 40, true));

        // Add more rooms if needed

        HashMap<String, Course> courses = new HashMap<>();
        courses.put("111", new Course("111", "thuc tap lt", true, 3));
        courses.put("222", new Course("222", "huong doi tuong", false, 4));
        courses.put("112", new Course("112", "thuc tap huong doi tuong", true, 4));
        courses.put("223", new Course("223", "co so du lieu", false, 4));
        courses.put("225", new Course("225", "co so du lieu phan tan", false, 4));
        courses.put("227", new Course("227", "lap trinh .Net", false, 4));
        courses.put("229", new Course("229", "cong nghe java", false, 4));
        courses.put("226", new Course("226", "cong nghe phan mem", false, 2));

        // Add more courses if needed
        
        ArrayList<Teacher> teachers = new ArrayList<>();
ArrayList<String> courses1 = new ArrayList<>(Arrays.asList("111", "223"));
ArrayList<String> courses2 = new ArrayList<>(Arrays.asList("227", "112", "229"));
ArrayList<String> courses3 = new ArrayList<>(Arrays.asList("111", "223", "222"));
ArrayList<String> courses4 = new ArrayList<>(Arrays.asList("112", "222", "225", "226"));
ArrayList<String> courses5 = new ArrayList<>(Arrays.asList("111", "222", "112", "223"));

// Add teachers with their details
teachers.add(new Teacher("123", "1", "Hoang", "Tien si", courses1));
teachers.add(new Teacher("125", "2", "Hoang", "", courses2));
teachers.add(new Teacher("125", "3", "Hoang", "", courses3));
teachers.add(new Teacher("234", "4", "Nam", "", courses4));
teachers.add(new Teacher("235", "5", "Nam Uq", "", courses5));

        // Add more teachers if needed

        ArrayList<StudentGroup> studentGroups = new ArrayList<>();
        studentGroups.add(new StudentGroup("hs1", "111", "dhti12", 23));
        studentGroups.add(new StudentGroup("hs2", "222", "dhti11", 32));
        studentGroups.add(new StudentGroup("hs3", "223", "dhti12", 32));
        studentGroups.add(new StudentGroup("hs4", "112", "dhti10", 32));
        studentGroups.add(new StudentGroup("hs5", "223", "dhti32", 32));
        studentGroups.add(new StudentGroup("hs6", "223", "dhti11", 32));
        studentGroups.add(new StudentGroup("hs7", "225", "dhti31", 32));
        studentGroups.add(new StudentGroup("hs8", "111", "dhti32", 32));
        studentGroups.add(new StudentGroup("hs9", "223", "dhti31", 32));
        studentGroups.add(new StudentGroup("hs10", "112", "dhti30", 32));
        studentGroups.add(new StudentGroup("hs11", "111", "dhti30", 32));
        studentGroups.add(new StudentGroup("hs12", "226", "dhti12", 32));
        studentGroups.add(new StudentGroup("hs13", "222", "dhti11", 32));
        studentGroups.add(new StudentGroup("hs14", "223", "dhti11", 32));
        studentGroups.add(new StudentGroup("hs15", "111", "dhti10", 32));
        studentGroups.add(new StudentGroup("hs16", "112", "dhti9", 32));
        studentGroups.add(new StudentGroup("hs17", "227", "dhti10", 32));
        studentGroups.add(new StudentGroup("hs18", "227", "dhti9", 32));
        studentGroups.add(new StudentGroup("hs19", "227", "dht20", 32));
        studentGroups.add(new StudentGroup("hs20", "229", "dhti32", 32));
        studentGroups.add(new StudentGroup("hs21", "225", "dhti32", 32));
        studentGroups.add(new StudentGroup("hs22", "226", "dhti32", 32));
        studentGroups.add(new StudentGroup("hs23", "111", "dhti32", 32));
        studentGroups.add(new StudentGroup("hs24", "222", "dhmt23", 32));
        studentGroups.add(new StudentGroup("hs25", "225", "dhmt13", 32));
        studentGroups.add(new StudentGroup("hs26", "111", "dhmt32", 32));

        // Add more student groups if needed

        Data data = new Data(teachers, rooms, studentGroups, courses);

        // Generate initial population
        List<Schedule> population = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Schedule schedule = new Schedule(data);
            schedule.initialize();
            System.out.println(schedule.getFitness());
            
            population.add(schedule);
        }

        // Genetic algorithm loop
        while (true) {
            population.sort(Schedule::compareTo);

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
