package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.logging.Logger;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws IOException {

        System.setProperty("http.proxyHost", "127.0.0.1");
        System.setProperty("http.proxyPort", "1080");
        Document doc = Jsoup //
                .connect("https://twitter.com/elonmusk")  //("https://twitter.com/elonmusk")
                .userAgent("Mozilla/5.0 (Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 YaBrowser/24.1.0.0 Safari/537.36")
                .header("Content-Language", "en-US")
                .get();
        //Document doc = Jsoup.connect("https://twitter.com/elonmusk").get();


       // System.out.println(doc.toString());
        log.info(doc.toString());

    }
}



//        Proxy proxy = new Proxy(
//                Proxy.Type.HTTP,
//               new InetSocketAddress("192.168.5.1", 1080)
//     );



        /*Document doc = Jsoup //
                        .connect("https://https://twitter.com/elonmusk")  //("https://twitter.com/elonmusk")
                        .userAgent("Mozilla/5.0 (Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 YaBrowser/24.1.0.0 Safari/537.36")
                        .header("Content-Language", "en-US")
                        .get();


    URL url = new URL("https://oracle.com");
    BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

    String text;
        while ((text = reader.readLine()) != null) {
                System.out.println(text);
                }

                System.out.println(text);


        Document test = Jsoup.connect(url).get();
        Element tweet = test.select("p.tweet-text.tweet-text").first();
        System.out.println(tweet.toString());*/