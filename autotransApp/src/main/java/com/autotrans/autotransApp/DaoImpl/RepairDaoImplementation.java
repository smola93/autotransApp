package com.autotrans.autotransApp.DaoImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.autotrans.autotransApp.Entity.Repair;
import com.autotrans.autotransApp.Dao.RepairDao;

@Repository
public class RepairDaoImplementation extends JdbcDaoSupport implements RepairDao {
    @Autowired
    DataSource dataSource;

    @PostConstruct
    private void initialize(){
        setDataSource(dataSource);
    }

    @Override
    public void insertRepair(Repair rep1) {
        String sql = "INSERT INTO mech " +
                "(ID, CustomerName, OrderDate, Registration, Make, Model, RepairProcedure, PartsOrdered) VALUES (?, ?)";
        getJdbcTemplate().update(sql, new Object[]{
                rep1.getId(), rep1.getCustomerName(), rep1.getDate(), rep1.getRegistration(), rep1.getMake(),
                rep1.getModel(), rep1.getRepairProcedure(), rep1.getPartsOrdered(),
        });
    }

    @Override
    public List<Repair> getAllRecords(){
        String sql = "SELECT * FROM mech";
        List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);

        List<Repair> result = new ArrayList<Repair>();
        for(Map<String, Object> row:rows){
            Repair rep1 = new Repair();

            rep1.setId((int)row.get("ID"));
            rep1.setCustomerName((String)row.get("CustomerName"));
            rep1.setDate((String)row.get("OrderDate"));
            rep1.setRegistration((String)row.get("Registration"));
            rep1.setMake((String)row.get("Make"));
            rep1.setModel((String)row.get("Model"));
            rep1.setRepairProcedure((String)row.get("RepairProcedure"));
            rep1.setPartsOrdered((String)row.get("PartsOrdered"));
            result.add(rep1);
        }

        return result;
    }
}
