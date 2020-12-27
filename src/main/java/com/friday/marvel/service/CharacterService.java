package com.friday.marvel.service;

import com.friday.marvel.service.dto.CharacterDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CharacterService {

    CharacterDTO findById(Long id);

    Page<CharacterDTO> findAll(Pageable pageable);
}
