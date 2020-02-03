package com.walderman.guitartools;

//Represents a Chord
public class Chord {

    private String chordName;

    private Note root;
    private Note second;
    private Note third;
    private Note fourth;
    private Note fifth;
    private Note sixth;
    private Note seventh;

    private Fret lowestFret;
    private Fret string1Fret; // High E string
    private Fret string2Fret; // B string
    private Fret string3Fret; // G string
    private Fret string4Fret; // D string
    private Fret string5Fret; // A string
    private Fret string6Fret; // Low E string

    public Chord() {
    }

    // Take a ChordType and a root note
    // Assign the notes belonging in the chord according to music theory
    // I need to add functionality to the Note enum to get the next note.
    // It needs to support 'circling' back around to the A note if we reach the end.
    public Chord(ChordType chordType, Note rootNote){
        switch(chordType){
            case MAJOR:
                chordName = rootNote.getName() + " Major";
                root = rootNote;
                int iThird = rootNote.ordinal() + 2;
                third = Note.values()[iThird];
        }

    }
    // create a chord. Pass the name of a chord along with the fret position for each string
    // starting from the high E (thinnest)
    public Chord(String chordName, Fret string1, Fret string2, Fret string3, Fret string4, Fret string5, Fret string6) {
        this.chordName = chordName;
        this.string1Fret = string1;
        this.string2Fret = string2;
        this.string3Fret = string3;
        this.string4Fret = string4;
        this.string5Fret = string5;
        this.string6Fret = string6;
    }

    // Takes a guitar string as an argument.
    // Returns the fret value for that string
    public Fret getFretForString(GuitarString stringNum){
        switch (stringNum){
            case STRING_1: return string1Fret;
            case STRING_2: return string2Fret;
            case STRING_3: return string3Fret;
            case STRING_4: return string4Fret;
            case STRING_5: return string5Fret;
            default      : return string6Fret;
        }
    }

    // Check the Fret number of each string.
    // Return the lowest Fret.
    // Used to determine position of a chord on the neck of the guitar
    private Fret getLowestFret() {
        Fret lowestFret = Fret.FRET_22; // on my guitar, 22 is the highest fret

        if(this.string1Fret.GetFretValue() < lowestFret.GetFretValue()){
            lowestFret = string1Fret;
        }
        if(this.string2Fret.GetFretValue() < lowestFret.GetFretValue()){
            lowestFret = string2Fret;
        }
        if(this.string3Fret.GetFretValue() < lowestFret.GetFretValue()){
            lowestFret = string3Fret;
        }
        if(this.string4Fret.GetFretValue() < lowestFret.GetFretValue()){
            lowestFret = string4Fret;
        }
        if(this.string5Fret.GetFretValue() < lowestFret.GetFretValue()){
            lowestFret = string5Fret;
        }
        if(this.string6Fret.GetFretValue() < lowestFret.GetFretValue()){
            lowestFret = string6Fret;
        }
        return lowestFret;
    }


}
