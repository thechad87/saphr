package org.sapsystems.domain.users;

/**
 * Created by ChadMarthinussen2 on 2019/08/07.
 */
public class EmployeeGender {

    private String employeeID;
    private String genderID;

    public EmployeeGender() {
    }

    public EmployeeGender(Builder builder) {
        this.employeeID = builder.employeeID;
        this.genderID = builder.genderID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setGenderID(String genderID) {
        this.genderID = genderID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getGenderID() {
        return genderID;
    }

    @Override
    public String toString() {
        return "EmployeeGender{" +
                "employeeID='" + employeeID + '\'' +
                ", genderID='" + genderID + '\'' +
                '}';
    }


    public static class Builder{

        private String employeeID;
        private String genderID;

        public Builder employeeID(String employeeID) {
            this.employeeID = employeeID;
            return this;
        }

        public Builder genderID(String genderID) {
            this.genderID = genderID;
            return this;
        }

        public EmployeeGender build(){
                return new EmployeeGender(this);

        }

        public Builder copy(EmployeeGender employeeGender){
            this.employeeID = employeeID;
            this.genderID = genderID;
            return this;
        }
    }

}
