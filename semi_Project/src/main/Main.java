package main;
import java.sql.Connection;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import melon.demo.MelonCrawling;
import semi.song.dao.SongDao;
import semi.song.vo.SongVo;

public class Main {
	
	
	public static void main(String[] args) {
		ArrayList<SongVo> SL = new ArrayList<SongVo>();
		MelonCrawling.Crawling(SL);
		
		SongDao.UploadToDB(SL);
	
		
	}
	
	
//	public static void main(String[] args) {
//		String url = "https://www.melon.com/chart/index.htm";
//		Document doc = null;
//		Elements tmp;
//		String name_temp = null;
//		String singer_temp = null;
//		String album_temp = null;
//		int id = 0;
//		try{
//			doc = Jsoup.connect(url).get();
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		//1~50위
//		
//		Elements element = doc.select("div#tb_list").select("tr.lst50");
//		
//		for(int i =0; i<50;i++) {
//			//이름
//			tmp = element.select("div.ellipsis.rank01");
//			name_temp = tmp.get(i).text();
//			 System.out.println("제목 : " + name_temp );	//제목 크롤링
//				
//			
//			tmp = element.select("div.ellipsis.rank02");
//			singer_temp = tmp.get(i).text();
//
//			tmp = element.select("div.ellipsis.rank03");
//			album_temp = tmp.get(i).text();
//
//			.add(new SongVo(id, name_temp,singer_temp,album_temp));
//			
//		}
//			
//		
//		
//		
//		//50~10위
//		 element = doc.select("div#tb_list").select("tr.lst100");
//		 for(int i =0; i<50;i++) {
//				//이름
//				tmp = element.select("div.ellipsis.rank01");
//				name_temp = tmp.get(i).text();
//				
//				tmp = element.select("div.ellipsis.rank02");
//				singer_temp = tmp.get(i).text();
//
//				tmp = element.select("div.ellipsis.rank03");
//				album_temp = tmp.get(i).text();
//
//				sl.add(new SongVo(id, name_temp,singer_temp,album_temp));
//				
//			}
//		 
//		 System.out.println("crawling complete");

	
}

