/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.source.repository;

import com.source.dao.EmployeeDao;
import com.source.dbConnection.connections.IDatabaseConnection;
import com.source.dto.EmployeeDTO;
import com.source.model.EmployeeModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author busat
 */
public class EmployeeRepository {

    private final EmployeeDao employeeDao;
    private final IDatabaseConnection connection;

    public EmployeeRepository(IDatabaseConnection connection) {
        employeeDao = new EmployeeDao(connection);
        this.connection = connection;
    }

    public void deleteEmployeeById(int id) throws SQLException {
        employeeDao.delete(id);
    }

    public EmployeeModel findEmployee(int id) throws SQLException {
        ResultSet result = employeeDao.read(id);
        EmployeeModel employee = new EmployeeModel();
        while (result.next()) {
            employee.setId(result.getInt("id"));
            employee.setName(result.getString("name"));
            employee.setRole(result.getString("role"));
            employee.setBaseSalary(result.getFloat("base_salary"));
            employee.setDistanceFromWork(result.getFloat("distance_from_work"));
            employee.setServiceTime(result.getFloat("service_time"));
            employee.setCreatedAt(result.getString("created_at"));
            employee.setTotalAbsencesFromWork(result.getInt("absences_from_work"));
        }
        connection.disconnect();
        return employee;
    }

    public int createEmployee(EmployeeDTO employee) throws SQLException {
        return employeeDao.create(employee);
    }

    public void modifyEmployee(EmployeeDTO employee) throws SQLException {
        employeeDao.update(employee);
    }

    public List<EmployeeModel> getAllEmployees() throws SQLException {
        ResultSet result = employeeDao.getAll();
        List<EmployeeModel> employees = new ArrayList<>();
        while (result.next()) {
            EmployeeModel employee = new EmployeeModel();
            employee.setId(result.getInt("id"));
            employee.setName(result.getString("name"));
            employee.setRole(result.getString("role"));
            employee.setBaseSalary(result.getFloat("base_salary"));
            employee.setDistanceFromWork(result.getFloat("distance_from_work"));
            employee.setServiceTime(result.getFloat("service_time"));
            employee.setCreatedAt(result.getString("created_at"));
            employee.setTotalAbsencesFromWork(result.getInt("absences_from_work"));
            employees.add(employee);
        }
        connection.disconnect();
        return employees;
    }

    public Collection<String> getAllRoles() throws SQLException {
        ResultSet result = employeeDao.getAllRoles();
        Collection roles = new ArrayList();
        while (result.next()) {
            if (!roles.contains(result.getString("role"))) {
                System.out.println(result.getString("role"));
                roles.add(result.getString("role"));
            }
        }
        connection.disconnect();
        return roles;
    }
}
