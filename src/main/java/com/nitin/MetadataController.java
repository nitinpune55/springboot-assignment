package com.nitin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetadataController {

	@RequestMapping(value = "/metadata", method = RequestMethod.GET)
	public Metadata firstPage() {

		Metadata mdata = new Metadata();
		mdata.setVersion("01.00");
		mdata.setDescription("sample web app");
		mdata.setLastcommitsha("4474776677746466");
		mdata.setName("snapshot_01.war");

		return mdata;
	}

}

