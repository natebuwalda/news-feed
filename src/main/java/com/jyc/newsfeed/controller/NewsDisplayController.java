package com.jyc.newsfeed.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewsDisplayController {
    private static final Logger log = LoggerFactory.getLogger(NewsDisplayController.class);

    @RequestMapping("/summary")
    public String displaySummary() {
        log.debug("Controller hit");
        return "newsSummary";
    }
}
