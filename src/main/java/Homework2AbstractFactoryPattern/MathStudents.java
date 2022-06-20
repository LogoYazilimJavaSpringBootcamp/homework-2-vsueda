package Homework2AbstractFactoryPattern;

public class MathStudents extends School{
    @Override
    public boolean classroomFree() {
        System.out.println("Matematik dersi basladi.");
        return false;
    }

    @Override
    public boolean classroomFull() {
        System.out.println("Matematik dersi bitti.");
        return false;
    }
}
