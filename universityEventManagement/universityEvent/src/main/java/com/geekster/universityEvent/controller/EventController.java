package com.geekster.universityEvent.controller;

import com.geekster.universityEvent.model.Event;
import com.geekster.universityEvent.service.EventService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventController {
    @Autowired
    EventService eventService;

    @PostMapping("event")
    public String addEvent(@RequestBody @Valid Event newEvent)
    {
        return eventService.addEvent(newEvent);
    }

    @GetMapping("events")
    public List<Event> getEvent()
    {
        return eventService.getEvent();
    }

    @PostMapping("events")
    public String addingEvent(@RequestBody List<Event> newEvent)
    {
        return eventService.addingEvent(newEvent);
    }

    @GetMapping("event/id/{id}")
    public Event getEventById(@PathVariable Long id)
    {
        return eventService.getEventById(id);
    }

    @DeleteMapping("event/ids")
    public String removeEventByIds(@RequestBody List<Long> ids)
    {
        return eventService.removeEvent(ids);
    }
}
