package com.mybatis.service;

import com.mybatis.domain.Room;
import com.mybatis.mapper.RoomMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Steven on 2017/4/4.
 */
@Service
public class RoomService {

    @Autowired
    RoomMapper roomMapper;

    public Room selectRoomById(int room_id)
    {
        return roomMapper.selectRoomById(room_id);
    }
}
