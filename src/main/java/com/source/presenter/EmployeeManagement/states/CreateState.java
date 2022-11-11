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
import javax.swing.JOptionPane;

/**
 *
 * @author busat
 */
public final class CreateState extends EmployeeManagementState {

    public CreateState(EmployeeManagementPresenter presenter) {
        super(presenter);
        initComponents();
    }

    @Override
    public void onCreate() {
        try {
            presenter.createEmployee();
            presenter.setState(new UpdateState(presenter));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios.");
        }
    }

    @Override
    public void initComponents() {
        presenter.clearScreen();
        view.getBtnCreate().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                presenter.getState().onCreate();
            }
        });
        view.getComboRole().setSelectedIndex(0);
        view.getBtnCreate().setVisible(true);
        view.getBtnDelete().setVisible(false);
        view.getBtnUpdate().setVisible(false);
    }
}
