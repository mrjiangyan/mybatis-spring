package com.mybatis.service;

import com.mybatis.domain.Room;
import com.mybatis.mapper.RoomMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Steven on 2017/4/4.
 */
@Service
public class RoomService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    RoomMapper roomMapper;

    public Room selectRoomById(int room_id)
    {
        return roomMapper.selectRoomById(room_id);
    }

    public RoomService()
    {
        logger.info("roomService");
    }
}
