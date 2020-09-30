package com.sabgil.extraof

import android.app.Activity

inline fun <reified T : Activity, B> T.extraOf(): ExtraValueHolder<B> {
    return ExtraValueHolder { fieldName ->
        @Suppress("UNCHECKED_CAST")
        ExtraMapper.map(fieldName, intent, this::class.java) as B
    }
}