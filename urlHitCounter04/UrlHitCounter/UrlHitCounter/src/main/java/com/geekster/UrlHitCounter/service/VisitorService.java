package com.geekster.UrlHitCounter.service;

import com.geekster.UrlHitCounter.entity.Visitor;
import com.geekster.UrlHitCounter.repo.VisitorRepo;
import jdk.jfr.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class VisitorService {
    @Autowired
    VisitorRepo visitorRepo;

    public String addVisitor(Visitor myVisitor) {
        visitorRepo.getVisitorMap().put(myVisitor.getVisitorId(), myVisitor);
        return "Visitor added";
    }

    public Map<Integer, Visitor> getAllVisitor() {
        return visitorRepo.getVisitorMap();
    }

    public Map<Integer, Visitor> size() {
        return visitorRepo.getVisitorMap();
    }


    public List<Visitor> getAllVisitorByCategory(Category category) {

        List<Visitor> filteredList = new ArrayList<>();
        for(Integer keyId : getAllVisitor().keySet())
        {
            Visitor visitor = getAllVisitor().get(keyId);

            if(visitor.getVisitorCategory().equals(category))
            {
                filteredList.add(visitor);
            }
        }
        return filteredList;
    }

    public Visitor[] getAllVisitors() {
        return getAllVisitors();
    }
}
