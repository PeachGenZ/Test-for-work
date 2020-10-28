package com.peachgenz.test2.db

import androidx.room.TypeConverter
import com.peachgenz.test2.models.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }
}