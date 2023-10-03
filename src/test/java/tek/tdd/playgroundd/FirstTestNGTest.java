package tek.tdd.playgroundd;

import org.testng.annotations.*;

public class FirstTestNGTest {
    @BeforeTest
    public void runBeforeTestClass(){
        System.out.println("This test will execute before test class");
    }
    @AfterTest
    public void runAfterTestClass(){
        System.out.println("This will execute after test class");
    }
    @BeforeMethod
    public void runBeforeTest(){
        System.out.println("this Method run before each test");
    }
    @AfterMethod
    public void runAfterTest(){
        System.out.println("This method run after each test");
    }
    @Test
    public void myFirstTest(){
        System.out.println("This is My first test from testNG");

    }
    @Test
    public void mySecondTest(){
        System.out.println("This is my second test");

    }
    private void doSomething(){
        System.out.println("This is private method");
    }
}
