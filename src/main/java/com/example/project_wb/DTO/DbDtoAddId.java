package com.example.project_wb.DTO;

import com.example.project_wb.DBConnectionMail;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbDtoAddId {

    public boolean createId(int id){
        Connection connection = DBConnectionMail.connection;
        PreparedStatement preparedStatement = null;

        try {
            String sql = "INSERT INTO ids (id) VALUES (?)";
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setLong(1, id);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            return false;
        }
        return true;
    }
}
