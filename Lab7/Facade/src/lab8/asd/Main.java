package lab8.asd;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
	// write your code here
        IJDBCFacade facade = new JDBCFacade();
        facade.SelectTable();
        facade.ExecuteStore();
    }
}
