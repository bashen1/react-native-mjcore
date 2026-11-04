package cn.jiguang.plugins.core;

import android.text.TextUtils;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;

import cn.jiguang.api.utils.JCollectionAuth;
import cn.jiguang.api.JCoreInterface;

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
    public void setAuth(boolean bool) {
        JCollectionAuth.setAuth(reactContext, bool);
    }

    @ReactMethod
    public void enableAutoWakeup(boolean bool) {
        JCollectionAuth.enableAutoWakeup(reactContext, bool);
    }

    @ReactMethod
    public void setCountryCode(ReadableMap readableMap) {
        if (readableMap == null) {
            return;
        }
        String code = readableMap.getString("code");
        if (TextUtils.isEmpty(code)) {
        } else {
            JCoreInterface.setCountryCode(reactContext, code);
        }
    }
}
