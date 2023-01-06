package org.example.meta.pattern.template.teacher;

public class PythonTeacher extends Teacher{

    // 재정의
    void 강의하기() { // 동적바인딩 (C# 동적결합)
        System.out.println("Python 강의하기");
    }
}
