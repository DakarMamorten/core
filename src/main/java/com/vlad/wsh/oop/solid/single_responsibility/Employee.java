package com.vlad.wsh.oop.solid.single_responsibility;

/**
 * A class should only have one responsibility. Furthermore, it should only have one reason to change.
 * <p>
 * How does this principle help us to build better software? Let's see a few of its benefits:
 * <p>
 * 1.Testing – A class with one responsibility will have far fewer test cases.
 * 2.Lower coupling – Less functionality in a single class will have fewer dependencies.
 * 3.Organization – Smaller, well-organized classes are easier to search than monolithic ones.
 */
public class Employee {
    private String name;
    TimeSheetReport timeSheetReport;

    public String getName() {
        return name;
    }


}
