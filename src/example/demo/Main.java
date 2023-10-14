package example.demo;

import com.example.demo.services.SplitWiseService;

public class Main {

    public static void main(String[] args){

        SplitWiseService splitWiseService = new SplitWiseService();
        splitWiseService.initializeData();
        splitWiseService.demo();
    }

}
