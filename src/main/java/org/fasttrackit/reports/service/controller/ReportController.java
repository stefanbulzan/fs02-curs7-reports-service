package org.fasttrackit.reports.service.controller;

import lombok.RequiredArgsConstructor;
import org.fasttrackit.person.model.Person;
import org.fasttrackit.reports.service.service.ReportService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("reports/persons")
@RequiredArgsConstructor
public class ReportController {
    private final ReportService service;

    @GetMapping
    Person getPersons() {
        return service.getPersons()
                .orElse(null);
    }
}
