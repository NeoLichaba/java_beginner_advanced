package com.example.lambda;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Supplier;

/**
 *
 *
 */
public class SupplierTest {

    public static void main(String[] args) {

        List<Employee> eList = Employee.createShortList();
        Employee first = eList.get(0);

        System.out.println("=== Print employee list before");
        eList.stream().forEach(Employee::printSummary);

        // supplier lambda with new employee credentials
        Supplier<Employee> eSupp = ()
                -> new Employee.Builder()
                        .givenName("Jill")
                        .surName("Doe")
                        .age(26)
                        .gender(Gender.FEMALE)
                        .role(Role.STAFF)
                        .dept("Sales")
                        .startDate(LocalDate.of(2011, 7, 14))
                        .salary(45000)
                        .email("jill.doe@example.com")
                        .phoneNumber("202-123-4678")
                        .address("33 3rd St")
                        .city("Smallville")
                        .state("KS")
                        .code("12333")
                        .build();

        //new employee added
        eList.add(eSupp.get());

        System.out.println("\n=== Print employee list after");
        eList.stream().forEach(Employee::printSummary);

    }
}
