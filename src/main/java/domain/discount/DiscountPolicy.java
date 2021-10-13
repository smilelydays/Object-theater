package domain.discount;

import domain.Money;
import domain.Screening;

public abstract class DiscountPolicy {
    public abstract Money calculateDiscountAmount(Screening screening);
}
