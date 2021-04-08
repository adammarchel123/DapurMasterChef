package com.example.dapurmasterchef.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.dapurmasterchef.models.FoodRecipe
import com.example.dapurmasterchef.util.Constants.Companion.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipe
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}