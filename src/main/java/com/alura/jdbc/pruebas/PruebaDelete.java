package com.alura.jdbc.pruebas;

import com.alura.jdbc.factory.*;

import java.sql.*;

public class PruebaDelete {
    public static void main(String[] args) throws SQLException {
        Connection con = new ConnectionFactory().recuperaConexion();
        Statement statement = con.createStatement();

        statement.execute("DELETE FROM PRODUCTS WHERE ID = 99");

        System.out.println(statement.getUpdateCount());
    }
}
