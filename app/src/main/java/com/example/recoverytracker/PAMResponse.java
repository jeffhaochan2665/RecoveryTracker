package com.example.recoverytracker;

import java.util.Date;

public class PAMResponse {

    private Integer imageID;
    private Date date;

    private static final PAMResponse pamResponse = new PAMResponse();

    public static PAMResponse getInstance() { return PAMResponse.pamResponse; }

    public Integer getImageID() { return imageID; }

    public void setImageID(Integer id) {
        imageID = id;
        date = new Date();
    }

    public Date getDate() { return date; }

    public boolean hasResponded() { return imageID != null; }

    public void clear() { imageID = null; }
}
