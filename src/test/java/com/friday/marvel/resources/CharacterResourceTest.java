package com.friday.marvel.resources;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.*;
import static org.mockito.Mockito.when;

import com.friday.marvel.service.dto.CharacterDTO;
import com.friday.marvel.service.friday.*;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;

@WebMvcTest
public class CharacterResourceTest {

    @Autowired
    private CharacterResource characterResource;

    @MockBean
    private FridayComicService comicService;

    @MockBean
    private FridayEventService eventService;

    @MockBean
    private FridayStoryService storyService;

    @MockBean
    private FridaySeriesService seriesService;

    @MockBean
    private FridayCharacterService characterService;

    @BeforeEach
    public void setup() {
        standaloneSetup(this.characterResource);
    }

    @Test
    public void shouldReturnSuccess_WhenSearchCharacterByCharacterId() {
        when(this.characterService.findById(1L))
                .thenReturn(new CharacterDTO(1L, "T’Challa", "Black Panther"));

        given().accept(ContentType.JSON)
               .when()
               .get("/v1/public/characters/{characterId}", 1L)
               .then()
               .statusCode(HttpStatus.OK.value());
    }
}
