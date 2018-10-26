package com.lukmannudin.assosiate.footbalclub

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.widget.ImageView
import android.widget.TextView
import org.jetbrains.anko.*

class SecondActivity : AppCompatActivity() {

    private var name: String = ""
    lateinit var nameTextView: TextView
    lateinit var imageClub: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        verticalLayout {
            padding = dip(16)
            imageClub = imageView {
                setImageResource(R.drawable.arsenal)
            }.lparams(dip(100), dip(100)) {
                gravity = Gravity.CENTER
            }
            nameTextView = textView {
                topPadding = dip(10)
                gravity = Gravity.CENTER
            }
        }

        val intent = intent
        name = intent.getStringExtra("name")

//        if (name.equals("Barcelona FC")){
//            nameTextView.text = getString(R.string.barcelona)
//        } else if(name.equals("Real Madrid FC"))
//            nameTextView.text = getString(R.string.barcelona)
        val clubName = resources.getStringArray(R.array.club_name)
//        when (name) {
//            "Barcelona FC" ->
//                nameTextView.text = getString(R.string.barcelona)
//
////                imageClub.setImageResource(R.drawable.barcelona)
//            "Real Madrid FC" -> nameTextView.text = getString(R.string.realmardid)
//            "Bayern Munchen FC" -> nameTextView.text = getString(R.string.bayernmuchen)
//            "Manchester City FC" -> nameTextView.text = getString(R.string.manchestercity)
//            "Manchester United FC" -> nameTextView.text = getString(R.string.manchesterunited)
//            "Chelsea FC" -> nameTextView.text = getString(R.string.chelsea)
//            "AC Milan FC" -> nameTextView.text = getString(R.string.acmilan)
//            "Arsenal FC" -> nameTextView.text = getString(R.string.arsenal)
//            else -> { // Note the block
//                print("x is neither 1 nor 2")
//            }

        if (name.equals("Barcelona FC")) {
            nameTextView.text = getString(R.string.barcelona)
            imageClub.setImageResource(R.drawable.barcelona)
        } else
        if (name.equals("Real Madrid FC")) {
            nameTextView.text = getString(R.string.realmardid)
            imageClub.setImageResource(R.drawable.realmadrid)
        } else
        if (name.equals("Bayern Munchen FC")) {
            nameTextView.text = getString(R.string.bayernmuchen)
            imageClub.setImageResource(R.drawable.bayernmunchen)
        } else
        if (name.equals("Manchester City FC")) {
            nameTextView.text = getString(R.string.manchestercity)
            imageClub.setImageResource(R.drawable.manchestercity)
        } else
        if (name.equals("Manchester United FC")) {
            nameTextView.text = getString(R.string.manchesterunited)
            imageClub.setImageResource(R.drawable.manchesterunited)
        } else
        if (name.equals("Chelsea FC")) {
            nameTextView.text = getString(R.string.chelsea)
            imageClub.setImageResource(R.drawable.chelsea)
        } else
        if (name.equals("AC Milan FC")) {
            nameTextView.text = getString(R.string.acmilan)
            imageClub.setImageResource(R.drawable.acmilan)
        } else
        if (name.equals("Arsenal FC")) {
            nameTextView.text = getString(R.string.arsenal)
            imageClub.setImageResource(R.drawable.arsenal)
        }


//        nameTextView.text = name
//        nameTextView.text = clubName[2]
    }
//}

}
