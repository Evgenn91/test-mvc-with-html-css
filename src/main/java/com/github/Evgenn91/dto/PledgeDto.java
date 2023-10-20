package com.github.Evgenn91.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class PledgeDto {
    private String guid;
    private String globalGuid;
    private String loan;
    private String debt;
}
