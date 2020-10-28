package com.peachgenz.test2.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.peachgenz.test2.models.Article

@Dao
interface ArticleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(article: Article): Long

    @Query("SELECT * FROM articles")
    fun getAllArticles(): LiveData<List<Article>>

}