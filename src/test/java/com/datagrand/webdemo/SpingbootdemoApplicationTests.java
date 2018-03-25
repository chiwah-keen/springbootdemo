package com.datagrand.webdemo;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSON;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpingbootdemoApplicationTests {
	
	
	public static String BaseURL = "http://127.0.0.1:8080";
	
	@Test
	public void user1Test() {
		Map<String, String> params = new HashMap<String, String>();
		params.put("username", "testname");
		params.put("passwd", "testpwd123");
		TestUtils.HttpPost(BaseURL+"/user1", JSON.toJSONString(params));
		
	}

}
