/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.source.presenter.EmployeeManagement;

import com.source.view.EmployeeManagementView;
import javax.swing.JOptionPane;

/**
 *
 * @author busat
 */
public abstract class EmployeeManagementState {

    public EmployeeManagementPresenter presenter;
    private final String operationErr = "Operação não permitida nesse estado";
    protected final EmployeeManagementView view;

    public EmployeeManagementState(EmployeeManagementPresenter presenter) {
        this.presenter = presenter;
        this.view = presenter.getView();
    }

    public abstract void initComponents();

    public void onUpdate() {
        JOptionPane.showMessageDialog(null, operationErr);
    }

    public void onCreate() {
        JOptionPane.showMessageDialog(null, operationErr);
    }

    public void onDelete() {
        JOptionPane.showMessageDialog(null, operationErr);
    }

    public void onInit() {
        JOptionPane.showMessageDialog(null, operationErr);
    }
}
