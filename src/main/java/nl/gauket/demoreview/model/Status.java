package nl.gauket.demoreview.model;

public class Status {
    String status;

    public Status() {
        status= "200 OK";
    }

    public Status(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
