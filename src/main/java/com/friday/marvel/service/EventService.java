package com.friday.marvel.service;

import com.friday.marvel.service.dto.EventDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EventService {

    Page<EventDTO> findAllByCharactersId(Long idCharacter, Pageable pageable);
}
