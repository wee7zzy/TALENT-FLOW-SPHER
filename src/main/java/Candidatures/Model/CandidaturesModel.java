package Candidatures.Model;

public class CandidaturesModel {
    private int jobid;
    private String status;
    private int condidatId;

    public CandidaturesModel(int jobid, String status, int condidatId) {
        this.jobid = jobid;
        this.status = status;
        this.condidatId = condidatId;
    }

    public int getJobid() {
        return jobid;
    }

    public void setJobid(int jobid) {
        this.jobid = jobid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCondidatId() {
        return condidatId;
    }

    public void setCondidatId(int condidatId) {
        this.condidatId = condidatId;
    }

    @Override
    public String toString() {
        return "CandidaturesModel{" +
                "jobid=" + jobid +
                ", status='" + status + '\'' +
                ", condidatId=" + condidatId +
                '}';
    }
}





