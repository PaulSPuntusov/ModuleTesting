package edu.innotech;

import java.util.List;

public class Tests {
    @Test
    public void marksInRange(){
        List<Integer> lst = List.of(2,3,4,5);
        Student stud = new Student("Vasya");
        stud.addMark(lst.get(0));
        stud.addMark(lst.get(1));
        stud.addMark(lst.get(2));
        stud.addMark(lst.get(3));
        if(!stud.getMarks().equals(lst))
            throw  new RuntimeException("test error");
    }
    @Test
    public void marksNotInRange(){
        List<Integer> lst = List.of(0,1,6,7);
        Student stud = new Student("Vasya");
        try{
            stud.addMark(lst.get(0));
            stud.addMark(lst.get(1));
            stud.addMark(lst.get(2));
            stud.addMark(lst.get(3));
        } catch (IllegalArgumentException e) {return;}
        throw new IllegalArgumentException("test error");

    }


}
@interface Test{};