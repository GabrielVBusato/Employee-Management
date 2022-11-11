/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.source.presenter.EmployeeManagement.states;

import com.source.model.EmployeeModel;
import com.source.presenter.EmployeeManagement.EmployeeManagementPresenter;
import com.source.presenter.EmployeeManagement.EmployeeManagementState;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author busat
 */
public final class UpdateState extends EmployeeManagementState {

    public UpdateState(EmployeeManagementPresenter presenter) {
        super(presenter);
        initComponents();
    }

    @Override
    public void onUpdate() {
        presenter.editEmployee();
    }
    
    @Override
    public void onDelete() {
        presenter.deleteEmployee();
    }

    @Override
    public void initComponents() {
        presenter.clearScreen();
        view.getBtnDelete().setVisible(true);
        view.getBtnUpdate().setVisible(true);
        view.getBtnCreate().setVisible(false);
        view.getBtnUpdate().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                presenter.getState().onUpdate();
            }
        });
        
        view.getBtnDelete().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                presenter.getState().onDelete();
            }
        });
        
        EmployeeModel employee = presenter.getEmployeeById(presenter.getSearchId());
        presenter.setModel(employee);
    }

}
