package lab8.asd;

import java.sql.*;

public class JDBCFacade implements IJDBCFacade{
    public void SelectTable() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        Connection conn = null;
        PreparedStatement prep = null;
        ResultSet rset = null;
        try{
            Class.forName("<driver>").newInstance();
            conn = DriverManager.getConnection("<database>");
            String sql = "SELECT * FROM <table> WHERE <column name> = ?";
             prep = conn.prepareStatement(sql);
            prep.setString(1, "<column value>");
            rset = prep.executeQuery();
            if (rset.next()) {
                System.out.println(rset.getString("<column name>"));
            }
        }
        finally {
            if (rset != null) {
                try {
                    rset.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            if (prep != null) {
                try {
                    prep.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }

    }
    public void ExecuteStore() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        Connection conn = null;
        PreparedStatement prep = null;
        CallableStatement call = null;
        try{
            Class.forName("<driver>").newInstance();
            conn = DriverManager.getConnection("<database>");
            String sql = "{call <stored procedure>( ?, ? )}";
            call = conn.prepareCall(sql);
            call.setInt(1, 1972);
            call.registerOutParameter(2, java.sql.Types.INTEGER);
            call.execute();
        }
        finally {
            if (prep != null) {
                try {
                    prep.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }

    }
}
