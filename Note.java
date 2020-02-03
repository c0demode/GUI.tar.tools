package com.walderman.guitartools;

public enum Note {
    Ab("Ab"),
    A("A"),
    Bb("Bb"),
    B("B"),
    C("C"),
    Db("Db"),
    D("D"),
    Eb("Eb"),
    E("E"),
    F("F"),
    Gb("Gb"),
    G("G");

    private String name;
    Note(String note) {
        this.name = note;
    }

    public String getName(){
        return name;
    }
}
