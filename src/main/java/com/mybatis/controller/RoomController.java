package com.mybatis.controller;

import com.mybatis.domain.Room;
import com.mybatis.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Steven on 2017/4/4.
 */
@RestController
public class RoomController {

    @Autowired RoomService service;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public Room getRoom() {

        return service.selectRoomById(1);
    }
}
