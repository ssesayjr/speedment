package com.speedment.runtime.compute;

import com.speedment.common.function.ByteToDoubleFunction;
import com.speedment.common.function.ByteUnaryOperator;
import com.speedment.common.function.ToByteFunction;
import com.speedment.runtime.compute.expression.Expression;
import com.speedment.runtime.compute.expression.ExpressionType;
import com.speedment.runtime.compute.expression.Expressions;
import com.speedment.runtime.compute.internal.expression.ComposedUtil;
import com.speedment.runtime.compute.internal.expression.OrElseGetUtil;
import com.speedment.runtime.compute.internal.expression.OrElseThrowUtil;
import com.speedment.runtime.compute.internal.expression.OrElseUtil;
import com.speedment.runtime.compute.trait.*;
import static java.util.Objects.requireNonNull;

import java.util.function.Function;

/**
 * Expression that given an entity returns a {@code byte} value, or
 * {@code null}. This expression can be implemented using a lambda, or it can be
 * a result of another operation. It has additional methods for operating on it.
 *
 * @param <T> type to extract from
 *
 * @see Function
 *
 * @author Emil Forslund
 * @since 3.1.0
 */
@FunctionalInterface
public interface ToByteNullable<T>
extends Expression<T>,
        ToByteFunction<T>,
        ToNullable<T, Byte, ToByte<T>>,
        HasAbs<ToByteNullable<T>>,
        HasSign<ToByteNullable<T>>,
        HasSqrt<ToDoubleNullable<T>>,
        HasNegate<ToByteNullable<T>>,
        HasHash<T>,
        HasCompare<T>,
        HasCompose<T> {

    /**
     * Returns a typed {@code ToByteNullable<T>} using the provided
     * {@code lambda}.
     *
     * @param <T> type to extract from
     * @param lambda to convert
     * @return a typed {@code ToByteNullable<T>} using the provided
     * {@code lambda}
     *
     * @throws NullPointerException if the provided {@code lambda} is
     * {@code null}
     */
    public static <T> ToByteNullable<T> of(ToByteNullable<T> lambda) {
        return requireNonNull(lambda);
    }
    
    @Override
    default ExpressionType expressionType() {
        return ExpressionType.BYTE_NULLABLE;
    }

    @Override
    default byte applyAsByte(T object) throws NullPointerException {
        return apply(object);
    }

    @Override
    default ToByte<T> orThrow() throws NullPointerException {
        return OrElseThrowUtil.orElseThrow(this);
    }

    @Override
    default ToByte<T> orElseGet(ToByte<T> getter) {
        return OrElseGetUtil.orElseGet(this, getter);
    }

    @Override
    default ToByte<T> orElse(Byte value) {
        return OrElseUtil.orElse(this, value);
    }

    @Override
    default ToByteNullable<T> abs() {
        return Expressions.absOrNull(this);
    }

    @Override
    default ToByteNullable<T> negate() {
        return Expressions.negateOrNull(this);
    }

    @Override
    default ToByteNullable<T> sign() {
        return Expressions.signOrNull(this);
    }

    @Override
    default ToDoubleNullable<T> sqrt() {
        return Expressions.sqrtOrNull(this);
    }

    default ToDoubleNullable<T> mapToDoubleIfPresent(ByteToDoubleFunction mapper) {
        final ToByteNullable<T> delegate = this;
        return new ToDoubleNullable<T>() {
            @Override
            public Double apply(T object) {
                return delegate.isNull(object) ? null
                    : mapper.applyAsDouble(delegate.applyAsByte(object));
            }

            @Override
            public double applyAsDouble(T object) throws NullPointerException {
                return mapper.applyAsDouble(delegate.applyAsByte(object));
            }

            @Override
            public ToDouble<T> orElseGet(ToDouble<T> getter) {
                return object -> delegate.isNull(object)
                    ? getter.applyAsDouble(object)
                    : mapper.applyAsDouble(delegate.applyAsByte(object));
            }

            @Override
            public ToDouble<T> orElse(Double value) {
                return object -> delegate.isNull(object)
                    ? value
                    : mapper.applyAsDouble(delegate.applyAsByte(object));
            }

            @Override
            public boolean isNull(T object) {
                return delegate.isNull(object);
            }

            @Override
            public boolean isNotNull(T object) {
                return delegate.isNotNull(object);
            }
        };
    }

    default ToByteNullable<T> mapIfPresent(ByteUnaryOperator mapper) {
        final ToByteNullable<T> delegate = this;
        return new ToByteNullable<T>() {
            @Override
            public Byte apply(T object) {
                return delegate.isNull(object) ? null
                    : mapper.applyAsByte(delegate.applyAsByte(object));
            }

            @Override
            public byte applyAsByte(T object) throws NullPointerException {
                return mapper.applyAsByte(delegate.applyAsByte(object));
            }

            @Override
            public ToByte<T> orElseGet(ToByte<T> getter) {
                return object -> delegate.isNull(object)
                    ? getter.applyAsByte(object)
                    : mapper.applyAsByte(delegate.applyAsByte(object));
            }

            @Override
            public ToByte<T> orElse(Byte value) {
                return object -> delegate.isNull(object)
                    ? value
                    : mapper.applyAsByte(delegate.applyAsByte(object));
            }

            @Override
            public boolean isNull(T object) {
                return delegate.isNull(object);
            }

            @Override
            public boolean isNotNull(T object) {
                return delegate.isNotNull(object);
            }
        };
    }

    @Override
    default long hash(T object) {
        return isNull(object) ? 0 : applyAsByte(object);
    }

    @Override
    default int compare(T first, T second) {
        if (isNull(first)) {
            return isNull(second) ? 0 : 1;
        } else if (isNull(second)) {
            return -1;
        } else {
            return Byte.compare(
                applyAsByte(first),
                applyAsByte(second)
            );
        }
    }

    @Override
    default <V> ToByteNullable<V> compose(Function<? super V, ? extends T> before) {
        @SuppressWarnings("unchecked")
        final Function<V, T> casted = (Function<V, T>) before;
        return ComposedUtil.composeNullable(casted, this);
    }
}