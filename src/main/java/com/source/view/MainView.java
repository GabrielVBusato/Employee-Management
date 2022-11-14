/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.source.view;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


/**
 *
 * @author busat
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBarMain = new javax.swing.JMenuBar();
        menuEmployeeManagement = new javax.swing.JMenu();
        menuItemCreateEmployee = new javax.swing.JMenuItem();
        menuItemSearchEmployee = new javax.swing.JMenuItem();
        menuSalaryManagement = new javax.swing.JMenu();
        menuItemCalculateSalarys = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de gestão de pessoas");
        setResizable(false);

        menuBarMain.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        menuBarMain.setFocusable(false);
        menuBarMain.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        menuEmployeeManagement.setText("Funcionário");

        menuItemCreateEmployee.setText("Criar funcionário");
        menuEmployeeManagement.add(menuItemCreateEmployee);

        menuItemSearchEmployee.setText("Procurar funcionário");
        menuEmployeeManagement.add(menuItemSearchEmployee);

        menuBarMain.add(menuEmployeeManagement);

        menuSalaryManagement.setText("Salário");

        menuItemCalculateSalarys.setText("Calcular salários");
        menuSalaryManagement.add(menuItemCalculateSalarys);

        menuBarMain.add(menuSalaryManagement);

        setJMenuBar(menuBarMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 661, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 352, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public JMenuItem getMenuItemCreateEmployee() {
        return menuItemCreateEmployee;
    }

    public void setMenuItemCreateEmployee(JMenuItem menuItemCreateEmployee) {
        this.menuItemCreateEmployee = menuItemCreateEmployee;
    }

    public JMenuItem getMenuItemSearchEmployee() {
        return menuItemSearchEmployee;
    }

    public void setMenuItemSearchEmployee(JMenuItem menuItemSearchEmployee) {
        this.menuItemSearchEmployee = menuItemSearchEmployee;
    }

    public JMenu getMenuSalaryManagement() {
        return menuSalaryManagement;
    }

    public void setMenuSalaryManagement(JMenu menuSalaryManagement) {
        this.menuSalaryManagement = menuSalaryManagement;
    }

    public JMenuBar getMenuBarMain() {
        return menuBarMain;
    }

    public void setMenuBarMain(JMenuBar menuBarMain) {
        this.menuBarMain = menuBarMain;
    }

    public JMenu getMenuEmployeeManagement() {
        return menuEmployeeManagement;
    }

    public void setMenuEmployeeManagement(JMenu menuEmployeeManagement) {
        this.menuEmployeeManagement = menuEmployeeManagement;
    }

    public JMenuItem getMenuItemCalculateSalarys() {
        return menuItemCalculateSalarys;
    }

    public void setMenuItemCalculateSalarys(JMenuItem menuItemCalculateSalarys) {
        this.menuItemCalculateSalarys = menuItemCalculateSalarys;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar menuBarMain;
    private javax.swing.JMenu menuEmployeeManagement;
    private javax.swing.JMenuItem menuItemCalculateSalarys;
    private javax.swing.JMenuItem menuItemCreateEmployee;
    private javax.swing.JMenuItem menuItemSearchEmployee;
    private javax.swing.JMenu menuSalaryManagement;
    // End of variables declaration//GEN-END:variables
}
