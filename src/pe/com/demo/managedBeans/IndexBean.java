package pe.com.demo.managedBeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import lombok.extern.slf4j.Slf4j;



@Controller
@Scope("session")
@Slf4j
public class IndexBean {

	public String redireccionarRegions() {
		return "pretty:regions";
	}
}
