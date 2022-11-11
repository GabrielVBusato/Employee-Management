/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.source.presenter.EmployeeManagement;

import com.source.dbConnection.connections.IDatabaseConnection;
import com.source.model.EmployeeModel;
import com.source.presenter.EmployeeManagement.states.CreateState;
import com.source.presenter.EmployeeManagement.states.UpdateState;
import com.source.service.EmployeeService;
import com.source.view.EmployeeManagementView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author busat
 */
public final class EmployeeManagementPresenter {

    private static EmployeeManagementView view = null;
    private EmployeeManagementState state;
    private final EmployeeService service;
    private int searchId;

    public EmployeeManagementPresenter(
            IDatabaseConnection connection) {
        if (view == null) {
            view = new EmployeeManagementView();
        }
        this.service = new EmployeeService(connection);
        initComponents();
        this.state = new CreateState(this);
        view.setVisible(true);
    }

    public EmployeeManagementPresenter(IDatabaseConnection connection,
            int id) {
        if (view == null) {
            view = new EmployeeManagementView();
        }
        view.setVisible(true);
        this.state = new UpdateState(this);
        this.service = new EmployeeService(connection);
        this.searchId = id;
    }

    public EmployeeManagementState getState() {
        return state;
    }

    public void setState(EmployeeManagementState state) {
        this.state = state;
    }

    public void createEmployee() {
        try {  
            searchId = service.createEmployee(getModel());
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void editEmployee() {
        try {
            service.editEmployee(getModel());
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void deleteEmployee() {
        try {
            service.deleteEmployeeById(searchId);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public EmployeeModel getEmployeeById(int id) {
        EmployeeModel employee = null;
        try {
            employee = service.getEmployeeById(id);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return employee;
    }

    public EmployeeManagementView getView() {
        return view;
    }

    public int getSearchId() {
        return searchId;
    }

    public void clearScreen() {
        for (ActionListener al : view.getBtnCreate().getActionListeners()) {
            view.getBtnCreate().removeActionListener(al);
        }

        for (ActionListener al : view.getBtnUpdate().getActionListeners()) {
            view.getBtnUpdate().removeActionListener(al);
        }

        view.getTxtAbsencesFromWork().setText("");
        view.getTxtDistanceFromWork().setText("");
        view.getTxtName().setText("");
        view.getTxtSalary().setText("");
        view.getTxtServiceTime().setText("");
        view.getComboRole().setSelectedIndex(-1);
    }

    public EmployeeModel getModel() {
        LocalDate dateObj = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String date = dateObj.format(formatter);
        EmployeeModel employee = new EmployeeModel();
        employee.setTotalAbsencesFromWork(Integer.parseInt(view.getTxtAbsencesFromWork().getText()));
        employee.setServiceTime(Double.parseDouble(view.getTxtServiceTime().getText()));
        employee.setDistanceFromWork(Double.parseDouble(view.getTxtDistanceFromWork().getText()));
        employee.setName(view.getTxtName().getText());
        employee.setBaseSalary(Double.parseDouble(view.getTxtSalary().getText()));
        employee.setRole((String) view.getComboRole().getSelectedItem());
        employee.setId(searchId);
        employee.setCreatedAt(date);
        return employee;
    }

    public void setModel(EmployeeModel employee) {
        DecimalFormat format = new DecimalFormat("0.#");
        view.getTxtAbsencesFromWork().setText(Integer.toString(employee.getTotalAbsencesFromWork()));
        view.getTxtDistanceFromWork().setText(format.format(employee.getDistanceFromWork()));
        view.getTxtName().setText(employee.getName());
        view.getTxtSalary().setText(format.format(employee.getBaseSalary()));
        view.getTxtServiceTime().setText(format.format(employee.getServiceTime()));
        view.getComboRole().setSelectedItem(employee.getRole());
    }

    public void initComponents() {
        view.getBtnClose().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.dispose();
            }
        });

        try {
            ArrayList<String> roles = new ArrayList(this.service.getAllRoles());
            for (String role : roles) {
                view.getComboRole().addItem(role);
            }
        } catch (SQLException e) {
            System.out.println("a");
        }
    }
}
