package nl.gauket.demoreview.model;

public class Status {
    private String value;

    public Status() {
        this.value = "200 OK";
    }

    public Status(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
