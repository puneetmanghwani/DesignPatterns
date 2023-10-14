package example.demo.models.Split;

import java.util.List;

public class EqualSplitStrategy implements SplitStrategy{

    @Override
    public Boolean validateSplit(List<Split> splitList, Double amount){
        Integer totalSplits = splitList.size();
        Double expectedSplitAmount = amount/totalSplits;

        for(Split split : splitList){
            if(!split.getAmountOwe().equals(expectedSplitAmount)){
                return false;
            }
        }

        return true;
    }

}
