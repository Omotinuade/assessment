import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.SQLException;

public class CustomerRepository {
    private BasicDataSource dataSource;

    public CustomerRepository() {
        dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/customer_db?createDatabaseIfNotExist=true");
        dataSource.setUsername("root");
        dataSource.setPassword("Omotoyinbo1!");
        try {
            System.out.println("Connection:: "+ dataSource.getConnection());
        } catch (SQLException e) {
            System.err.println("Error:: "+ e);
            System.exit(1);
        }

    }
}
