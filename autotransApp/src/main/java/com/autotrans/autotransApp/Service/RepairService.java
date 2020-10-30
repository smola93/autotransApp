package com.autotrans.autotransApp.Service;

import java.util.List;

import com.autotrans.autotransApp.Entity.Repair;

public interface RepairService {
    void insertRepair(Repair rep1);
    List<Repair> getAllRecords();
}
