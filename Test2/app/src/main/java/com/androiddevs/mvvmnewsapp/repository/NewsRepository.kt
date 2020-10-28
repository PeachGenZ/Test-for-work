package com.peachgenz.test2.repository

import com.peachgenz.test2.api.RetrofitInstance
import com.peachgenz.test2.db.ArticleDatabase

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

}