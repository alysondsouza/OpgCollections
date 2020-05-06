import Array_List.OpgArrayList;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class OpgArrayList_MainTest {

    ArrayList<String> testArrayList;
    String testStr1, testStr2;

    @Before
    public void setUp() {

        OpgArrayList.checkVarOnArray();

        testArrayList = OpgArrayList.stringArrayList;
        testStr1 = OpgArrayList.str1; // =Dog
        testStr2 = "Cake";
    }

    @Test
    public void insertStringTest() {
        System.out.println("\nJUnit Tests:");

        //Dog is already in the List, so it will fail(return: false)!
        System.out.println(testArrayList);
        boolean checkTest1 = OpgArrayList.insertString(testArrayList, testStr1);
        assertFalse(checkTest1);
        System.out.println("Test expects false because " + testStr1 + " was already there: " + checkTest1 + "\n");

        //Cake was not in the List. It will add it to the list and return True!
        boolean checkTest2 = OpgArrayList.insertString(testArrayList, testStr2);
        assertTrue(checkTest2);
        System.out.println("Test expects true because " + testStr2 + " wasn't there before: " + checkTest2);

    }


}