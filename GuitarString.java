package com.walderman.guitartools;

public enum GuitarString {
    STRING_1(1),
    STRING_2(2),
    STRING_3(3),
    STRING_4(4),
    STRING_5(5),
    STRING_6(6);

    private final int stringNum;

    private GuitarString(int stringNum) {
        this.stringNum = stringNum;
    }

    public int getStringNum(GuitarString guitarString){
        return this.stringNum;
    }
}
