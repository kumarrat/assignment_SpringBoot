package com.geekster.UrlHitCounter.controller;

import com.geekster.UrlHitCounter.entity.Visitor;
import com.geekster.UrlHitCounter.service.VisitorService;
import jdk.jfr.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class VisitorController {

    @Autowired
    VisitorService visitorService;
    @PostMapping("visitor")
    public String addVisitor(@RequestBody Visitor myVisitor)
    {
        return visitorService.addVisitor(myVisitor);
    }

    @GetMapping("visitors")
    public Map<Integer, Visitor> getAllVisitor()
    {
        return visitorService.getAllVisitor();
    }

    @GetMapping("size")
    public Map<Integer, Visitor> size()
    {
        return visitorService.size();
    }

    @GetMapping("visitors/category/{category}")
    public List<Visitor> getAllVisitorByCategory(@RequestParam Category category)
    {
        return visitorService.getAllVisitorByCategory(category);
    }

    @PutMapping("/visitor/id/{id}/status")
    public String countVisitorStatusById(@PathVariable Integer id) {
        int count = 0;

        for (Visitor visitor : visitorService.getAllVisitors()) {
            if (visitor.getVisitorId().equals(id)) {
                count++;
            }
        }

        if (count > 0) {
            return "Visitor count" + count;
        } else {
            return "No visitor found " + id;
        }
    }


}
