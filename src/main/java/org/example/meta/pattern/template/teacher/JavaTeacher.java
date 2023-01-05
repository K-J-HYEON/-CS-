package org.example.meta.pattern.template.teacher;

public class JavaTeacher {
    private void 입장하기() {
        System.out.println("입장하기");
    }

    private void 출석부르기() {
        System.out.println("출석 부르기");
    }

    private void 퇴장하기() {
        System.out.println("퇴장하기");
    }

    public void 수업시작() {
        입장하기();
        출석부르기();
        퇴장하기();
    }
}
