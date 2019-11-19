package model.services;

import java.util.ArrayList;
import java.util.List;
import model.entities.Department;

public class DepartmentService {

    public List<Department> findAll() {
        List<Department> departments = new ArrayList<>();
        departments.add(new Department(1, "TI"));
        departments.add(new Department(2, "PCP"));
        departments.add(new Department(3, "DP"));

        return departments;
    }

}
