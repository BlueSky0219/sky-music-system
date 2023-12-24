package com.sky.skymusic.controller;

import com.sky.skymusic.common.util.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BlueSky
 * @date 2023/12/17
 */
@RestController
@RequestMapping("/web/song")
public class WebSongController {

    @Autowired
    private WebSongController webSongController;

    @GetMapping
    public AjaxResult
}
