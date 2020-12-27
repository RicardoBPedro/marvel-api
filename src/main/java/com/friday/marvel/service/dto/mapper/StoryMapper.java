package com.friday.marvel.service.dto.mapper;

import com.friday.marvel.domain.Story;
import com.friday.marvel.service.dto.StoryDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface StoryMapper {

    @Mappings({
            @Mapping(target="id", source="id"),
            @Mapping(target="title", source="title"),
            @Mapping(target="description", source="description"),
            @Mapping(target="type", source="type")
    })
    StoryDTO toDto(Story story);

    @Mappings({
            @Mapping(target="id", source="id"),
            @Mapping(target="title", source="title"),
            @Mapping(target="description", source="description"),
            @Mapping(target="type", source="type")
    })
    Story toEntity(StoryDTO storyDTO);
}
