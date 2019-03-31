package pe.com.demo.managedBeans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import pe.com.demo.bean.Regions;
import pe.com.demo.service.RegionsService;

@Controller
@Scope("session")
@Slf4j
public class RegionsBean {

	private @Getter @Setter List<Regions> listRegions;
	
	@Autowired
	private RegionsService regionsService;
	
	@PostConstruct
	public void init() throws Exception{
		showListRegions();
	}
	
	public void showListRegions() throws Exception{
		listRegions=new ArrayList<>();
		listRegions=regionsService.listRegions();
	}
	
}
