package com.feautures.java9to17.java9.tryWithResourses;

public class TestMain {
    public static void main(String[] args) {
        Test test = new Test();
        try (test) {

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
