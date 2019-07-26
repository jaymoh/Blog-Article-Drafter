package com.hackinroms.articledrafter.rest;

import com.hackinroms.articledrafter.ArticlesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("articles")
    Call<ArticlesResponse> getArticles();

    @GET("article/{id}")
    Call<ArticlesResponse> getArticle(@Path("id") Integer id);

}
