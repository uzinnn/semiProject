package semi.genie.demo;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GenieCrawling {
}
//	Document doc = null;
//	String name ="아이유";
//	String url="https://www.genie.co.kr/search/searchSong?query=" + name;
//	//"https://www.melon.com/search/total/index.htm?q=%EC%95%84%EC%9D%B4%EC%9C%A0"
//
//	
//	
//	try {
//		 
//		 doc = Jsoup.connect(url).get();	//Document에는 페이지의 전체 소스가 저장된다
//		 
//		 } 
//		 catch (IOException e) {
//		 
//		 e.printStackTrace();
//		 
//		 }
//		    
//		 //select를 이용하여 원하는 태그를 선택한다.
//
//		 Elements element = doc.select("tr.list");		// MV 리스트가 있는 태그
//		 String defaulturl = "https://www.genie.co.kr/detail/mediaInfo?xvnm=";
//		    
//		 for (Element element1 : element) {
//		 System.out.println("제목 : " + element1.select("td a").attr("title") );	//제목 크롤링
//		 System.out.println("url : " + defaulturl + element1.attr("mvid") );		//url id 크롤링
//		 System.out.println("앨범 : " + element1.select("td a img").attr("src") + "\n" );	//썸네일 크롤링
//		 }
//
//	String name1 ="빅뱅";
//	String url1="https://www.genie.co.kr/search/searchSong?query=" + name1;
//	Document doc1 = null;
//	
//	
//	try {
//		 
//		 doc1 = Jsoup.connect(url1).get();	//Document에는 페이지의 전체 소스가 저장된다
//		 
//		 } 
//		 catch (IOException e) {
//		 
//		 e.printStackTrace();
//		 
//		 }
//		    
//		 //select를 이용하여 원하는 태그를 선택한다.
//
//		 Elements element1 = doc1.select("tr.list");		// MV 리스트가 있는 태그
//		 String defaulturl1 = "https://www.genie.co.kr/detail/mediaInfo?xvnm=";
//		    
//		 for (Element element11 : element1) {
//		 System.out.println("제목 : " + element11.select("td a").attr("title") );	//제목 크롤링
//		 System.out.println("url : " + defaulturl1 + element11.attr("mvid") );		//url id 크롤링
//		 System.out.println("앨범 : " + element11.select("td a img").attr("src") + "\n" );	//썸네일 크롤링
//		 }
//	}
//	
	


