package com.friday.marvel.service;

import com.friday.marvel.service.dto.StoryDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface StoryService {

    Page<StoryDTO> findAllByCharactersId(Long idCharacter, Pageable pageable);
}
