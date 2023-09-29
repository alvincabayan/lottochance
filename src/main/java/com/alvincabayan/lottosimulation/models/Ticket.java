package com.alvincabayan.lottosimulation.models;

import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class Ticket {
    private Set<Integer> lottoNumbers; // 6 elements
    private Integer powerball;

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        lottoNumbers.stream().forEach(lottoNumber -> output.append(lottoNumber.toString()).append(" "));
        output.append(powerball.toString());
        return output.toString();
    }
}
