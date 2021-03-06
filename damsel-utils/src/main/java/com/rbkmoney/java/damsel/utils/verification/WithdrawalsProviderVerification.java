package com.rbkmoney.java.damsel.utils.verification;

import com.rbkmoney.damsel.withdrawals.provider_adapter.ProcessResult;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class WithdrawalsProviderVerification {

    public static boolean isSleep(ProcessResult processResult) {
        return processResult.getIntent().isSetSleep();
    }

    public static boolean isSuccess(ProcessResult processResult) {
        return processResult.getIntent().getFinish().getStatus().isSetSuccess();
    }

}
