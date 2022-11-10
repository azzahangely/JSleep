package com.AzzahJSleepFN;

import com.AzzahJSleepFN.controller.BasicGetController;
import com.AzzahJSleepFN.dbjson.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/voucher")
public class VoucherController implements BasicGetController<Voucher> {
    @JsonAutowired(value = Voucher.class, filepath = "C:\\Users\\HP 15s\\OOP\\Jsleep\\src\\main\\java\\com\\AzzahJSleepFN\\json\\voucher.json")
    public static JsonTable<Voucher> voucherTable;

    @Override
    public JsonTable<Voucher> getJsonTable() {
        return voucherTable;
    }

    @GetMapping("/{id}/isUsed")
    boolean isUsed(@PathVariable int id, @RequestParam double price) {
        Voucher voucher = Algorithm.<Voucher>find(voucherTable, pred -> pred.id == id);
        return voucher.isUsed();
    }

    @GetMapping("/getAvailable ")
    List<Voucher> getAvailable(@RequestParam int page, @RequestParam int size) {
        return Algorithm.<Voucher>paginate(voucherTable, page, size, pred -> !pred.isUsed());
    }

    @GetMapping("/{id}/canApply ")
    boolean canApply(
            @PathVariable int id,
            @RequestParam double price
    ) {
        Voucher voucher = Algorithm.<Voucher>find(voucherTable, pred -> pred.id == id);
       if(voucher != null){
           return voucher.canApply(price);
        } else {
           return false;
        }
    }
}
