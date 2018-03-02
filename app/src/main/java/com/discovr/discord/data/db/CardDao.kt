package com.discovr.discord.data.db

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import android.arch.persistence.room.Update

import com.discovr.discord.model.Card

import io.reactivex.Single

@Dao
interface CardDao {

    // TODO add random
    @Query("SELECT * FROM card")
    fun findAll(): Single<List<Card>>

    @Query("SELECT * FROM card WHERE id LIKE :id")
    fun findById(id: Int): Single<Card>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(card: List<Card>): List<Long>

    @Update
    fun update(card: Card)

    @Delete
    fun delete(card: Card)
}