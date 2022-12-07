package com.jackson.screen;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
