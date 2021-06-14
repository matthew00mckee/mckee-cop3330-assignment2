/*
*  UCF COP3330 Summer 2021 Assignment 2 Solution
*  Copyright 2021 Matthew McKee
*/

package ex39;

public class employeeSort {
    private String firstName;
    private String lastName;
    private String position;
    private String leaveDate;

    public employeeSort(String firstName, String lastName, String position, String leaveDate ) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.position=position;
        this.leaveDate=leaveDate;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setLeaveDate(String leaveDate) {
        this.leaveDate = leaveDate;
    }

    public String getLeaveDate() {
        return leaveDate;
    }

    @Override
    public String toString(){
        return String.format("%-11s | %-11s | %-11s |%-11s",
                getFirstName(),getLastName(),getPosition(),getLeaveDate());
    }
}
