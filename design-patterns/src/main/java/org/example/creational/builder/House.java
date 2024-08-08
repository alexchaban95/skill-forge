package org.example.creational.builder;

public class House {

    private int floors;
    private boolean hasGarage;
    private boolean hasSwimmingPool;

    private House(Builder builder) {
        this.floors = builder.floors;
        this.hasGarage = builder.hasGarage;
        this.hasSwimmingPool = builder.hasSwimmingPool;
    }

    public static class Builder {
        private int floors;
        private boolean hasGarage;
        private boolean hasSwimmingPool;

        public Builder setFloors(int floors) {
            this.floors = floors;
            return this;
        }

        public Builder setGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public Builder setSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

    @Override
    public String toString() {
        return "House{" +
                "floors=" + floors +
                ", hasGarage=" + hasGarage +
                ", hasSwimmingPool=" + hasSwimmingPool +
                '}';
    }
}
