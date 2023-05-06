package com.example.viewexercise

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView

class IntroButton(context : Context, attrs : AttributeSet) : FrameLayout(context, attrs){

    lateinit var title : TextView
    lateinit var buttonImageView: ImageView
    lateinit var introButton : FrameLayout

    init{
        val infService = Context.LAYOUT_INFLATER_SERVICE
        val li = context.getSystemService(infService) as LayoutInflater
        val view = li.inflate(R.layout.introbutton, this, false)
        addView(view)

        title = findViewById<TextView>(R.id.introButtonTV)
        buttonImageView = findViewById<ImageView>(R.id.introButtonIV)
        introButton = findViewById<FrameLayout>(R.id.introButton)


        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.IntroButton)

        val titleText = typedArray.getString(R.styleable.IntroButton_title) ?: ""
        val titleColor = typedArray.getColor(R.styleable.IntroButton_setTitleColor, 0)
        val buttonImage = typedArray.getResourceId(R.styleable.IntroButton_button_icon, -1)
        val setStroke = typedArray.getInt(R.styleable.IntroButton_setStroke, 0)


        typedArray.recycle()
    }

}



