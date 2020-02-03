package com.walderman.guitartools;

public enum Note {
    A("A"),
    Ab("Ab"),
    B("B"),
    Bb("Bb"),
    C("C"),
    D("D"),
    Db("Db"),
    E("E"),
    Eb("Eb"),
    F("F"),
    G("G"),
    Gb("Gb");

    private String name;
    Note(String note) {
        this.name = note;
    }

    public String getName(){
        return name;
    }
}
