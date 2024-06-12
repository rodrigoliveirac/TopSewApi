package com.rodcollab.topsew;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TopsewApplication {

	public static void main(String[] args) {
		SpringApplication.run(TopsewApplication.class, args);
	}

	Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
        public void run() {
            DataSource ds = DatabaseConfig.ds;
            if (ds != null) {
                try {
                    ds.getConnection().close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }, "Shutdown-thread"));

}
