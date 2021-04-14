package com.jojoldu.book.springboot.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class PostsUpdateRequestDto {
	private String title;
	private String content;
}
