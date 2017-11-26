package com.nitin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMessageController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public HelloMessage firstPage() {

		HelloMessage hello = new HelloMessage();
		hello.setMessage("Hello World!!");

		return hello;
	}

}
