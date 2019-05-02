package com.moeapk

import android.app.Application
import com.lzy.okgo.interceptor.HttpLoggingInterceptor
import okhttp3.OkHttpClient
import java.util.logging.Level

/**
 * 自定义Application
 * 初始化组件及保持一些运行时数据
 *
 * @author Attect
 * @date 2019-5-2
 */
open class Application : Application() {

    override fun onCreate() {
        super.onCreate()
        initOkGo()
    }

    private fun initOkGo() {
        OkHttpClient.Builder().apply {
            HttpLoggingInterceptor("okGO").apply {
                if (BuildConfig.DEBUG) {
                    setColorLevel(Level.ALL)
                } else {
                    setColorLevel(Level.OFF)
                }
                addInterceptor(this)
            }
        }
    }
}