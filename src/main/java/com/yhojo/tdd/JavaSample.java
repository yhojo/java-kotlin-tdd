package com.yhojo.tdd;

public class JavaSample {
    private final String who;
    public JavaSample(String who) {
        this.who = who;
    }
    public JavaSample() {
        this("World");
    }

    public String hello() {
        return "Hello, " + who + "!!";
    }
}
