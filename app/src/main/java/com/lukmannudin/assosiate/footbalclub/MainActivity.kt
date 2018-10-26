package com.lukmannudin.assosiate.footbalclub

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {
    private var items: MutableList<Item> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val list = findViewById<RecyclerView>(R.id.club_list)
        initData()

//        list.layoutManager = LinearLayoutManager(this)
//        list.adapter = RecyclerViewAdapter(this, items)
        club_list.layoutManager = LinearLayoutManager(this)
        club_list.adapter = RecyclerViewAdapter(this,items, {items : Item -> partItemClicked(items)})

    }


    private fun partItemClicked(items : Item) {
//        Toast.makeText(this, "Clicked: ${items.name}", Toast.LENGTH_LONG).show()
        startActivity<SecondActivity>("name" to "${items.name}")
    }

    private fun initData(){
        val name = resources.getStringArray(R.array.club_name)
        val image = resources.obtainTypedArray(R.array.club_image)
        items.clear()
        for (i in name.indices) {
            items.add(Item(name[i],
                image.getResourceId(i, 0)))
        }

        //Recycle the typed array
        image.recycle()
    }

}
