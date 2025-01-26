package dev.capp.model;

import org.springframework.stereotype.Component;

@Component
public class Train {

    private int trainId;
    private String nameCompany;
    private String trainCode;
    private int year;

    public Train() {
    }

    public Train (int trainId, String nameCompany, String trainCode, int year) {
        this.trainId = trainId;
        this.nameCompany = nameCompany;
        this.trainCode = trainCode;
        this.year = year;
    }

    public int getTrainId() {
        return trainId;
    }

    public void setTrainId(int trainId) {
        this.trainId = trainId;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getTrainCode() {
        return trainCode;
    }

    public void setTrainCode(String trainCode) {
        this.trainCode = trainCode;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainId=" + trainId +
                ", nameCompany='" + nameCompany + '\'' +
                ", trainCode='" + trainCode + '\'' +
                ", year=" + year +
                '}';
    }
}
