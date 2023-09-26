package com.geekster.universityEvent.service;

import com.geekster.universityEvent.model.Event;
import com.geekster.universityEvent.repo.IEventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    @Autowired
    IEventRepo eventRepo;
    public String addEvent(Event newEvent) {
        eventRepo.save(newEvent);
        return "Event Added";
    }

    public List<Event> getEvent() {
        return (List<Event>) eventRepo.findAll();
    }

    public String addingEvent(List<Event> newEvent) {
        eventRepo.findAll();
        return newEvent.size() + "Event Added";
    }

    public Event getEventById(Long id) {
        return eventRepo.findById(id).get();
    }

    public String removeEvent(List<Long> ids) {
        eventRepo.deleteAllById(ids);
        return "removed event";
    }
}
