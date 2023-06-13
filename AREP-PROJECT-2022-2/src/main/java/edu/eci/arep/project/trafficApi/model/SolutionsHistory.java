package edu.eci.arep.project.trafficApi.model;

public class SolutionsHistory {

    private int solutionsHistoryId;
    private int sectionId;
    private String reportDatetime;
    private int proposedSolution;
    private float successRate;

    public SolutionsHistory() {}

    public SolutionsHistory(int solutionsHistoryId, int sectionId, String reportDatetime, int proposedSolution, float successRate) {
        this.solutionsHistoryId = solutionsHistoryId;
        this.sectionId = sectionId;
        this.reportDatetime = reportDatetime;
        this.proposedSolution = proposedSolution;
        this.successRate = successRate;
    }

    public int getSolutionsHistoryId() {
        return solutionsHistoryId;
    }

    public void setSolutionsHistoryId(int solutionsHistoryId) {
        this.solutionsHistoryId = solutionsHistoryId;
    }

    public int getSectionId() {
        return sectionId;
    }

    public void setSectionId(int sectionId) {
        this.sectionId = sectionId;
    }

    public String getReportDatetime() {
        return reportDatetime;
    }

    public void setReportDatetime(String reportDatetime) {
        this.reportDatetime = reportDatetime;
    }

    public int getProposedSolution() {
        return proposedSolution;
    }

    public void setProposedSolution(int proposedSolution) {
        this.proposedSolution = proposedSolution;
    }

    public float getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(float successRate) {
        this.successRate = successRate;
    }

    @Override
    public String toString() {
        return "SolutionsHistory{" +
                "solutionsHistoryId=" + solutionsHistoryId +
                ", sectionId=" + sectionId +
                ", reportDatetime='" + reportDatetime + '\'' +
                ", proposedSolution=" + proposedSolution +
                ", successRate=" + successRate +
                '}';
    }
}