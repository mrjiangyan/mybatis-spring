package com.mybatis.mapper;


import com.mybatis.domain.Room;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Eddú Meléndez
 */
@Mapper
public interface RoomMapper {


    Room selectRoomById(int room_id);

}