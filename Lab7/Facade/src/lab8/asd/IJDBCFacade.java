package lab8.asd;

import java.sql.SQLException;

public interface IJDBCFacade {
    void SelectTable() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException;
    void ExecuteStore() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException;
}
