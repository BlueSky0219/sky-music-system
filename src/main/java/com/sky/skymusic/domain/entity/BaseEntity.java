package com.sky.skymusic.domain.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

/**
 * @author BlueSky
 * @date 2023/12/15
 */
@Data
public class BaseEntity implements Serializable {

    /**
     * 序列化
     */
    private static final long serialVersionUID = 1L;

    /**
     * 逻辑删除
     */
    private int deleted;

    /**
     * 创建日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createTime;

    /**
     * 修改日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime updateTime;
}
