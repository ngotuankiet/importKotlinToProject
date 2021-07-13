package com.importkotlintoproject.test_kotlin

import android.util.Log
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

class CalendarModule constructor(val context : ReactApplicationContext): ReactContextBaseJavaModule() {
    override fun getName(): String  = "CalendarModule"

    @ReactMethod
    fun createCalendarEvent(name : String, location: String){
        Log.d("CalendarModule", "Create event called with name: " + name
                + " and location: " + location)
    }


}