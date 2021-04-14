package com.jojoldu.book.springboot.service.posts;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.jojoldu.book.springboot.domain.posts.PostsRepository;
import com.jojoldu.book.springboot.web.dto.PostsSaveRequestDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PostsService {
	private final PostsRepository postsRepository;

	@Transactional
	public Long save(PostsSaveRequestDto requestDto) {
		return postsRepository.save(requestDto.toEntity())
			.getId();
	}
}