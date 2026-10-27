void main() {
    Student student = new Student("Иванов Иван Иванович", "студент", "student1", "123", 18);
    Student student1 = new Student("Металгир Татьяна Алексеевна", "студент", "student2", "1233", 20);
    Teacher teacher = new Teacher("Сидоров Михаил Юрьевич", "преподаватель", "teacher1", "123123", 57);
    Teacher teacher1 = new Teacher("Александр Александров Александрович", "преподаватель", "teacher2", "1231233", 49);

    student.setLogin("student3").setPassword("studentPassword1");
    student1.setLogin("student4").setPassword("studentPassword2");

    teacher.setLogin("teacher3").setPassword("teacherPassword1");
    teacher1.setLogin("teacher4").setPassword("teacherPassword2");

    System.out.println(student1.getAuthorization("student2", "1233"));
    System.out.println(student.getAuthorization("student3", "studentPassword1"));
    System.out.println(teacher1.getAuthorization("teacher4", "teacherPassword2"));
    System.out.println(teacher.getAuthorization("teacher1", "123123"));
}
