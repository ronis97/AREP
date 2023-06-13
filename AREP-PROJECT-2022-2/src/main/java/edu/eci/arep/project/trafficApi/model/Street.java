package edu.eci.arep.project.trafficApi.model;

public class Street {

    private String name;

    public Street() {}

    public Street(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Street{" +
                "name='" + name + '\'' +
                '}';
    }
}