package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeCompanyFacade {
    @Autowired
    CompanyDao company;

    @Autowired
    EmployeeDao employee;

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeCompanyFacade.class);

    public List<Company> retrieveCompany(final String word) throws ProcessingException {

        LOGGER.info("Searching for companies name: " + word);
        String name = "%" + word + "%";
        List<Company> companies = company.retrieveCompaniesWithNamesPart(name);
        if (companies.size() == 0) {
            throw new ProcessingException(ProcessingException.ERR_COMPANY_NOT_FOUND);
        } else {
            companies.stream()
                    .forEach(o -> LOGGER.info(o.getName()));
        }
        return new ArrayList<>(companies);
    }
    public List<Employee> retrieveEmployee (final String word) throws ProcessingException {
        LOGGER.info("Searching for employee with keywords: " + word);
        String name = "%" + word + "%";
        List<Employee> employees = employee.retrieveFromPartOfLastName(name);
        if (employees.size() == 0) {
            throw new ProcessingException(ProcessingException.ERR_EMPLOYEE_NOT_FOUND);
        } else {
            employees.stream()
                    .forEach(o -> LOGGER.info(o.getLastname()));
            return new ArrayList<>(employees);
        }
    }
}
