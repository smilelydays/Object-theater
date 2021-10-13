package domain;

import java.math.BigDecimal;

public class Money {
    public static final Money ZERO = Money.wons(0);

    private final BigDecimal amount;

    public Money(BigDecimal amount) {
        this.amount = amount;
    }

    private static Money wons(long amount) {
        return new Money(BigDecimal.valueOf(amount));
    }

    private static Money wons(double amount) {
        return new Money(BigDecimal.valueOf(amount));
    }

    public Money plus(Money money) {
        return new Money(this.amount.add(money.amount));
    }

    public Money minus(Money money) {
        return new Money(this.amount.subtract(money.amount));
    }

    public Money times(double amount) {
        return new Money(this.amount.multiply(BigDecimal.valueOf(amount)));
    }

    public boolean isLessThan(Money other) {
        return this.amount.compareTo(other.amount) < 0;
    }

    public boolean isGreaterThanOrEqual(Money other) {
        return this.amount.compareTo(other.amount) >= 0;
    }
}
