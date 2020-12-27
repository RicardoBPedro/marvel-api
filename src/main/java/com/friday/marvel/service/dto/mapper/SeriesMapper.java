package com.friday.marvel.service.dto.mapper;

import com.friday.marvel.domain.Series;
import com.friday.marvel.service.dto.SeriesDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface SeriesMapper {

    @Mappings({
            @Mapping(target="id", source="id"),
            @Mapping(target="title", source="title"),
            @Mapping(target="description", source="description"),
            @Mapping(target="startYear", source="startYear"),
            @Mapping(target="endYear", source="endYear")
    })
    SeriesDTO toDto(Series series);

    @Mappings({
            @Mapping(target="id", source="id"),
            @Mapping(target="title", source="title"),
            @Mapping(target="description", source="description"),
            @Mapping(target="startYear", source="startYear"),
            @Mapping(target="endYear", source="endYear")
    })
    Series toEntity(SeriesDTO seriesDTO);
}
