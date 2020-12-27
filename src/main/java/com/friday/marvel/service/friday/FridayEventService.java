package com.friday.marvel.service.friday;

import com.friday.marvel.exceptions.PageableValidator;
import com.friday.marvel.repository.EventRepository;
import com.friday.marvel.service.EventService;
import com.friday.marvel.service.dto.EventDTO;
import com.friday.marvel.service.dto.mapper.EventMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FridayEventService implements EventService {

    @Autowired
    EventMapper mapper;

    @Autowired
    EventRepository repository;

    @Autowired
    PageableValidator pageableValidator;

    @Override
    public Page<EventDTO> findAllByCharactersId(Long idCharacter, Pageable pageable) {

        pageableValidator.validate(pageable);

        return repository.findAllByCharactersId(idCharacter, pageable).map(mapper::toDto);
    }

}
