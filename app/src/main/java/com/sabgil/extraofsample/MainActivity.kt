package com.sabgil.extraofsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sabgil.annotation.Extra

class MainActivity : AppCompatActivity() {

    @Extra
    private val a: Int = 0

    @Extra
    private val b: String = ""

    @Extra
    private val c: Test? = null

    @Extra
    private val d: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(Mapper.map("b", intent, this.javaClass))
    }

    class Test
}