package view;

import model.Article;

import java.util.ArrayList;

public class ArticleView {

    public void printArticle(Article article){
        System.out.printf("번호 : %d\n", article.getId());

        System.out.printf("제목 : %s\n", article.getTitle());

        System.out.printf("내용 : %s\n", article.getContent());

        System.out.printf("등록날짜 : %s\n", article.getRegDate());

        System.out.printf("조회수 : %d\n", article.getHit());

        System.out.println("==================================");


    }


    public void printArticles(ArrayList<Article> list) {
        for (int i = 0; i < list.size(); i++) {
            Article article = list.get(i);

            System.out.printf("번호 : %d\n", article.getId());

            System.out.printf("제목 : %s\n", article.getTitle());

            System.out.printf("내용 : %s\n", article.getContent());

            System.out.printf("등록날짜 : %s\n", article.getRegDate());

            System.out.printf("조회수 : %d\n", article.getHit());

            System.out.println("==================================");


        }
    }
}
