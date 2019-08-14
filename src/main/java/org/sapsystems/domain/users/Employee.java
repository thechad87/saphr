package org.sapsystems.domain.users;

/**
 * Created by ChadMarthinussen2 on 2019/08/07.
 */
public class Employee {

    private String firstName, lastName, employeeID;


    public Employee() {
    }

    public Employee(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.employeeID = builder.employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employeeID='" + employeeID + '\'' +
                '}';
    }

    public static class Builder{

        private String firstName, lastName, employeeID;

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder employeeID(String employeeID) {
            this.employeeID = employeeID;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }

        public Builder copy(EmployeeGender employeeGender){
            this.employeeID = employeeID;
            this.firstName = firstName;
            this.lastName = lastName;
            return this;
        }
    }
}
