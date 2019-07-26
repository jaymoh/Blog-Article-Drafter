package com.hackinroms.articledrafter;

import com.google.gson.annotations.SerializedName;

public class ArticleMeta {

    @SerializedName("current_page")
    private Integer CurrentPage;

    @SerializedName("from")
    private Integer FromOffset;

    @SerializedName("last_page")
    private Integer LastPage;

    @SerializedName("path")
    private String UrlPath;

    @SerializedName("per_page")
    private Integer ArticlesPerPage;

    @SerializedName("to")
    private Integer ToOffset;

    @SerializedName("total")
    private Integer TotalArticles;

    public ArticleMeta(Integer currentPage, Integer fromOffset, Integer lastPage, String urlPath, Integer articlesPerPage, Integer toOffset, Integer totalArticles) {
        CurrentPage = currentPage;
        FromOffset = fromOffset;
        LastPage = lastPage;
        UrlPath = urlPath;
        ArticlesPerPage = articlesPerPage;
        ToOffset = toOffset;
        TotalArticles = totalArticles;
    }

    public Integer getCurrentPage() {
        return CurrentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        CurrentPage = currentPage;
    }

    public Integer getFromOffset() {
        return FromOffset;
    }

    public void setFromOffset(Integer fromOffset) {
        FromOffset = fromOffset;
    }

    public Integer getLastPage() {
        return LastPage;
    }

    public void setLastPage(Integer lastPage) {
        LastPage = lastPage;
    }

    public String getUrlPath() {
        return UrlPath;
    }

    public void setUrlPath(String urlPath) {
        UrlPath = urlPath;
    }

    public Integer getArticlesPerPage() {
        return ArticlesPerPage;
    }

    public void setArticlesPerPage(Integer articlesPerPage) {
        ArticlesPerPage = articlesPerPage;
    }

    public Integer getToOffset() {
        return ToOffset;
    }

    public void setToOffset(Integer toOffset) {
        ToOffset = toOffset;
    }

    public Integer getTotalArticles() {
        return TotalArticles;
    }

    public void setTotalArticles(Integer totalArticles) {
        TotalArticles = totalArticles;
    }
}

