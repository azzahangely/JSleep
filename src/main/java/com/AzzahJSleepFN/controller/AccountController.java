package com.AzzahJSleepFN.controller;

import com.AzzahJSleepFN.Account;
import com.AzzahJSleepFN.Renter;
import com.AzzahJSleepFN.dbjson.JsonAutowired;
import com.AzzahJSleepFN.dbjson.JsonTable;
import org.springframework.web.bind.annotation.*;

import java.util.regex.Pattern;

@RestController
@RequestMapping("/account")
public class AccountController implements BasicGetController<Account>
{
    public static final String REGEX_PASSWORD = "Syahwa2503";
    @JsonAutowired(value = Account.class, filepath = "Account.json")
    private JsonTable<Account> jsonTable;
    public static JsonTable<Account> accountTable;
    public static final Pattern REGEX_PATTERN_PASSWORD = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$");
    public static final String REGEX_EMAIL = "azzahangely@gmail.com";
    public static final Pattern REGEX_PATTERN_EMAIL = Pattern.compile("^[A-Za-z0-9]+@(.+)$");


    @GetMapping
    String index() { return "account page"; }

    @PostMapping("/register")
    Account register
            (
                    @RequestParam String name,
                    @RequestParam String email,
                    @RequestParam String password
            )
    {
        return new Account(name, email, password);
    }
    @GetMapping("/{id}")
    public Account getById(@PathVariable int id) {
        return "account id " + id + " not found!";
    }

    public AccountController(){
        accountTable = new JsonTable<Account>(Account.class, "Account.json");
    }

    public JsonTable<Account> getJsonTable(){
        return accountTable;
    }

    Renter registerRenter(
            @PathVariable int id,
            @RequestParam String username,
            @RequestParam String address,
            @RequestParam String phoneNumber
    ){
        return new Renter(username, address, phoneNumber);
    }
    @PostMapping("/login")
    Account login(
            @RequestParam String email,
            @RequestParam String password
    )
    {
        return new Account(email, password);
    }

    boolean topUp(@PathVariable int id, @RequestParam double balance){
        return true;
    }
}