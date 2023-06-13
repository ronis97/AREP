package edu.eci.arep.project.trafficApi.model;

public class Solution {

    private int solutionId;
    private String solutionName;
    private String additionDate;

    public Solution() {}

    public Solution(int solutionId, String solutionName, String additionDate) {
        this.solutionId = solutionId;
        this.solutionName = solutionName;
        this.additionDate = additionDate;
    }

    public int getSolutionId() {
        return solutionId;
    }

    public void setSolutionId(int solutionId) {
        this.solutionId = solutionId;
    }

    public String getSolutionName() {
        return solutionName;
    }

    public void setSolutionName(String solutionName) {
        this.solutionName = solutionName;
    }

    public String getAdditionDate() {
        return additionDate;
    }

    public void setAdditionDate(String additionDate) {
        this.additionDate = additionDate;
    }

    @Override
    public String toString() {
        return "Solution{" +
                "solutionId=" + solutionId +
                ", solutionName='" + solutionName + '\'' +
                ", additionDate='" + additionDate + '\'' +
                '}';
    }
}