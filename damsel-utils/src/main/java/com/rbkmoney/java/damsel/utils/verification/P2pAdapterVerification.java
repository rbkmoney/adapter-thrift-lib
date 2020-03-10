package com.rbkmoney.java.damsel.utils.verification;

import com.rbkmoney.damsel.p2p_adapter.CallbackResult;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class P2pAdapterVerification {

    public static boolean isSuccess(CallbackResult callbackResult) {
        return callbackResult.getIntent().getFinish().getStatus().isSetSuccess();
    }

    public static boolean isSleep(CallbackResult callbackResult) {
        return callbackResult.getIntent().isSetSleep();
    }

    public static boolean isFailure(CallbackResult callbackResult) {
        return callbackResult.getIntent().getFinish().getStatus().isSetFailure();
    }

}
