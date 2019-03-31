package pe.com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import pe.com.demo.bean.Regions;
import pe.com.demo.dao.RegionsDao;
import pe.com.demo.service.RegionsService;

@Service("regionsService")
@Qualifier("Hr")
public class RegionsServiceImpl implements RegionsService{

	@Autowired
	private RegionsDao regionsDao;
	
	@Override
	public List<Regions> listRegions() throws Exception {
		// TODO Auto-generated method stub
		return regionsDao.listRegions();
	}

}
