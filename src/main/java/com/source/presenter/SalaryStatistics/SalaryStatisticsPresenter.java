/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.source.presenter.SalaryStatistics;

import com.source.service.EmployeeBonusService.EmployeeBonusService;
import com.source.service.EmployeeService.EmployeeService;
import com.source.service.EmployeeService.strategy.AverageSalary;
import com.source.service.EmployeeService.strategy.HighestSalary;
import com.source.service.EmployeeService.strategy.LowestSalary;
import com.source.service.EmployeeService.strategy.StatisticStrategy;
import com.source.service.EmployeeService.strategy.SumSalary;
import com.source.service.EmployeeService.strategy.TotalNumberOfSalarys;
import com.source.utils.DateUtils;
import com.source.view.SalaryStatisticsView;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author busat
 */
public class SalaryStatisticsPresenter {

    private static SalaryStatisticsView view = new SalaryStatisticsView();
    private EmployeeService service = null;

    public SalaryStatisticsPresenter(EmployeeService service) {
        if (view == null) {
            view = new SalaryStatisticsView();
        }
        this.service = service;
        initComponents();
        view.setVisible(true);
    }

    public void clearScreen() {
        DefaultTableModel tableModel = (DefaultTableModel) view.getTblStatistics().getModel();
        tableModel.setNumRows(0);
    }

    private void initComponents() {
        clearScreen();
        ArrayList<StatisticStrategy> strategyList = new ArrayList();
        try {
            strategyList.add(new AverageSalary());
            strategyList.add(new HighestSalary());
            strategyList.add(new LowestSalary());
            strategyList.add(new SumSalary());
            strategyList.add(new TotalNumberOfSalarys());
            service.getSalaryStatistics(strategyList);
            DefaultTableModel tableModel = (DefaultTableModel) view.getTblStatistics().getModel();
            view.getTblStatistics().getColumnModel().getColumn(1).
                    setHeaderValue(DateUtils.getFormattedCurrentDate());
            for (StatisticStrategy strategy : strategyList) {
                Object[] rowData = {strategy.getName(), strategy.getValue()};
                tableModel.addRow(rowData);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível gerar as estatísticas dos salários" + ex);
        }
    }
}
