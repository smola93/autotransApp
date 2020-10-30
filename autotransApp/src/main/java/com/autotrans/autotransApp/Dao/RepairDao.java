package com.autotrans.autotransApp.Dao;

import java.util.List;

import com.autotrans.autotransApp.Entity.Repair;

public interface RepairDao {
    void insertRepair(Repair cus);
    List<Repair> getAllRecords();
}
