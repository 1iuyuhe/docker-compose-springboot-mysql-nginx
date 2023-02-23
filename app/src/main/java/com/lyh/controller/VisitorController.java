package com.lyh.controller;

import com.lyh.entity.Visitor;
import com.lyh.repository.VisitorRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VisitorController {
    @Autowired
    private VisitorRepository repository;

    @RequestMapping("/")
    public String index(HttpServletRequest request) {
        String ip = request.getRemoteAddr();
        Visitor visitor = repository.findByIp(ip);
        if (visitor == null) {
            visitor = new Visitor();
            visitor.setIp(ip);
            visitor.setTimes(1L);
        } else {
            visitor.setTimes(visitor.getTimes() + 1);
        }
        repository.save(visitor);
        return "I have been seen ip " + visitor.getIp() + " " + visitor.getTimes() + " times.";
    }
}
