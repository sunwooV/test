package project.CS.P001.D003.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import project.CS.P001.D001.vo.PagingVO;


public interface CS_P001_D003DAO {
	
	public List privatelist(PagingVO vo) throws DataAccessException;
	public int countBoard();
	public List selectBoardDetail(Map<String, Object> dataMap);

}