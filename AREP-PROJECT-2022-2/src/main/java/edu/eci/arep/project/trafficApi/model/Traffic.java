package edu.eci.arep.project.trafficApi.model;

public class Traffic {

    private String sectionId;
    private String reportDatetime;
    private float averageSpeed;

    public Traffic() {}

    public Traffic(String sectionId, String reportDatetime, float averageSpeed) {
        this.sectionId = sectionId;
        this.reportDatetime = reportDatetime;
        this.averageSpeed = averageSpeed;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public String getReportDatetime() {
        return reportDatetime;
    }

    public void setReportDatetime(String reportDatetime) {
        this.reportDatetime = reportDatetime;
    }

    public float getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(float averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    @Override
    public String toString() {
        return "Traffic{" +
                "sectionId='" + sectionId + '\'' +
                ", reportDatetime='" + reportDatetime + '\'' +
                ", averageSpeed=" + averageSpeed +
                '}';
    }
}