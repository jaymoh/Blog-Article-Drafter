package com.hackinroms.articledrafter;

import com.google.gson.annotations.SerializedName;


public class SingleArticleResponse {

    @SerializedName("data")
    private Article article;

    @SerializedName("api_version")
    private String apiVersion;

    @SerializedName("author_url")
    private String authorUrl;

    public SingleArticleResponse(Article article, String apiVersion, String authorUrl) {
        this.article = article;
        this.apiVersion = apiVersion;
        this.authorUrl = authorUrl;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getAuthorUrl() {
        return authorUrl;
    }

    public void setAuthorUrl(String authorUrl) {
        this.authorUrl = authorUrl;
    }
}
