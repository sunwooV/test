package project.Sell.P001.D002.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import project.Sell.P001.D001.dao.S_P001_D001DAO;
import project.Sell.P001.D001.vo.S_P001_D001VO;
import project.Sell.P001.D002.dao.S_P001_D002DAO;
import project.Sell.P001.D002.vo.S_P001_D002VO;

@Service("S_P001_D002Service")
@Transactional(propagation = Propagation.REQUIRED)
public class S_P001_D002ServiceImpl implements S_P001_D002Service {
	@Autowired
	private S_P001_D002DAO S_P001_D002DAO;

	@Override
	public List<S_P001_D001VO> high_category(Map<String, Object> searchMap2) throws DataAccessException {
		List<S_P001_D001VO> high_category =  S_P001_D002DAO.high_category(searchMap2); 
		return high_category;
	}
	
	@Override
	public List<S_P001_D001VO> middle_category(Map<String, Object> searchMap2) throws DataAccessException {
		List<S_P001_D001VO> middle_category =  S_P001_D002DAO.middle_category(searchMap2); 
		return middle_category;
	}
	
	@Override
	public List<S_P001_D002VO> detailProduct(Map<String, Object> searchMap) throws DataAccessException {
		List<S_P001_D002VO> list =  S_P001_D002DAO.detailProduct(searchMap); 
		return list;
	}
	
	@Override
	public List<S_P001_D002VO> auction_left_date(Map<String, Object> searchMap) throws DataAccessException {
		List<S_P001_D002VO> list =  S_P001_D002DAO.auction_left_date(searchMap); 
		return list;
	}
}