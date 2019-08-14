package org.sapsystems.domain.users;

/**
 * Created by ChadMarthinussen2 on 2019/08/14.
 */
public class EmployeeRace {

    private String employeeID, raceId;

    public EmployeeRace() {
    }

    public EmployeeRace(Builder builder) {
        this.employeeID = builder.employeeID;
        this.raceId = builder.raceId;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getRaceId() {
        return raceId;
    }


    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setRaceId(String raceId) {
        this.raceId = raceId;
    }

    @Override
    public String toString() {
        return "EmployeRace{" +
                "employeeID='" + employeeID + '\'' +
                ", raceId='" + raceId + '\'' +
                '}';
    }

    public static class Builder{

        private String employeeID, raceId;


        public Builder employeeID(String employeeID) {
            this.employeeID = employeeID;
            return this;
        }

        public Builder raceId(String raceId) {
            this.raceId = raceId;
            return this;
        }

        public EmployeeRace build(){
            return new EmployeeRace(this);
        }

        public Builder copy(EmployeeRace employeeRace){
            this.employeeID = employeeID;
            this.raceId = raceId;
            return this;
        }
    }
}
