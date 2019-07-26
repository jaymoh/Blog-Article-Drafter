package com.hackinroms.articledrafter;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ArticlesResponse {
    @SerializedName("data")
    private List<Article> data;

    @SerializedName("links")
    private ArticleLinks articleLinks;

    @SerializedName("meta")
    private ArticleMeta articleMeta;

    public ArticlesResponse(List<Article> data, ArticleLinks articleLinks, ArticleMeta articleMeta) {
        this.data = data;
        this.articleLinks = articleLinks;
        this.articleMeta = articleMeta;
    }

    public List<Article> getData() {
        return data;
    }

    public void setData(List<Article> data) {
        this.data = data;
    }

    public ArticleLinks getArticleLinks() {
        return articleLinks;
    }

    public void setArticleLinks(ArticleLinks articleLinks) {
        this.articleLinks = articleLinks;
    }

    public ArticleMeta getArticleMeta() {
        return articleMeta;
    }

    public void setArticleMeta(ArticleMeta articleMeta) {
        this.articleMeta = articleMeta;
    }
}
