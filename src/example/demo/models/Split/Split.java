package example.demo.models.Split;

import com.example.demo.models.User;
import lombok.Data;

@Data
public class Split {

    private User user;

    private Double amountOwe;

    public Split(User user, Double amountOwe){
        this.user = user;
        this.amountOwe = amountOwe;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Double getAmountOwe() {
        return amountOwe;
    }

    public void setAmountOwe(Double amountOwe) {
        this.amountOwe = amountOwe;
    }
}
