package hong.dailywod.domain.wod.service;

import java.time.LocalDate;
import java.util.List;

import hong.dailywod.domain.wod.dto.WodCreateDto;
import hong.dailywod.domain.wod.dto.WodResponseDto;

public interface WodService {

    WodResponseDto getWod();

    WodResponseDto getWodById(Long id);

    List<WodResponseDto> getWodsByDateBetween(LocalDate startDate, LocalDate endDate);

    WodResponseDto createWod(WodCreateDto dto);
}