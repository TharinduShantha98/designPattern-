import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    //this class created for one database connection access

    private static  DbConnection dbConnection =null;
    private Connection connection;


    private DbConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/superMarket",
                "root",
                "1234");
    }



    public DbConnection getDbConnection() throws SQLException, ClassNotFoundException {
        if(dbConnection != null){
            dbConnection = new DbConnection();
        }

        return dbConnection;



    }

    public Connection getConnection(){
        return  connection;

    }



















}
