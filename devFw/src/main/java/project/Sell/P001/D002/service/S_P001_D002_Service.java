package project.Sell.P001.D002.service;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import project.Sell.P001.D002.vo.S_P001_D002_VO;

public interface S_P001_D002_Service {
	public List<S_P001_D002_VO> detailProduct(Map<String, Object> searchMap) throws DataAccessException;
}