package com.flutterwave.raveandroid.barter;


import com.flutterwave.raveandroid.Payload;
import com.flutterwave.raveandroid.ViewObject;

import java.util.HashMap;

public class NullBarterView implements BarterContract.View {
    @Override
    public void showFieldError(int viewID, String message, Class<?> viewType) {

    }

    @Override
    public void onValidationSuccessful(HashMap<String, ViewObject> dataHashMap) {

    }

    @Override
    public void showProgressIndicator(boolean active) {

    }

    @Override
    public void showFetchFeeFailed(String message) {

    }

    @Override
    public void loadBarterCheckout(String authUrlCrude, String flwRef) {

    }

    @Override
    public void onPaymentError(String message) {

    }

    @Override
    public void showToast(String message) {

    }

    @Override
    public void displayFee(String charge_amount, Payload payload) {

    }

    @Override
    public void showPollingIndicator(boolean active) {

    }

    @Override
    public void onPaymentSuccessful(String responseAsString) {

    }

    @Override
    public void onPaymentFailed(String message, String responseAsJSONString) {

    }

    @Override
    public void onPollingRoundComplete(String flwRef, String publicKey) {

    }

    @Override
    public void onAmountValidationSuccessful(String amountToPay) {

    }
}
