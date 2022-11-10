package com.AzzahJSleepFN;
import com.AzzahJSleepFN.*;
import  com.AzzahJSleepFN.Account;
import com.AzzahJSleepFN.controller.BasicGetController;
import com.AzzahJSleepFN.dbjson.*;
import com.AzzahJSleepFN.dbjson.JsonAutowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/payment")
public class PaymentController implements BasicGetController<Payment>{
    @JsonAutowired(value = Account.class, filepath = "account.json")
    public static JsonTable<Payment> paymentTable;

    @Override
    public JsonTable<Payment> getJsonTable() {
        return paymentTable;
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
    public boolean accept (
            @RequestParam int id
    ){
        return false;
    }
    @PostMapping("/{cancel}")
    public boolean cancel (
            @RequestParam int id
    ){
        return false;
    }
    @PostMapping("/{submit}")
    public boolean submit (
            @RequestParam int id
    ){
        return false;
    }
}
