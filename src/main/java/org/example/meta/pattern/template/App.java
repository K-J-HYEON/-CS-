package org.example.meta.pattern.template;

import org.example.meta.pattern.template.teacher.JavaTeacher;
import org.example.meta.pattern.template.teacher.PythonTeacher;
import org.example.meta.pattern.template.teacher.Teacher;

public class App {
    public static void start(Teacher t) {
        t.수업시작();
    }

    public static void main(String[] args) {
        JavaTeacher t1 = new JavaTeacher();
        start(t1);

        PythonTeacher t2 = new PythonTeacher();
        start(t2);
    }

}
