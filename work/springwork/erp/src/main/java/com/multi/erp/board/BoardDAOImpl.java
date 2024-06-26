package com.multi.erp.board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class BoardDAOImpl implements BoardDAO {
	//MyBatis의 핵심클래스로 이 클래스가 지원하는 기능을 이용해서 sql을 실행
	private SqlSession sqlSessionTemplate;
	@Autowired
	public BoardDAOImpl(SqlSession sqlSessionTemplate) {
		super();
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	
	@Override
	public List<BoardDTO> boardList() {
		System.out.println("boardDao");
		//SqlSession의 selectList는 여러 개의 레코드를 반환하는 sql명령문을 실행하기 위해 제공되는 메소드
		//이므로 List<DTO>를 반환한다.
		//selectList등의 SqlSession에서 제공되는 sql문을 실행하기 위한 메소드는 statement를 매개변수로정의
		//statement가 매퍼에 정의한 sql문을 구분하는 id명
		// 네임스페이스명.id명
		//외부에서 입력하는 값이 있는 경우 값을 매개변수로 전달
		return sqlSessionTemplate.selectList("com.multi.erp.board.selectall");
	}

	@Override
	public List<BoardDTO> findByCategory(String category) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList("com.multi.erp.board.categorySelect", category);
	}
	
	@Override
	public BoardDTO read(String board_no) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectOne("com.multi.erp.board.read", board_no);
	}

	@Override
	public int update(BoardDTO board) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.update("com.multi.erp.board.update", board);
	}

	@Override
	public int delete(String board_no) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.delete("com.multi.erp.board.delete", board_no);
	}

	@Override
	public List<BoardDTO> search(String data) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList("com.multi.erp.board.search", data);
	}
	//동적sql처리
	//dto에 담기지 않는 매개변수 2개를 마이바티스로 넘기기
	@Override
	public List<BoardDTO> search(String tag, String data) {
		List<BoardDTO> list = null;
		System.out.println(tag+"====================="+data);
		Map<String,String> map = new HashMap<>();
		map.put("tag", tag);
		map.put("data", data);
		list = sqlSessionTemplate.selectList("com.multi.erp.board.dynamicSearch", map);
		return list;
	}
	//게시글저장
	@Override
	public int insert(BoardDTO board) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.insert("com.multi.erp.board.insert", board);
	}
	//첨부파일을 저장하기 위한 메소드
	@Override
	public int insertFile(List<BoardFileDTO> boardfiledtolist) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.insert("com.multi.erp.board.fileinsert",
															boardfiledtolist);
	}

	@Override
	public List<BoardFileDTO> getFileList(String boardno) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList("com.multi.erp.board.fileselect", boardno);
	}

	@Override
	public BoardFileDTO getFile(String boardFileno) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectOne("com.multi.erp.board.getfileinfo", boardFileno);
	}


}
