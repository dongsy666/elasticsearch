package com.dsy.utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;
import java.util.List;

/**
 * @author trueway
 */
public class HtmlParseUtils {
    public static void main(String[] args) throws IOException {

    }

    public List<Object> parseJD(String keyword)throws IOException {
        //获取请求  https://search.jd.com/Search?keyword=java
        //前提,需要联网,    ajax不能获取到,需要模拟浏览器才能获取到
        String url="https://search.jd.com/Search?keyword=java";
        try {
            SslUtils.ignoreSsl();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //解析页面   (Jsoup返回Document就是浏览器的Document对象)
        Document document = Jsoup.parse(new URL(url), 30000);
        //所有你在js中可以使用的方法,这里都能用
        Element element = document.getElementById("J_goodsList");
        //获取所有的li元素
        Elements elements = element.getElementsByTag("li");
        //获取元素中的内容,这里el就是每个li标签了
        for (Element el : elements) {
            //关于这种图片特别多的网站,所有图片都是延迟加载的
            //source-data-lazy-img
            String img = el.getElementsByTag("img").eq(0).attr("src");
            String price = el.getElementsByClass("p-price").eq(0).text();
            String title = el.getElementsByClass("p-name").eq(0).text();
            System.out.println("=================");
            System.out.println(img);
            System.out.println(price);
            System.out.println(title);
        }
    return null;
    }

}
