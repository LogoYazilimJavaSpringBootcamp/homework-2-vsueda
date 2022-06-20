package Homework2AbstractFactoryPattern;

public class MathStudentsFactory extends ClassroomFactory{
    @Override
    public School useClassroom() {
        return new MathStudents();
    }
}
