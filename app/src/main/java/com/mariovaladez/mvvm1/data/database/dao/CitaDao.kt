package com.mariovaladez.mvvm1.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.mariovaladez.mvvm1.data.database.entities.CitaEntity

@Dao
interface CitaDao {

    @Query("SELECT * FROM cita_table ORDER BY autor DESC")
    suspend fun getAllCitas():List<CitaEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun  insertAll(citas:List<CitaEntity>)

    @Query("DELETE FROM cita_table")
    suspend fun deleteAllCitas()
}