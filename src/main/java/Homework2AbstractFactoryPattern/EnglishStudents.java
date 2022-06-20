package Homework2AbstractFactoryPattern;

public class EnglishStudents extends School{
    @Override
    public boolean classroomFree() {
        System.out.println("Ingilizce dersi basladi.");
        return false;
    }

    @Override
    public boolean classroomFull() {
        System.out.println("Ingilizce dersi bitti.");
        return false;
    }
}
