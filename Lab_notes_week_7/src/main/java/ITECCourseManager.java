public class ITECCourseManager {
    public static void main(String[] args) {
        ITECCourse MaintenanceCourse = new ITECCourse("Microsoft Systems Maintenance", 1310, 20);


        MaintenanceCourse.addStudent("Ana");
        MaintenanceCourse.addStudent("Bill");
        MaintenanceCourse.addStudent("Carl");

        MaintenanceCourse.removeStudent("Carl");
        MaintenanceCourse.removeStudent("Martha");

        MaintenanceCourse.writeCourseInfo();

        ITECCourse datacomCourse = new ITECCourse("Data Communication", 1425, 30);

        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");

        datacomCourse.writeCourseInfo();

        ITECCourse softwareDevelopmentProjects = new ITECCourse("Software Development Projects", 2903, 24);
        softwareDevelopmentProjects.addStudent("Gus");
        softwareDevelopmentProjects.addStudent("Harry");
        softwareDevelopmentProjects.addStudent("Izzy");
        softwareDevelopmentProjects.addStudent("Jake");

        int totalEnrolled = softwareDevelopmentProjects.getNumberOfStudents();
        System.out.println("The " + softwareDevelopmentProjects.getName() + " class has " + totalEnrolled + " students");
        System.out.println("ItEC " + softwareDevelopmentProjects.getCode() + " " + softwareDevelopmentProjects.getName());

        ITECCourse smallCourse = new ITECCourse(" Made up" , 1234, 3);
        smallCourse.addStudent("Kirby");
        smallCourse.addStudent("John");
        smallCourse.addStudent("Mary");
        smallCourse.removeStudent("Kirby");
        smallCourse.addStudent("Michael");
        smallCourse.writeCourseInfo();
    }
}
