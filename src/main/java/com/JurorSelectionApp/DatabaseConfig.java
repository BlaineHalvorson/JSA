package com.JurorSelectionApp;

import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

//Used to connect to the heroku database
@Configuration
public class DatabaseConfig {
  @Bean
  public NamedParameterJdbcTemplate namedParameterJdbcTemplate(DataSource dataSource) {
      return new NamedParameterJdbcTemplate(dataSource);
  }
  
  //use for local testing
  // @Bean
  // public DataSource dataSource() {
  //     DriverManagerDataSource dataSource = new DriverManagerDataSource();
  //     dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
  //     dataSource.setUrl("jdbc:mysql://localhost:3307/jurorselectionapplication?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
  //     dataSource.setUsername("root");
  //     dataSource.setPassword("");
  //     return dataSource;
  // }

  //use for heroku deployment
  @Bean
  public DataSource dataSource() {
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
    dataSource.setUrl("jdbc:mysql:frwahxxknm9kwy6c.cbetxkdyhwsb.us-east-1.rds.amazonaws.com:3306/gjsg7sadgfr9w1tl");
    dataSource.setUsername("n6udqa17y74tqa1s");
    dataSource.setPassword("yyxibnvrwc1km0ir");
    return dataSource;
    // mysql://bd7e3051eefc04:4df9e068@us-cdbr-east-03.cleardb.com/heroku_08425c492f42421?reconnect=true
    // mysql://n6udqa17y74tqa1s:yyxibnvrwc1km0ir@frwahxxknm9kwy6c.cbetxkdyhwsb.us-east-1.rds.amazonaws.com:3306/gjsg7sadgfr9w1tl
  }
}
