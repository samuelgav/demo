package pe.com.demo.bean;



import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class Regions implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private long region_id;
	private String region_name;

}
