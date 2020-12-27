package com.friday.marvel.service;

import static org.mockito.Mockito.when;

import com.friday.marvel.exceptions.CharacterNotFoundException;
import com.friday.marvel.repository.CharacterRepository;
import com.friday.marvel.service.friday.FridayCharacterService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.standaloneSetup;

@SpringBootTest
public class CharacterServiceTest {

    @MockBean
    private CharacterRepository repository;

    @Autowired
    private FridayCharacterService characterService;

    @BeforeEach
    public void setup() {
        standaloneSetup(this.characterService);
    }

    @Test
    public void shouldReturnCharacterNotFoundException() {
        when(this.repository.findById(1L)).thenReturn(Optional.empty());

        Assertions.assertThrows(CharacterNotFoundException.class, () -> { characterService.findById(1L); });
    }
}
