package melon.demo;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import semi.song.vo.SongVo;

public class MelonCrawling {
	
	public static void Crawling(ArrayList<SongVo> SL) {
		String url = "https://www.melon.com/chart/index.htm";
		Document doc = null;
		Elements tmp;
		String name_temp = null;
		String singer_temp = null;
		String album_temp = null;
		int id = 0;
		
		try{
			doc = Jsoup.connect(url).get();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//1~50위
		
		Elements element = doc.select("div#tb_list").select("tr.lst50");
		
		for(int i =0; i<50;i++) {
			//이름
			tmp = element.select("div.ellipsis.rank01");
			name_temp = tmp.get(i).text();
			
			tmp = element.select("div.ellipsis.rank02").select("span");
			singer_temp = tmp.get(i).text();

			tmp = element.select("div.ellipsis.rank03");
			album_temp = tmp.get(i).text();

			tmp = element.select("span.rank");
			id = Integer.parseInt((tmp.get(i).text()));
			
			
				SL.add(new SongVo(id, name_temp,singer_temp,album_temp));
				System.out.println(SL);
			
			
			}
	
		
		//50~10위
		 element = doc.select("div#tb_list").select("tr.lst100");
		 for(int i =0; i<50;i++) {
				//이름
				tmp = element.select("div.ellipsis.rank01");
				name_temp = tmp.get(i).text();
				
				tmp = element.select("div.ellipsis.rank02").select("span");
				singer_temp = tmp.get(i).text();

				tmp = element.select("div.ellipsis.rank03");
				album_temp = tmp.get(i).text();
				
				tmp = element.select("span.rank");
				id = Integer.parseInt((tmp.get(i).text()));
				
				SL.add(new SongVo(id, name_temp,singer_temp,album_temp));
				
			}
		 
		 System.out.println("crawling complete");
		
	}

	
}
