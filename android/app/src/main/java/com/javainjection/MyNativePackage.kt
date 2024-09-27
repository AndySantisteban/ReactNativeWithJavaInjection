package com.javainjection

import android.view.View // Importación de View
import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ViewManager
import com.facebook.react.uimanager.ReactShadowNode // Importación de ReactShadowNode
import com.javainjection.MyNativeModule // Importación de MyNativeModule

class MyNativePackage : ReactPackage {
    override fun createViewManagers(
        reactContext: ReactApplicationContext
    ): MutableList<ViewManager<View, ReactShadowNode<*>>> {
        return mutableListOf()
    }

    override fun createNativeModules(
        reactContext: ReactApplicationContext
    ): MutableList<NativeModule>  {
        return mutableListOf(MyNativeModule(reactContext))
    }
}