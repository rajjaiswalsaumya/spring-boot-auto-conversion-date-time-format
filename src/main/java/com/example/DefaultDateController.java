package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by Sam on 7/9/2016.
 */

@RestController
public class DefaultDateController {

    @RequestMapping(value = "/putDate")
    public Date date(@RequestParam(value = "from", required = false) Date date) {
        return date;
    }

}
