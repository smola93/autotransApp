package com.autotrans.autotransApp.ServiceImpl;

import com.autotrans.autotransApp.Entity.Repair;
import com.autotrans.autotransApp.Service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.autotrans.autotransApp.Dao.RepairDao;

@Service
public class RepairServiceImplementation implements RepairService {

    @Autowired
    RepairDao repairDao;

    @Override
    public void insertRepair(Repair repair) {
        repairDao.insertRepair(repair);
    }

    @Override
    public List<Repair> getAllRecords() {
        return repairDao.getAllRecords();
    }
}
