package no.difi.dc2017.idporteneventapi.model;

/**
 * Created by camp-oob on 23.06.2017.
 */
public class ServiceData {

    private String description;

    private boolean isUsed;

    public ServiceData(String description, boolean isUsed){
        this.description= description;
        this.isUsed = isUsed;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    public String getDescription() {

        return description;
    }

    public boolean isUsed() {
        return isUsed;
    }
}
