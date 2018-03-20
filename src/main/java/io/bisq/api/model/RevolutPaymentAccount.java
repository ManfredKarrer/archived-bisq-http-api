package io.bisq.api.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.bisq.core.payment.payload.PaymentMethod;
import org.hibernate.validator.constraints.NotBlank;

@JsonTypeName(PaymentMethod.REVOLUT_ID)
public class RevolutPaymentAccount extends PaymentAccount {

    @NotBlank
    public String accountId;

    public RevolutPaymentAccount() {
        paymentMethod = PaymentMethod.REVOLUT_ID;
    }
}
