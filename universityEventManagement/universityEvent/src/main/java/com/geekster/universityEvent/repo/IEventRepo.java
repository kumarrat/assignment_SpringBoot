package com.geekster.universityEvent.repo;

import com.geekster.universityEvent.model.Event;
import org.springframework.data.repository.CrudRepository;

public interface IEventRepo extends CrudRepository<Event, Long> {
}
