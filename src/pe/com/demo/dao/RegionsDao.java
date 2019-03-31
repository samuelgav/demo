package pe.com.demo.dao;

import java.util.List;

import pe.com.demo.bean.Regions;

public interface RegionsDao {

	List<Regions> listRegions() throws Exception;
}
