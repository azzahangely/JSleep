package com.AzzahJSleepFN;
import  com.AzzahJSleepFN.Account;
import com.AzzahJSleepFN.Payment;
import com.AzzahJSleepFN.controller.BasicGetController;
import com.AzzahJSleepFN.dbjson.JsonTable;
import com.AzzahJSleepFN.dbjson.Serializable;
import com.AzzahJSleepFN.dbjson.JsonAutowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import com.AzzahJSleepFN.controller.BasicGetController;
import com.AzzahJSleepFN.PaymentController;
import com.AzzahJSleepFN.controller.BasicGetController;


@RequestMapping("/payment")
public class PaymentController extends BasicGetController<Payment>{
    //@JsonAutowired(Account.class, "C:\Users\HP 15s\OOP\Jsleep\src\main\java\com\AzzahJSleepFN\dbjson\JsonAutowired.java";
    @Override
    public JsonTable<Payment> getJsonTable() {
        return null;
    }
    @PostMapping("/{create}")
    public Payment create(
            @RequestParam int buyerId,
            @RequestParam int renterId,
            @RequestParam int roomId,
            @RequestParam String from,
            @RequestParam String to
            ){
        return null;
    }
    @PostMapping("/{accept}")
    public Payment accept (){
        return null;
    }
    @PostMapping("/{cancel}")
    public Payment cancel (){
        return null;
    }
    @PostMapping("/{submit}")
    public Payment submit (){
        return null;
    }
}
