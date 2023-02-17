package genie.demo;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GenieCrawling {
	
	public static void main(String[] args) {
	
		String name ="아이유";
		String url="https://www.genie.co.kr/search/searchSong?query=" + name;
		Document doc = null;
		
		
		try {
			 
			 doc = Jsoup.connect(url).get();	//Document에는 페이지의 전체 소스가 저장된다
			 
			 } 
			 catch (IOException e) {
			 
			 e.printStackTrace();
			 
			 }
			    
			 //select를 이용하여 원하는 태그를 선택한다.

			 Elements element = doc.select("tr.list");		// MV 리스트가 있는 태그
			 String defaulturl = "https://www.genie.co.kr/detail/mediaInfo?xvnm=";
			    
			 for (Element element1 : element) {
			 System.out.println("제목 : " + element1.select("td a").attr("title") );	//제목 크롤링
			 System.out.println("url : " + defaulturl + element1.attr("mvid") );		//url id 크롤링
			 System.out.println("앨범 : " + element1.select("td a img").attr("src") + "\n" );	//썸네일 크롤링
			 }


		}

	}
	


