package factories;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectorFactory {

    private static Connection connection = null;
    private static final Logger log = LogManager.getLogger(DBConnectorFactory.class);

    public DBConnectorFactory(){
        getDatabaseConnection();
    }

    public static Connection getDatabaseConnection(){

        if(connection != null){
            log.info("Already Connected to A Database");
        }

        if(connection == null){
            String url="jdbc:mysql://sql5.freesqldatabase.com:3306/sql5524930";
            log.info("Trying to Connect to" + url);

			try {
				connection= DriverManager.getConnection(url, "sql5524930", "wWlwxxSddD");
				if(connection!=null) {
					 JOptionPane.showMessageDialog(null, "Connection established", "JBDC Connection Status", JOptionPane.INFORMATION_MESSAGE);
                     log.info("Connection Established : "+ url);
				}
			}catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Could not connect to database\n", "Connection Failure", JOptionPane.ERROR_MESSAGE);
                log.error(e.getMessage());
            }
            catch(Exception e) {
				log.error(e.getMessage());
			}
        }

        return connection;
    }
}

