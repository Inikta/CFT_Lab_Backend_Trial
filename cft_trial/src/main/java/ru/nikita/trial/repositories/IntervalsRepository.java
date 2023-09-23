package ru.nikita.trial.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ru.nikita.trial.models.Interval;

@Repository
public interface IntervalsRepository extends CrudRepository<Interval, Long> {

}
