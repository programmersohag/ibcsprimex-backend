package com.example.ibcsprimex.model.enums;

public enum Grade {
    GRADE_ONE(1), GRADE_TWO(1), GRADE_THREE(2), GRADE_FOUR(2), GRADE_FIVE(3), GRADE_SIX(3);

    private final Integer gradeNumber;

    Grade(int gradeNumber) {
        this.gradeNumber = gradeNumber;
    }
    public Integer getGradeNumber(){
        return gradeNumber;
    }
}
