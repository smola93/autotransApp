package com.autotrans.autotransApp.Controller;

import java.util.List;

import com.autotrans.autotransApp.Entity.Repair;
import com.autotrans.autotransApp.Service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class
RepairController {

    @Autowired
    RepairService repairService;

    //index start page
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView firstPage() {
        return new ModelAndView("index");
    }

    //show the form and also pass an empty backing bean object to store the form field values
    @RequestMapping(value = "/make_order", method = RequestMethod.GET)
    public ModelAndView show() {
        return new ModelAndView("make_order", "rep1", new Repair());
    }

    //Get the form field values which are populated using the backing bean and store it in db
    @RequestMapping(value = "/make_order", method = RequestMethod.POST)
    public ModelAndView processRequest(@ModelAttribute("rep1") Repair rep1) {
        repairService.insertRepair(rep1);
        List<Repair> repairs = repairService.getAllRecords();
        ModelAndView model = new ModelAndView("getRepairs");
        model.addObject("repairs", repairs);
        return model;
    }

    //show all employees saved in db (!!to implement!!)
    @RequestMapping("/find_repair")
    public ModelAndView getRepairs() {
        List<Repair> repairs = repairService.getAllRecords();
        ModelAndView model = new ModelAndView("find_repair");
        model.addObject("repairs", repairs);
        return model;
        
    }

}
