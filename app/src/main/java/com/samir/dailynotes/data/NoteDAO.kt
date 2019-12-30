package com.samir.dailynotes.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.samir.dailynotes.data.Note

/**
 * Created by Mahmoud Samir  on 30/12/2019.
 * MahmoudSamirFarag@gmail.com
 */
@Dao
interface NoteDAO {

    @Insert
    fun insert(note: Note)

    @Update
    fun update(note: Note)

    @Delete
    fun delete(note: Note)

    @Query("DELETE FROM note_table")
    fun deleteAll()

    // we made it LiveData, so , we can observe any change in the list.
    @Query("SELECT * FROM note_table ORDER BY priority DESC")
    fun getAllNotes(): LiveData<List<Note>>
}