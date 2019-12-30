package com.samir.dailynotes.data

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Mahmoud Samir  on 30/12/2019.
 * MahmoudSamirFarag@gmail.com
 */
@Entity (tableName = "note_table")
class Note(
    var title: String,
    var description: String,
    var priority: Int
) {
    @PrimaryKey(autoGenerate = true)
    private var id = 0
}