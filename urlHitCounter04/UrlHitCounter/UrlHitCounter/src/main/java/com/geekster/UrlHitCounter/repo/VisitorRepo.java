package com.geekster.UrlHitCounter.repo;

import com.geekster.UrlHitCounter.entity.Visitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
@Component
public class VisitorRepo {
    @Autowired
    private Map<Integer, Visitor> visitorMap;

    public Map<Integer, Visitor> getVisitorMap() {
        return visitorMap;
    }
}
