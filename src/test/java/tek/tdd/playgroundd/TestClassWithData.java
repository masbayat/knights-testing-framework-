package tek.tdd.playgroundd;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestClassWithData {
    @Test(dataProvider = "names")
    public void testWithData(String firstParam, String secondParam){
        //print first name,
        String firstName = "Masood";
        System.out.println("First name " + firstParam);

        String lastName = "Bayat";
        System.out.println("last Name"+secondParam);
    }
    // Date provider is a method that return 2D array object.
    @DataProvider(name ="names")
    public String[][] testData(){
        String[][]data = {
                {"Masood" , " Bayat"},
                {"John" , " Smith"},
                {"Farhan" , " Bayat"},
        };
        return data;
    }
}
