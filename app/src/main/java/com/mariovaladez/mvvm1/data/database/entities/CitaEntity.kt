package com.mariovaladez.mvvm1.data.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.mariovaladez.mvvm1.domain.model.Cita

@Entity(tableName = "cita_table")
data class CitaEntity (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id:Int=0,
    @ColumnInfo(name = "cita") val cita:String,
    @ColumnInfo(name = "autor")val autor:String
)

fun Cita.toDatabase()=CitaEntity(cita = cita, autor = autor)