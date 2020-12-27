package com.friday.marvel.repository;

import com.friday.marvel.domain.Comic;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComicRepository extends JpaRepository<Comic, Long> {

    Page<Comic> findAllByCharactersId(Long idCharacter, Pageable pageable);
}
