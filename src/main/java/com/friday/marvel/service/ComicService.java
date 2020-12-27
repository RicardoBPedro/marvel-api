package com.friday.marvel.service;

import com.friday.marvel.service.dto.ComicDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ComicService {

    Page<ComicDTO> findAllByCharactersId(Long idCharacter, Pageable pageable);
}
