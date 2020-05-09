package project.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.annotation.Resource;
import javax.sql.DataSource;

public class Jdbc {
    protected JdbcTemplate jdbc;
    protected NamedParameterJdbcOperations named;

    @Autowired
    @Resource(name = "dataSource")
    protected void setJdbc(DataSource dataSource) {
        this.jdbc = new JdbcTemplate(dataSource);
    }

    @Autowired
    @Resource(name = "dataSource")
    protected void setNamedJdbc(DataSource dataSource) {
        this.named = new NamedParameterJdbcTemplate(new JdbcTemplate(dataSource));
    }
}
