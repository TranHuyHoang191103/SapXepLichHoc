/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package School.com.Modal;

/**
 *
 * @author DO BINH
 */
public class ClassModel {
     private Teacher teacher;
    private Room room;
    private StudentGroup studentGroup;
    private ClassTime classTime;
    private Course course;

    public ClassModel(Teacher teacher, Room room, StudentGroup studentGroup, Course course) {
        this.teacher = teacher;
        this.room = room;
        this.studentGroup = studentGroup;
        this.classTime = new ClassTime(course.getNumberOfLesson());
        this.course = course;
    }

  

     public ClassModel(){
    }
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public ClassTime getClassTime() {
        return classTime;
    }

    public void setClassTime(ClassTime classTime) {
        this.classTime = classTime;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

   
    
}
