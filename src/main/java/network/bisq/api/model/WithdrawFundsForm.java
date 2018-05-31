package network.bisq.api.model;

import java.util.List;



import network.bisq.api.model.validation.NotNullItems;
import org.hibernate.validator.constraints.NotEmpty;

public class WithdrawFundsForm {

    public long amount;

    public boolean feeExcluded;

    @NotNullItems
    @NotEmpty
    public List<String> sourceAddresses;

    @NotEmpty
    public String targetAddress;
}
