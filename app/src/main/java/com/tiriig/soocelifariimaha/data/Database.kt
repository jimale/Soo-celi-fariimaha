package com.tiriig.soocelifariimaha.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.tiriig.soocelifariimaha.data.model.Chat
import com.tiriig.soocelifariimaha.data.model.Message

@Database(
    entities = [Chat::class,Message::class],
    version = 9,
    exportSchema = true
)

@TypeConverters(Converters::class)
abstract class Database : RoomDatabase() {
    abstract fun userDao(): UserDao
}