package Homework1Manager;

import java.util.ArrayList;

public interface IAction<E> {

    void add(E object);

    E getId(int objectId);

    ArrayList<E> getList();


}
