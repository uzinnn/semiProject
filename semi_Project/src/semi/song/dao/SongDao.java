package semi.song.dao;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import semi.song.vo.SongVo;

public class SongDao {

	public static void UploadToDB( ArrayList<SongVo> SL){
		ArrayList<SongVo> result = null;
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "MUSIC";
		String pw ="MUSIC";
		Connection conn =null;
		
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user,pw);
			if(conn != null) {System.out.println("DB 연결 성공!!");
			}else { System.out.println("!!!!!!!!!DB 연결 실패!!");
			}
			
			for(int i =0;i<SL.size();i++) 
			{
				String sql = "insert into test_music(id, title, artistname, album) values(?,?,?,?) ";
		
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, SL.get(i).getId());
				pstmt.setString(2, SL.get(i).getTitle());
				pstmt.setString(3, SL.get(i).getArtistName());
				pstmt.setString(4, SL.get(i).getAlbum());
				pstmt.executeUpdate();
			}
			System.out.println("Upload_complete");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		

		
	}
	
	
	public static void DownloadToDB(ArrayList<SongVo> SL) {
		
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "MUSIC";
		String pw ="MUSIC";
		Connection conn =null;
		
		int id = 0;
		String NT, ST, AT;
		
		
			
				try {
					Class.forName(driver);
					conn = DriverManager.getConnection(url, user,pw);
				if(conn != null) 
				{
					System.out.println("DB 연결 성공!!");
			}else { 
					System.out.println("!!!!!!!!!DB 연결 실패!!");
				}
			String sql = "select * from test_music";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		
				while(rs.next()) {
					id = rs.getInt("id");
				NT = rs.getString("title");
				ST = rs.getString("artistname");
				AT = rs.getString("album");
			
					SL.add(new SongVo(id, NT, ST, AT));
				}
			
				System.out.println("Download complete");
		
			} catch (Exception e) {
				e.printStackTrace();
			}
	
		
	}
		
	}
		

