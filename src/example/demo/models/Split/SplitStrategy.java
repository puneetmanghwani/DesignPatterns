package example.demo.models.Split;

import java.util.List;

public interface SplitStrategy {

    public Boolean validateSplit(List<Split> splitList, Double amount);

}
