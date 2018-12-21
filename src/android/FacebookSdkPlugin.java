package me.mingz.cordova.facebook;

import com.facebook.FacebookSdk;

public class FacebookSdkPlugin extends CordovaPlugin {

    String TAG = "<FacebookSdkPlugin>: ";


    private Activity getActivity() {
        return cordova.getActivity();
    }

    /*************************overwrite******************************/

    @Override
    protected void pluginInitialize() {
        super.pluginInitialize();
    }

    @Override
    public void onResume(boolean multitasking) {

        super.onResume(multitasking);
    }


    @Override
    public void onPause(boolean multitasking) {


        super.onPause(multitasking);
    }


    @Override
    public void onDestroy() {

        super.onDestroy();
    }







}