package org.fasttrackit.reports.service.service;

import lombok.RequiredArgsConstructor;
import org.fasttrackit.person.client.resttemplate.PersonClientRT;
import org.fasttrackit.person.model.Person;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReportService {
    private final PersonClientRT client;

    public Optional<Person> getPersons() {
        return client.persons()
                .get(3);
    }
}
