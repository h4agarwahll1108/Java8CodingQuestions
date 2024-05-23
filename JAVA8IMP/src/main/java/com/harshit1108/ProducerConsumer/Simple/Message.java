package com.harshit1108.ProducerConsumer.Simple;

public class Message {

    private int id;
    private double msg;

    public Message(int id, double msg) {
        this.id = id;
        this.msg = msg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMsg() {
        return msg;
    }

    public void setMsg(int msg) {
        this.msg = msg;
    }
}
