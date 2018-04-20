package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeCompanyFacadeTestSuite {

    @Autowired
    EmployeeCompanyFacade employeeCompanyFacade;
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testEmployeeCompanyFacade() {
        //Given
        Employee johnClarckson = new Employee("John", "Clarckson");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMasters = new Company("Data Masters");
        Company greyMatter = new Company("Grey Matter");

        companyDao.save(softwareMachine);
        companyDao.save(dataMasters);
        companyDao.save(greyMatter);

        employeeDao.save(johnClarckson);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);

        //When
        List<Company> companies = new ArrayList<>();
        List<Employee> employees = new ArrayList<>();
        try {
            companies = employeeCompanyFacade.retrieveCompany("ste");
            employees = employeeCompanyFacade.retrieveEmployee("rck");
        } catch (ProcessingException e) {

        }

        //Then
        assertEquals(1, companies.size());
        assertEquals(2, employees.size());

        //Clean up
        companyDao.delete(softwareMachine);
        companyDao.delete(dataMasters);
        companyDao.delete(greyMatter);
        employeeDao.delete(johnClarckson);
        employeeDao.delete(stephanieClarckson);
        employeeDao.delete(lindaKovalsky);
    }
}