package edu.gcccd.csis;

import org.junit.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


public class StructureTest {

    @Test
    public void employeeComplete() {

        edu.gcccd.csis.Employee e1 = new edu.gcccd.csis.Employee("peter", "01/01/89", "ceo", 01);
        edu.gcccd.csis.Employee e2 = new edu.gcccd.csis.Employee("mary", "02/02/90", "cfo", 02);

        assertNotNull("This is null", e1.getName());
        assertNotNull("This is null", e1.getDob());
        assertNotNull("This is null", e1.getEid());
        assertNotNull("This is null", e1.getTitle());

        assertNotNull("This is null", e2.getName());
        assertNotNull("This is null", e2.getDob());
        assertNotNull("This is null", e2.getEid());
        assertNotNull("This is null", e2.getTitle());

    }

//        agecheck does not work because DOB is a string and not an int
//        boolean ageCheck = ((0 < e1.getDob() ) && e1.getDob() < 100 )? true : false;
//        assertTrue(ageCheck);

    @Test
    public void employeeEq() {

            // Create employee e1,
            // Create another employee e2 that matches the specific criteria for equality
            edu.gcccd.csis.Employee e1 = null;
            edu.gcccd.csis.Employee e2 = null;

            e1 = new edu.gcccd.csis.Employee("peter", "01/01/89", "ceo", 01);
            e2 = e1;

            assertTrue(e1.equals(e2));

            // modify employee e2 (eg. by making her/him join the other company
            //assertNotEquals(e1, e2);

            e1 = new edu.gcccd.csis.Employee("peter", "01/01/89", "ceo", 01);
            e2 = new edu.gcccd.csis.Employee("mary", "02/02/90", "cfo", 02);

            assertNotEquals(e1, e2);
    }


    // check that a companies' attribute are complete and make sense.
    @Test
    public void companyComplete() {
        // check that a companies' attribute are complete and make sense.

        edu.gcccd.csis.Google c1 = new edu.gcccd.csis.Google("Google", 1, 01);
        edu.gcccd.csis.Microsoft c2 = new edu.gcccd.csis.Microsoft("Microsoft", 1, 02);

        assertNotNull("This is null", c1.getName());
        assertNotNull("This is null", c1.getNumE());
        assertNotNull("This is null", c1.getCid());

        assertNotNull("This is null", c2.getName());
        assertNotNull("This is null", c2.getNumE());
        assertNotNull("This is null", c2.getCid());
    }

    @Test
    public void companyEq() {

        // Create company c1,
        // Create company employee c2 that matches the specific criteria for equality
        edu.gcccd.csis.Company c1 = null;
        edu.gcccd.csis.Company c2 = null;

        c1 = new edu.gcccd.csis.Company("Google", 1, 01);
        c2 = c1;

        assertTrue(c1.equals(c2));

        // modify company c2, i.e. change its name or create another company with a different name ..
        //assertNotEquals(e1, e2);

        c1 = new edu.gcccd.csis.Company("Google", 1, 01);
        c2 = new edu.gcccd.csis.Company("Google", 1, 01);

        assertNotEquals(c1, c2);
    }
}




