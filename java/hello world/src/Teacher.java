//package com.dataflair.association;
class Teacher {
    private String name;

    Teacher(String name) {
        this.name = name;
    }

    public String getTeacherName() {
        return this.name;
    }
}

class Student {
    private String name;

    Student(String name) {
        this.name = name;
    }

    public String getStudentName() {
        return this.name;
    }
}

class AssociationDemo {
    public static void main(String[] args) {
        Teacher teacherObj = new Teacher("Rahul sir");
        Student studentObj = new Student("Renuka");
        System.out.println(studentObj.getStudentName() +
                " is Student of " + teacherObj.getTeacherName());
    }
}
