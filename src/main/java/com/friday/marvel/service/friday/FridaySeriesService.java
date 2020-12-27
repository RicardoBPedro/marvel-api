package com.friday.marvel.service.friday;

import com.friday.marvel.exceptions.PageableValidator;
import com.friday.marvel.repository.SeriesRepository;
import com.friday.marvel.service.SeriesService;
import com.friday.marvel.service.dto.SeriesDTO;
import com.friday.marvel.service.dto.mapper.SeriesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FridaySeriesService implements SeriesService {

    @Autowired
    SeriesMapper mapper;

    @Autowired
    SeriesRepository repository;

    @Autowired
    PageableValidator pageableValidator;

    @Override
    public Page<SeriesDTO> findAllByCharactersId(Long idCharacter, Pageable pageable) {

        pageableValidator.validate(pageable);

        return repository.findAllByCharactersId(idCharacter, pageable).map(mapper::toDto);
    }

}
