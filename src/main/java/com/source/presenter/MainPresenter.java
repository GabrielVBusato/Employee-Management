/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.source.presenter;

import com.source.dbConnection.connections.IDatabaseConnection;
import com.source.presenter.EmployeeManagement.EmployeeManagementPresenter;
import com.source.view.MainView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author busat
 */
public class MainPresenter {
    private static final MainView view = new MainView();
    private final IDatabaseConnection connection;
    
    public MainPresenter(IDatabaseConnection connection){
        this.connection = connection;
        view.setVisible(true);
        initComponents();
    }
    
    public void setViewVisible(){
        view.setVisible(true);
    }
    
    
    private void initComponents(){
        view.getMenuItemCreateEmployee().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                new EmployeeManagementPresenter(connection);
            }            
        });
    }
}
