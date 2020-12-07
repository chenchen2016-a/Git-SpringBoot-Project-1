package chen.springboot.jpa.service;

import chen.springboot.jpa.domain.Guest;
import chen.springboot.jpa.dao.GuestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {
    @Autowired
    private GuestDao dao;

    public List<Guest> guestList() {
        return dao.findAll();
    }

//    public String addGuest(String name,String position) {
//        Guest guest = this.packGuest(name, position);
//        if(chen.springboot.jpa.dao.save(guest) > 0) {
//            return "增加成功";
//        }else {
//            return "增加失败";
//        }
//    }
//
//    public String deleteGuest(String name) {
//        if(chen.springboot.jpa.dao.deleteGuest(name) > 0)  {
//            return "删除成功";
//        }else {
//            return "删除失败";
//        }
//    }
//
//    public String updateGuest(String name, String position) {
//        Guest guest = this.packGuest(name, position);
//        if(chen.springboot.jpa.dao.updateGuest(guest) > 0) {
//            return "修改成功";
//        }else {
//            return "修改失败";
//        }
//    }
//    private Guest packGuest(String name, String position) {
//        Guest guest = new Guest();
//        guest.setG_name(name);
//        guest.setG_position(position);
//        return guest;
//    }
}
