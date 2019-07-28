package com.hackinroms.articledrafter;

import com.google.gson.annotations.SerializedName;

public class ArticleMeta {

    @SerializedName("current_page")
    private int currentPage;

    @SerializedName("from")
    private int fromOffset;

    @SerializedName("last_page")
    private int lastPage;

    @SerializedName("path")
    private String urlPath;

    @SerializedName("per_page")
    private int articlesPerPage;

    @SerializedName("to")
    private int toOffset;

    @SerializedName("total")
    private int totalArticles;

    public ArticleMeta(int currentPage, int fromOffset, int lastPage, String urlPath, int articlesPerPage, int toOffset, int totalArticles) {
        this.currentPage = currentPage;
        this.fromOffset = fromOffset;
        this.lastPage = lastPage;
        this.urlPath = urlPath;
        this.articlesPerPage = articlesPerPage;
        this.toOffset = toOffset;
        this.totalArticles = totalArticles;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getFromOffset() {
        return fromOffset;
    }

    public void setFromOffset(int fromOffset) {
        this.fromOffset = fromOffset;
    }

    public int getLastPage() {
        return lastPage;
    }

    public void setLastPage(int lastPage) {
        this.lastPage = lastPage;
    }

    public String getUrlPath() {
        return urlPath;
    }

    public void setUrlPath(String urlPath) {
        this.urlPath = urlPath;
    }

    public int getArticlesPerPage() {
        return articlesPerPage;
    }

    public void setArticlesPerPage(int articlesPerPage) {
        this.articlesPerPage = articlesPerPage;
    }

    public int getToOffset() {
        return toOffset;
    }

    public void setToOffset(int toOffset) {
        this.toOffset = toOffset;
    }

    public int getTotalArticles() {
        return totalArticles;
    }

    public void setTotalArticles(int totalArticles) {
        this.totalArticles = totalArticles;
    }
}

