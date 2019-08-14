package org.sapsystems.domain.demography;

/**
 * Created by ChadMarthinussen2 on 2019/08/07.
 */
public class Race {

    private String raceID;
    private String raceType;


    public Race() {
    }

    public Race(Builder builder) {
        this.raceID = builder.raceID;
        this.raceType = builder.raceType;
    }

    public void setRaceType(String raceType) {
        this.raceType = raceType;
    }

    public String getRaceID() {
        return raceID;
    }

    public String getRaceType() {
        return raceType;
    }

    @Override
    public String toString() {
        return "Race{" +
                "raceID='" + raceID + '\'' +
                ", raceType='" + raceType + '\'' +
                '}';
    }


    public static class Builder{

        private String raceID;
        private String raceType;

        public Builder raceID(String raceID) {
            this.raceID = raceID;
            return this;
        }

        public Builder raceType(String raceType) {
            this.raceType = raceType;
            return this;
        }

        public Race build(){
            return new Race(this);
        }

        public Builder copy(Race race){
            this.raceType = raceType;
            this.raceID = raceID;
            return this;
        }

    }
}
