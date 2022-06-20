package Homework2AbstractFactoryPattern;

public class EnglishStudentsFactory extends ClassroomFactory{
    @Override
    public School useClassroom() {
        return new EnglishStudents();
    }
}
