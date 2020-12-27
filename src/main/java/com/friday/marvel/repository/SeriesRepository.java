package com.friday.marvel.repository;

import com.friday.marvel.domain.Series;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeriesRepository extends JpaRepository<Series, Long> {

    Page<Series> findAllByCharactersId(Long idCharacter, Pageable pageable);
}
