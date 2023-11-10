package com.hs.islamic.recyclerviewinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.hs.islamic.recyclerviewinkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    private lateinit var foodList:ArrayList<FoodModelClass>
    private lateinit var foodAdapter: FoodAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        foodList=ArrayList()
        binding.recyclerview.setHasFixedSize(true)

       binding.recyclerview.layoutManager=LinearLayoutManager(this)


        foodList.add(FoodModelClass(R.drawable.pastie,"pastie"))
        foodList.add(FoodModelClass(R.drawable.pizza,"pizza"))
        foodList.add(FoodModelClass(R.drawable.rassmilai,"rassmilai"))
        foodList.add(FoodModelClass(R.drawable.rice,"rice"))
        foodList.add(FoodModelClass(R.drawable.rasspic,"Sweet Dish"))
        foodList.add(FoodModelClass(R.drawable.sampleimg,"chicken"))
        foodList.add(FoodModelClass(R.drawable.seekh,"seekh"))
        foodList.add(FoodModelClass(R.drawable.sheerqurma,"sheerqurma"))
        foodList.add(FoodModelClass(R.drawable.shuwrama,"shuwrama"))
        foodList.add(FoodModelClass(R.drawable.burger,"burger"))
        foodList.add(FoodModelClass(R.drawable.buriyani,"buriyani"))
        foodList.add(FoodModelClass(R.drawable.icecream,"icecream"))
        foodList.add(FoodModelClass(R.drawable.pastaa,"pasta"))


        foodAdapter=FoodAdapter(foodList)
        binding.recyclerview.adapter=foodAdapter















    }
}