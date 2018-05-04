package com.speedment.runtime.compute.expression.orelse;

import com.speedment.runtime.compute.ToChar;
import com.speedment.runtime.compute.ToCharNullable;
import com.speedment.runtime.compute.expression.NonNullableExpression;

/**
 * Specialized {@link NonNullableExpression} for {@code char} values where a
 * {@link NullPointerException} is thrown if the original expression returns
 * {@code null}.
 *
 * @param <T> the input entity type
 *
 * @author Emil Forslund
 * @since  3.1.0
 */
public interface ToCharOrThrow<T>
extends OrElseThrowExpression<T, ToCharNullable<T>>, ToChar<T> {}