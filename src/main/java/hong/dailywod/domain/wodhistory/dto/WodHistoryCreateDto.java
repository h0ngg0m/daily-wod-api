package hong.dailywod.domain.wodhistory.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class WodHistoryCreateDto {

    @NotBlank private String record;

    @NotNull private Long wodId;

    @NotNull private Long userId;
}