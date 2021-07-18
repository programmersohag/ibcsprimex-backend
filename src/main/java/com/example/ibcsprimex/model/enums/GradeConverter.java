package com.example.ibcsprimex.model.enums;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class GradeConverter implements AttributeConverter<Grade, Integer> {
    @Override
    public Integer convertToDatabaseColumn(Grade grade) {
        if (grade == null) {
            return null;
        }
        return grade.getGradeNumber();
    }

    @Override
    public Grade convertToEntityAttribute(Integer gradeNumber) {
        if (gradeNumber == null) {
            return null;
        }

        return Stream.of(Grade.values())
                .filter(c -> c.getGradeNumber().equals(gradeNumber))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
