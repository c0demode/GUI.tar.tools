package com.walderman.guitartools;

// Represents a position on the guitar neck
public enum Fret {
    FRET_X(-1),
    FRET_0(0),
    FRET_1(1),
    FRET_2(2),
    FRET_3(3),
    FRET_4(4),
    FRET_5(5),
    FRET_6(6),
    FRET_7(7),
    FRET_8(8),
    FRET_9(9),
    FRET_10(10),
    FRET_11(11),
    FRET_12(12),
    FRET_13(13),
    FRET_14(14),
    FRET_15(15),
    FRET_16(16),
    FRET_17(17),
    FRET_18(18),
    FRET_19(19),
    FRET_20(20),
    FRET_21(21),
    FRET_22(22);

    private final int fretnum;


    Fret(int fretnum) {
        this.fretnum = fretnum;
    }

    public Fret GetFretnum(Fret fret){
        return fret;
    }
    public int GetFretValue() {return fretnum;}
}