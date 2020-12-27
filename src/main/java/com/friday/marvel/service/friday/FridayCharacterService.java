package com.friday.marvel.service.friday;

import com.friday.marvel.exceptions.CharacterNotFoundException;
import com.friday.marvel.exceptions.PageableException;
import com.friday.marvel.exceptions.PageableValidator;
import com.friday.marvel.repository.CharacterRepository;
import com.friday.marvel.service.CharacterService;
import com.friday.marvel.service.dto.CharacterDTO;
import com.friday.marvel.service.dto.mapper.CharacterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FridayCharacterService implements CharacterService {

    @Autowired
    CharacterMapper mapper;

    @Autowired
    CharacterRepository repository;

    @Autowired
    PageableValidator pageableValidator;

    @Override
    public CharacterDTO findById(Long id) {
        return mapper.toDto(repository.findById(id).orElseThrow(() -> new CharacterNotFoundException("Character " + id + " does not exist.")));
    }

    @Override
    public Page<CharacterDTO> findAll(Pageable pageable) {

        pageableValidator.validate(pageable);

        return repository.findAll(pageable).map(mapper::toDto);
    }
}
