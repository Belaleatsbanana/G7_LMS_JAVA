package UserClass;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import BookClass.*;
public class Librarian extends User {
    private Double Salary;
    private LocalTime startTime;
    private LocalTime endTime;
    private LocalDate hireDate;

    Librarian(String username, String email, String password, String phone,
              String address, LocalDate dateOfBirth, String gender, Double salary,
              LocalTime startDate, LocalTime endDate, LocalDate hireDate) {

        super(username, email, password, phone, address, dateOfBirth, gender);

        Salary = salary;
        this.startTime = startDate;
        this.endTime = endDate;
        this.hireDate = hireDate;
    }


    public boolean createAccount(String username, String email, String password, String gender) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.address = null;
        return true;
    }



    // This method removes an inventory object from the inventory list using the Inventory ID


    public Double getSalary() {
        return Salary;
    }

    public LocalTime getStartDate() {
        return startTime;
    }

    public LocalTime getEndDate() {
        return endTime;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    public void setStartDate(LocalTime startDate) {
        this.startTime = startDate;
    }

    public void setEndDate(LocalTime endDate) {
        this.endTime = endDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public void setWorkingHour(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

}