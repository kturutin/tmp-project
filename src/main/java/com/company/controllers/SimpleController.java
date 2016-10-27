package com.company.controllers;

import com.company.dao.FirstDao;
import com.company.dao.SecondDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {
    private FirstDao firstDao;
    private SecondDao secondDao;

    @Autowired
    public SimpleController(FirstDao firstDao, SecondDao secondDao) {
        this.firstDao = firstDao;
        this.secondDao = secondDao;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String simpleEndpoint() {
        return secondDao.getTestField();
    }
}
