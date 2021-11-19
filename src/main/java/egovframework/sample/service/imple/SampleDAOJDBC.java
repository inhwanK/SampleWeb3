package egovframework.sample.service.imple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.mariadb.jdbc.Statement;
import org.springframework.stereotype.Repository;

import egovframework.sample.service.SampleDAO;
import egovframework.sample.service.SampleVO;
import egovframework.sample.service.common.JDBCUtil;

@Repository("daoJDBC")
public class SampleDAOJDBC implements SampleDAO {
	private Connection conn;
	private PreparedStatement stmt;
	private ResultSet rs;

	private final String SAMPLE_INSERT = "insert into sample(id, title, reg_user,"
			+ "content, reg_date) values "
			+ "(0,?,?,?, now())";
	private final String SAMPLE_GET = "select * from sample where id = ?";
	
	public SampleDAOJDBC() {
		System.out.println("===>SampleDAOJDBC 생성자");

	}

	@Override
	public void insertSample(SampleVO vo) throws Exception {
		System.out.println("===> JDBC로 insertSample() 기능처리");
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(SAMPLE_INSERT);
			stmt.setString(1, vo.getTitle());
			stmt.setString(2, vo.getRegUser());
			stmt.setString(3, vo.getContent());
			stmt.executeUpdate();
			JDBCUtil.close(stmt, conn);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateSample(SampleVO vo) throws Exception {
		System.out.println("===> JDBC로 deleteSample() 기능처리");
		
	}

	@Override
	public void deleteSample(SampleVO vo) throws Exception {
		System.out.println("===> JDBC로 selectSample() 기능처리");
	}

	@Override
	public SampleVO selectSample(SampleVO vo) throws Exception {
		System.out.println("===> JDBC로 selectSample() 기능처리");
		SampleVO sample = null;
		conn = JDBCUtil.getConnection();
		stmt= conn.prepareStatement(SAMPLE_GET);
		stmt.setInt(1,  vo.getId());
		rs= stmt.executeQuery();
		if(rs.next()) {
			sample=new SampleVO();
			sample.setId(rs.getInt("id"));
			sample.setTitle(rs.getString("title"));
			sample.setRegUser(rs.getString("reg_user"));
			sample.setContent(rs.getString("content"));
			sample.setRegDate(rs.getDate("reg_date"));
			
		}
		JDBCUtil.close(rs, stmt, conn);
		return sample;
	}

	@Override
	public List<SampleVO> selectSampleList(SampleVO vo) throws Exception {
		System.out.println("===> JDBC로 selectSampleList() 기능처리");
		return null;
	}

}
