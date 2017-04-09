package team.sevenDwarfs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;

/** 
* @ClassName: SpringMvcQuickstartApplication 
* @Description: 是这整个web应用的入口类，这里保持简单，仅仅设置监听端口
* @author deng
* @date 2017年4月9日 上午11:06:07
*/
@SpringBootApplication
public class SpringMvcQuickstartApplication implements EmbeddedServletContainerCustomizer {
	
	/** 
	* @Description 整个web应用的入口点
	* @param
	* @return void
	* @throws
	*/
	public static void main(String[] args) {
		SpringApplication.run(SpringMvcQuickstartApplication.class, args);
	}
	
	
	/**
	* @Title: customize
	* @Description: 实现 EmbeddedServletContainerCustomizer 接口方法customize，这里可以设置
	* 				web应用服务器监听的端口 8080
	* @param container 
	* @see org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer#customize(
	* 			org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer) 
	*/
	public void customize(ConfigurableEmbeddedServletContainer container) {
		container.setPort(8080);
	}
}