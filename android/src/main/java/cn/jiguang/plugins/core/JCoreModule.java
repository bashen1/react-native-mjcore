
package cn.jiguang.plugins.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;

import org.json.JSONObject;

import java.util.HashSet;
import java.util.Set;

import cn.jiguang.api.utils.JCollectionAuth;


public class JCoreModule extends ReactContextBaseJavaModule {

    public static ReactApplicationContext reactContext;


    public JCoreModule(ReactApplicationContext reactApplicationContext) {
        super(reactContext);
        reactContext = reactApplicationContext;
    }

    @Override
    public String getName() {
        return "JCoreModule";
    }

    @ReactMethod
    public void setAuth(boolean bool){
        JCollectionAuth.setAuth(reactContext,bool);
    }


}
