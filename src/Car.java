public class Car {
    private String name;
    private String fuel;
    private boolean automatic;
    private Integer numberWheels;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    public Integer getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(Integer numberWheels) {
        this.numberWheels = numberWheels;
    }

    @Override
    public String toString() {
        return "" +
                "name = '" + name + '\'' +
                ", fuel = '" + fuel + '\'' +
                ", automatic = " + automatic +
                ", numberWheels = " + numberWheels +
                '}';
    }
}
