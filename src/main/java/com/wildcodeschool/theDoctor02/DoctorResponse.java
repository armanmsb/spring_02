package com.wildcodeschool.theDoctor02;

public class DoctorResponse {

    private String name;
    private int id;

    public DoctorResponse(String response, int id){
        this.name = response;
        this.id = id;
    }

    public String getResponse() {
        return name;
    }

    public void setResponse(String response) {
        this.name = response;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
