package com.kodilla.jdbc;

import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertEquals;

public class StoredProcTestSuite {
    @Test
    public void testUpdateVipLevels() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READS SET VIP_LEVEL=\"N ot set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeLargeUpdate(sqlUpdate);

        //When
        String sqlProcedureCall = "CALL UpdateVipLevels";
        statement.execute(sqlProcedureCall);

        //Then
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"N ot set\"";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        int howMany = -1;
        if (rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }
        assertEquals(0, howMany);
    }

    @Test
    public void testUpdateBestsellers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READS SET VIP_LEVEL=\"N ot set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeLargeUpdate(sqlUpdate);
        //When
        String sqlProcedureCall = "CALL UpdateBestsellers";
        statement.execute(sqlProcedureCall);

        //Then
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM BOOKS WHERE BESTSELLER=\"N ot set\"";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        int howMany = -1;
        if (rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }
        assertEquals(0, howMany);

    }
}
