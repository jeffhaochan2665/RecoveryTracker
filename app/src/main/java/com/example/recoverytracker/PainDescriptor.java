package com.example.recoverytracker;

public enum PainDescriptor {

    MILD ("Mild"),
    DISCOMFORTING ("Discomforting"),
    DISTRESSING ("Distressing"),
    HORRIBLE ("Horrible"),
    EXCRUCIATING ("Excruciating");

    public final String description;

    PainDescriptor(String description) {
        this.description = description;
    }
}
