package com.hackinroms.articledrafter;

import com.google.gson.annotations.SerializedName;

public class ArticleLinks {
    @SerializedName("first")
    private String FirstPageLink;

    @SerializedName("last")
    private String LastPageLink;

    @SerializedName("prev")
    private String PrevPageLink;

    @SerializedName("next")
    private String NextPageLink;


    public ArticleLinks(String firstPageLink, String lastPageLink, String prevPageLink, String nextPageLink){
        this.FirstPageLink = firstPageLink;
        this.LastPageLink = lastPageLink;
        this.PrevPageLink = prevPageLink;
        this.NextPageLink = nextPageLink;
    }

    public String getFirstPageLink() {
        return FirstPageLink;
    }

    public void setFirstPageLink(String firstPageLink) {
        FirstPageLink = firstPageLink;
    }

    public String getLastPageLink() {
        return LastPageLink;
    }

    public void setLastPageLink(String lastPageLink) {
        LastPageLink = lastPageLink;
    }

    public String getPrevPageLink() {
        return PrevPageLink;
    }

    public void setPrevPageLink(String prevPageLink) {
        PrevPageLink = prevPageLink;
    }

    public String getNextPageLink() {
        return NextPageLink;
    }

    public void setNextPageLink(String nextPageLink) {
        NextPageLink = nextPageLink;
    }
}
