/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.source;

import com.source.dbConnection.connections.IDatabaseConnection;
import com.source.dbConnection.connections.SqliteConnection;
import com.source.presenter.MainPresenter;




/**
 *
 * @author busat
 */
public class Application {

    public static void main(String[] args) {
      IDatabaseConnection connection = new SqliteConnection();
      new MainPresenter(connection);
    }
}
