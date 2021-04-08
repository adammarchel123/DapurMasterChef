package com.example.dapurmasterchef.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.dapurmasterchef.models.Result
import com.example.dapurmasterchef.util.Constants.Companion.FAVORITE_RECIPES_TABLE

@Entity(tableName = FAVORITE_RECIPES_TABLE)
class FavoritesEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var result: Result
)