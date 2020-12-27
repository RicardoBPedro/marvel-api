package com.friday.marvel.service.friday;

import com.friday.marvel.exceptions.PageableValidator;
import com.friday.marvel.repository.ComicRepository;
import com.friday.marvel.service.ComicService;
import com.friday.marvel.service.dto.ComicDTO;
import com.friday.marvel.service.dto.mapper.ComicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FridayComicService implements ComicService {

    @Autowired
    ComicMapper mapper;

    @Autowired
    ComicRepository repository;

    @Autowired
    PageableValidator pageableValidator;

    @Override
    public Page<ComicDTO> findAllByCharactersId(Long idCharacter, Pageable pageable) {

        pageableValidator.validate(pageable);

        return repository.findAllByCharactersId(idCharacter, pageable).map(mapper::toDto);
    }

}
