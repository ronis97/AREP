package edu.eci.arep.project.trafficApi.model;

public class StreetSection {

    private int sectionId;
    private String streetName;
    private String startOfTheSection;
    private String endOfTheSection;
    private int numberOfRoads;
    private boolean isMainStreet;
    private boolean isTwoWay;
    private boolean isUnderConstruction;

    public StreetSection() {}

    public StreetSection(int sectionId, String streetName, String startOfTheSection, String endOfTheSection,
                         int numberOfRoads, boolean isMainStreet, boolean isTwoWay, boolean isUnderConstruction) {
        this.sectionId = sectionId;
        this.streetName = streetName;
        this.startOfTheSection = startOfTheSection;
        this.endOfTheSection = endOfTheSection;
        this.numberOfRoads = numberOfRoads;
        this.isMainStreet = isMainStreet;
        this.isTwoWay = isTwoWay;
        this.isUnderConstruction = isUnderConstruction;
    }

    public int getSectionId() {
        return sectionId;
    }

    public void setSectionId(int sectionId) {
        this.sectionId = sectionId;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStartOfTheSection() {
        return startOfTheSection;
    }

    public void setStartOfTheSection(String startOfTheSection) {
        this.startOfTheSection = startOfTheSection;
    }

    public String getEndOfTheSection() {
        return endOfTheSection;
    }

    public void setEndOfTheSection(String endOfTheSection) {
        this.endOfTheSection = endOfTheSection;
    }

    public int getNumberOfRoads() {
        return numberOfRoads;
    }

    public void setNumberOfRoads(int numberOfRoads) {
        this.numberOfRoads = numberOfRoads;
    }

    public boolean isMainStreet() {
        return isMainStreet;
    }

    public void setMainStreet(boolean mainStreet) {
        isMainStreet = mainStreet;
    }

    public boolean isTwoWay() {
        return isTwoWay;
    }

    public void setTwoWay(boolean twoWay) {
        isTwoWay = twoWay;
    }

    public boolean isUnderConstruction() {
        return isUnderConstruction;
    }

    public void setUnderConstruction(boolean underConstruction) {
        isUnderConstruction = underConstruction;
    }

    @Override
    public String toString() {
        return "StreetSection{" +
                "sectionId=" + sectionId +
                ", streetName='" + streetName + '\'' +
                ", startOfTheSection='" + startOfTheSection + '\'' +
                ", endOfTheSection='" + endOfTheSection + '\'' +
                ", numberOfRoads=" + numberOfRoads +
                ", isMainStreet=" + isMainStreet +
                ", isTwoWay=" + isTwoWay +
                ", isUnderConstruction=" + isUnderConstruction +
                '}';
    }
}