package Homework2AbstractFactoryPattern;

public class SchoolFactory {
    private ClassroomFactory classroomFactory;
    private School school;

    public SchoolFactory(ClassroomFactory classroomFactory) {
        this.classroomFactory = classroomFactory;
        school=classroomFactory.useClassroom();
    }
}
