package example.demo.models;

import lombok.Data;

@Data
public class Balance {

    private Double amountOwe;

    private Double amountGetBack;

    public Balance() {
        this.amountOwe = 0.0;
        this.amountGetBack = 0.0;
    }

    public Double getAmountOwe() {
        return amountOwe;
    }

    public void setAmountOwe(Double amountOwe) {
        this.amountOwe = amountOwe;
    }

    public Double getAmountGetBack() {
        return amountGetBack;
    }

    public void setAmountGetBack(Double amountGetBack) {
        this.amountGetBack = amountGetBack;
    }
}
