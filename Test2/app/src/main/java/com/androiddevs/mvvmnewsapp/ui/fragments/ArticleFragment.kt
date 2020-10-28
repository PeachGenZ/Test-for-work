package com.peachgenz.test2.ui.fragments

import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.peachgenz.test2.R
import com.peachgenz.test2.ui.NewsActivity
import com.peachgenz.test2.ui.NewsViewModel
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_article.*
import kotlinx.android.synthetic.main.item_article_preview.view.*

class ArticleFragment : Fragment(R.layout.fragment_article) {

    lateinit var viewModel: NewsViewModel
    val args: ArticleFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel

        val article = args.article
        Glide.with(this).load(article.urlToImage).into(ivContent)
        tvTopicContent.text = article.title
        tvAuthorContent.text = article.author
        tvPublishedAtContent.text = article.publishedAt
        tvContent.text = article.content
    }
}