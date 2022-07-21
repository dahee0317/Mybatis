package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dao.CityDao;
import com.example.vo.CityVo;

public class CityServiceImpl implements CityService {

	@Autowired
	private CityDao cityDao;
	
	@Override
	public CityVo selectCity(String name) {
		return this.cityDao.read(name);
	}

	@Override
	public List<CityVo> selectCitiesByCountryCode(String countryCode) {
		return this.cityDao.readAll(countryCode);
	}

}
