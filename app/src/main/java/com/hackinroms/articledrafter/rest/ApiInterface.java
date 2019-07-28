package com.hackinroms.articledrafter.rest;

import com.hackinroms.articledrafter.ArticlesResponse;
import com.hackinroms.articledrafter.SingleArticleResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("articles")
    Call<ArticlesResponse> getArticles(@Query("page") int pageNumber);

    @GET("article/{id}")
    Call<SingleArticleResponse> getArticle(@Path("id") int id);

}
