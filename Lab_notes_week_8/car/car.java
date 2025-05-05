package Lab_notes_week_8.car;

public class car {
    private String name;
    private String make;
    private String model;
    private boolean isElectric;

    public car(String name, String make, String model, boolean isElectric) {
        this.name = name;
        this.make = make;
        this.model = model;
        this.isElectric = isElectric;
    }

    @Override
    public String toString() {
        String electricString = isElectric ? "Electric" : "Gasoline";

        return String.format("%s %s %s %s", name, make, model, electricString);
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
