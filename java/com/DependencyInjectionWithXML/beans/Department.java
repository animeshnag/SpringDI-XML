package com.animesh;
import java.util.Date;

public class Department {

    private String deptName;
    private Date createdOn;

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
    public String toString() {
        return deptName + "\n" + createdOn;  // + "\nDate\n" + date;
    }
}
