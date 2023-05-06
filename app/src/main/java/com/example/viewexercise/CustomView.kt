package com.example.viewexercise

import android.content.Context
import android.util.AttributeSet
import android.view.Gravity
import android.view.View
import android.widget.TextView

class CustomView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int=0) : androidx.appcompat.widget.AppCompatTextView(context, attrs){

    var showText : Boolean = false
    var textPos : Int = 0

    companion object{
        const val LEFT = 0
        const val RIGHT = 1
    }
    init{
        context.obtainStyledAttributes(attrs, R.styleable.CustomView).apply{
                try{
                    showText = getBoolean(R.styleable.CustomView_showText,false)
                    textPos = getInt(R.styleable.CustomView_labelPosition,0)
                    if(!showText){
                        text=""
                    }
                    when(textPos){
                        LEFT -> gravity = Gravity.START
                        RIGHT -> gravity = Gravity.END
                    }
                } finally{
                    recycle()
                }
        }
    }
}