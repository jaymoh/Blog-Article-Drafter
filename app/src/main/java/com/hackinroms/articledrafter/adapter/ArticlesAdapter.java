package com.hackinroms.articledrafter.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hackinroms.articledrafter.Article;
import com.hackinroms.articledrafter.R;

import java.util.List;

public class ArticlesAdapter extends RecyclerView.Adapter<ArticlesAdapter.ArticleViewHolder> {

    private List<Article> articleList;
    private int rowLayout;
    private Context context;

    public ArticlesAdapter(List<Article> articleList, int rowLayout, Context context) {
        this.articleList = articleList;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    public class ArticleViewHolder extends RecyclerView.ViewHolder {
        LinearLayout articlesLayout;
        TextView articleTitle;
        TextView articleBody;
        TextView articleId;


        public ArticleViewHolder(@NonNull View view) {
            super(view);

            articlesLayout = (LinearLayout)view.findViewById(R.id.article_layout);
            articleTitle = (TextView)view.findViewById(R.id.article_title);
            articleBody = (TextView)view.findViewById(R.id.article_body);
            articleId = (TextView)view.findViewById(R.id.article_id);
        }
    }

    @NonNull
    @Override
    public ArticleViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(rowLayout, viewGroup, false);
        return new ArticleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ArticleViewHolder articleViewHolder, int position) {
        articleViewHolder.articleId.setText(String.valueOf(articleList.get(position).getId()));
        articleViewHolder.articleTitle.setText(articleList.get(position).getTitle());
        articleViewHolder.articleBody.setText(articleList.get(position).getBody());

    }

    @Override
    public int getItemCount() {
        return articleList.size();
    }
}
