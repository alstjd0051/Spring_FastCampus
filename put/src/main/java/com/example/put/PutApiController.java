package com.example.put;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.put.dto.PostRequestDto;

@RestController
@RequestMapping("/api")

public class PutApiController {

	@PutMapping("/put")
	public void put(@RequestBody PostRequestDto PostRequestDto) {
		System.out.println(PostRequestDto);
	}
}
