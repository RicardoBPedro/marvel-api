package com.friday.marvel.resources;

import com.friday.marvel.service.*;
import com.friday.marvel.service.dto.*;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"v1/public/characters"})
public class CharacterResource {

    @Autowired
    private CharacterService characterService;

    @Autowired
    private ComicService comicService;

    @Autowired
    private EventService eventService;

    @Autowired
    private SeriesService seriesService;

    @Autowired
    private StoryService storyService;

    @GetMapping
    @Operation(summary = "Fetches lists of characters.")
    public ResponseEntity<Page<CharacterDTO>> getAllCharacters(Pageable pageable) {
        return new ResponseEntity<>(characterService.findAll(pageable), HttpStatus.OK);
    }

    @GetMapping("/{characterId}")
    @Operation(summary = "Fetches a single character by id.")
    public ResponseEntity<CharacterDTO> findCharacterById(@PathVariable Long characterId) {
        return new ResponseEntity<>(characterService.findById(characterId), HttpStatus.OK);
    }

    @GetMapping("/{characterId}/comics")
    @Operation(summary = "Fetches lists of comics filtered by a character id.")
    public ResponseEntity<Page<ComicDTO>> findComicsByCharacterId(@PathVariable Long characterId, Pageable pageable) {
        Page<ComicDTO> comics = comicService.findAllByCharactersId(characterId, pageable);

        return new ResponseEntity<>(comics, comics.getContent().isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK);
    }

    @GetMapping("/{characterId}/events")
    @Operation(summary = "Fetches lists of events filtered by a character id.")
    public ResponseEntity<Page<EventDTO>> findEventsByCharacterId(@PathVariable Long characterId, Pageable pageable) {
        Page<EventDTO> events = eventService.findAllByCharactersId(characterId, pageable);

        return new ResponseEntity<>(events, events.getContent().isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK);
    }

    @GetMapping("/{characterId}/series")
    @Operation(summary = "Fetches lists of series filtered by a character id.")
    public ResponseEntity<Page<SeriesDTO>> findSeriesByCharacterId(@PathVariable Long characterId, Pageable pageable) {
        Page<SeriesDTO> series = seriesService.findAllByCharactersId(characterId, pageable);

        return new ResponseEntity<>(series, series.getContent().isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK);
    }

    @GetMapping("/{characterId}/stories")
    @Operation(summary = "Fetches lists of stories filtered by a character id.")
    public ResponseEntity<Page<StoryDTO>> findStoriesByCharacterId(@PathVariable Long characterId, Pageable pageable) {
        Page<StoryDTO> stories = storyService.findAllByCharactersId(characterId, pageable);

        return new ResponseEntity<>(stories, stories.getContent().isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK);
    }
}
