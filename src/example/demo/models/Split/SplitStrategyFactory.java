package example.demo.models.Split;

public class SplitStrategyFactory {

    public static SplitStrategy getSplitStrategy(SplitType splitType){

        switch (splitType){
            case EQUAL:
                return new EqualSplitStrategy();
            default:
                return null;
        }

    }

}
