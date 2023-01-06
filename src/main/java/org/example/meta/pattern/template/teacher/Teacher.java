package org.example.meta.pattern.template.teacher;

public abstract class Teacher {
    private void 입장하기() {
        System.out.println("입장하기");
    }

    private void 출석부르기() {
        System.out.println("출석 부르기");
    }

    // 오버라이드 => 부모의 메서드를 무효화 하다
    abstract void 강의하기();

    private void 퇴장하기() {
        System.out.println("퇴장하기");
    }

    public void 수업시작() {
        입장하기();
        출석부르기();
        강의하기();
        퇴장하기();
    }
}
