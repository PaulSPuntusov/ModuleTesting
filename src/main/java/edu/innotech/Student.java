package edu.innotech;

import java.util.ArrayList;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@ToString @EqualsAndHashCode
public class Student {
    @Getter @Setter
    private String name;
    private List<Integer> marks = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }
    public void addMark(int mark){
        if(mark<2||mark>5) throw new IllegalArgumentException("wrong mark "+mark);
        marks.add(mark);
    }
    public List<Integer> getMarks() {
        return marks;
    }
}
