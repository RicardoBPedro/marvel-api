package com.friday.marvel.service;

import com.friday.marvel.service.dto.SeriesDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SeriesService {

    Page<SeriesDTO> findAllByCharactersId(Long idCharacter, Pageable pageable);
}
