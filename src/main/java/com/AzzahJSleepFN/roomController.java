package com.AzzahJSleepFN;

import com.AzzahJSleepFN.controller.AccountController;
import com.AzzahJSleepFN.controller.BasicGetController;
import com.AzzahJSleepFN.dbjson.JsonAutowired;
import com.AzzahJSleepFN.dbjson.JsonTable;
import org.springframework.web.bind.annotation.*;
import com.AzzahJSleepFN.Room;
import com.AzzahJSleepFN.dbjson.*;
import java.util.List;

@RestController
@RequestMapping("/room")
public class roomController implements BasicGetController<Room> {

    @JsonAutowired(value = Room.class, filepath = "C:\\Users\\HP 15s\\OOP\\Jsleep\\src\\main\\java\\com\\AzzahJSleepFN\\json\\room.json")
    JsonTable<Room> roomTable;



    @Override
    public JsonTable<Room> getJsonTable() {
        return roomTable;
    }


    @GetMapping ("/{id}/renter")
    List<Room> getRoomByRenter(
            @PathVariable int id,
            @RequestParam int page,
            @RequestParam int pageSize
    ){
        return Algorithm.<Room>paginate(getJsonTable(), page, pageSize, pred -> pred.accountId == id);
    }

    @RequestMapping("/room")
    @PostMapping ("/create")
    public Room create (@RequestParam int accountId, @RequestParam String name,
                        @RequestParam int size, @RequestParam int price, @RequestParam Facility facility,
                        @RequestParam City city, @RequestParam String address){
        Account account = Algorithm.<Account>find(AccountController.accountTable, pred -> pred.id == accountId && pred.renter != null);
        if(account==null){
            return null;
        }
        else{
            Room room = new Room(accountId, name, size, new Price(price), facility, city, address);
            roomTable.add(room);
            return room;
        }
    }
}
