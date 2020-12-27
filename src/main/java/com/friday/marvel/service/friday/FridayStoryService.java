package com.friday.marvel.service.friday;

import com.friday.marvel.exceptions.PageableValidator;
import com.friday.marvel.repository.StoryRepository;
import com.friday.marvel.service.StoryService;
import com.friday.marvel.service.dto.StoryDTO;
import com.friday.marvel.service.dto.mapper.StoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FridayStoryService implements StoryService {

    @Autowired
    StoryMapper mapper;

    @Autowired
    StoryRepository repository;

    @Autowired
    PageableValidator pageableValidator;

    @Override
    public Page<StoryDTO> findAllByCharactersId(Long idCharacter, Pageable pageable) {

        pageableValidator.validate(pageable);

        return repository.findAllByCharactersId(idCharacter, pageable).map(mapper::toDto);
    }

}

