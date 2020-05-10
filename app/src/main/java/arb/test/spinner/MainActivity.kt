package arb.test.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val list = listOf("kotlin","java","c#","js","py","html","css","php","node js ","kotlin","java","c#","js","py","html","css","php","node js ","kotlin","java","c#","js","py","html","css","php","node js ","kotlin","java","c#","js","py","html","css","php","node js ","kotlin","java","c#","js","py","html","css","php","node js ","kotlin","java","c#","js","py","html","css","php","node js ","kotlin","java","c#","js","py","html","css","php","node js ","kotlin","java","c#","js","py","html","css","php","node js ")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var adapterTest = ArrayAdapter(this,android.R.layout.simple_list_item_1,list)

        spinner.adapter = adapterTest

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {}

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(applicationContext,"${list[position]}",Toast.LENGTH_SHORT).show()
            }

        }
    }
}
