package com.employee.Exception;

import java.util.Date;

public class ExceptionResponse {

    private Date date;

    @Override
    public String toString() {
        return "ExceptionResponse{" +
                "date=" + date +
                ", meassage='" + meassage + '\'' +
                ", details='" + details + '\'' +
                '}';
    }

    private String meassage;

    public ExceptionResponse(Date date, String meassage, String details) {
        this.date = date;
        this.meassage = meassage;
        this.details = details;
    }

    private String details;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMeassage() {
        return meassage;
    }

    public void setMeassage(String meassage) {
        this.meassage = meassage;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

}
