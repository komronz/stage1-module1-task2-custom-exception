package com.epam.mjc;

public class StudentManager {

  static class StudentNotFoundException extends IllegalArgumentException{
    public StudentNotFoundException(String message){
      super(message);
    }
  }

  private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

  public Student find(long studentID) throws StudentNotFoundException{
    Student id =  Student.getValueOf(studentID);
    if (id == null){
      throw new StudentNotFoundException("Could not find student with ID " + studentID);
    }
    return id;
  }

  public static void main(String[] args) {
    StudentManager manager = new StudentManager();
    manager.find(1000);
      for (int i = 0; i < IDs.length; i++) {
        Student student = manager.find(IDs[i]);
        System.out.println("Student name " + student.getName());
      }

  }
}