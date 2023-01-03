package com.dprootdetect.plugin;


import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.Manifest;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import android.telephony.TelephonyManager;

import com.lankaclear.justpay.LCTrustedSDK;
import com.lankaclear.justpay.callbacks.CreateIdentityCallback;
import com.lankaclear.justpay.callbacks.SignMessageCallback;

/**
 * This class echoes a string called from JavaScript.
 */
public class DpRootDetect extends CordovaPlugin {

    @Override
    public boolean execute(
            String action,
            JSONArray args,
            CallbackContext callbackContext)
            throws JSONException {
        if (action.equals("coolMethod")) {
            String echo = args.getString(0);
            System.out.println("Args in execute");
            System.out.println(echo);
            return true;
        }
        return false;
    }

}
