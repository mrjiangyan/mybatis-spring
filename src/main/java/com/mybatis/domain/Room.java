package com.mybatis.domain;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Eddú Meléndez
 */
@Data
public class Room implements Serializable {

    private static final long serialVersionUID = 1L;

    //教室Id
    private String room_id;
    //教室名称
    private String room_number;

    //学生数量限制
    private int limit_student_number;
}
