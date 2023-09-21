package model;

import Util.util;
import view.ArticleView;

import java.util.ArrayList;


public class ArticleRepository {
    util util = new util();
    ArrayList<Article> articles = new ArrayList<>();

    int lastId = 4;


    ArticleView articleView = new ArticleView();


    public ArticleRepository() {


        Article a1 = new Article(1, "안녕하세요 반갑습니다. 자바 공부중이에요.", "", util.getCurrent());
        Article a2 = new Article(2, "자바 너무 재밌어요~.", "", util.getCurrent());
        Article a3 = new Article(3, "정처기 따야되나요?.", "", util.getCurrent());

        articles.add(a1);
        articles.add(a2);
        articles.add(a3);

    }

    public ArrayList<Article> findAllArticles() {
        return articles;
    }

    public void insert(String title, String content) {

        Article article = new Article(lastId, title, content, util.getCurrent());
        articles.add(article);
        lastId++;
    }


    public Article findById(int id) {
        Article target = null;
        for (int i = 0; i < articles.size(); i++) {
            Article article = articles.get(i);
            if (id == article.getId()) {
                target = article;
            }

        }
        return target;
    }

    public void delete(Article article) {
        articles.remove(article);

    }

    public ArrayList<Article> findByKeyword(String keyword) {
        ArrayList<Article> searchedArticles = new ArrayList<>();

        for (int i = 0; i < articles.size(); i++) {


            Article article = articles.get(i);


            if (article.getTitle().contains(keyword)) {

                searchedArticles.add(article);


            }


        }


        return searchedArticles;
    }




}
