package chen.springboot.restaurant.dao;

import chen.springboot.restaurant.domain.Guest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GuestDao {
    List<Guest> selectGuestList();

    int insertGuest(Guest guest);

    int deleteGuest(String name);

    int updateGuest(Guest guest);
}
