package semi.song.dao;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import song.vo.SongVo;

public class SongDao {

	public ArrayList<SongVo> UploadToDB(Connection conn, ArrayList<SongVo> vo){
		ArrayList<SongVo> result = null;
		
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			for(int i =0;i<vo.size();i++) {
				String sql = "insert into test_music(id, title, artistname, album) values(?,?,?,?) ";
		
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, vo.get(i).getId());
				pstmt.setString(2, vo.get(i).getTitle());
				pstmt.setString(3, vo.get(i).getArtistName());
				pstmt.setString(4, vo.get(i).getAlbum());
				rs = pstmt.executeQuery();
			}
			System.out.println("Upload_complete");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		return result;
		
		
}	
}
