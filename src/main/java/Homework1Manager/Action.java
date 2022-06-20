package Homework1Manager;

import java.util.ArrayList;

public class Action<E> implements IAction {

    ArrayList<E> list = new ArrayList<E>();

    @Override
    public void add(Object object) {
        this.list.add((E) object);
    }

    @Override
    public Object getId(int objectId) {
        return this.list.get(objectId);
    }

    @Override
    public ArrayList<E> getList() {
        return this.list;
    }
}
