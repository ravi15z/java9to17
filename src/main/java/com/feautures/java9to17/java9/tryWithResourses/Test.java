package com.feautures.java9to17.java9.tryWithResourses;

public class Test implements AutoCloseable {

    Test() {
        System.out.println("Creating Resourses");
    }

    @Override
    public void close() throws Exception {
        System.out.println("closing the resourses");
    }

}
