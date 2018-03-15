package com.speedment.runtime.join.internal.component.join.test_support;

import com.speedment.common.function.Function5;
import com.speedment.common.function.Function6;
import com.speedment.common.function.QuadFunction;
import com.speedment.common.function.TriFunction;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.join.Join;
import com.speedment.runtime.join.JoinStreamSupplierComponent;
import com.speedment.runtime.join.internal.JoinImpl;
import com.speedment.runtime.join.internal.component.join.test_support.JoinTestUtil.E0;
import com.speedment.runtime.join.internal.component.join.test_support.JoinTestUtil.E1;
import com.speedment.runtime.join.internal.component.join.test_support.JoinTestUtil.E2;
import com.speedment.runtime.join.internal.component.join.test_support.JoinTestUtil.E3;
import com.speedment.runtime.join.internal.component.join.test_support.JoinTestUtil.E4;
import com.speedment.runtime.join.internal.component.join.test_support.JoinTestUtil.E5;
import com.speedment.runtime.join.stage.Stage;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Stream;

/**
 *
 * @author Per Minborg
 */
public class MockEmptyJoinStreamSupplierComponent implements JoinStreamSupplierComponent {

    private List<Stage<?>> stages;
    private Object constructor;
    private TableIdentifier<E0> t0;
    private TableIdentifier<E1> t1;
    private TableIdentifier<E2> t2;
    private TableIdentifier<E3> t3;
    private TableIdentifier<E4> t4;
    private TableIdentifier<E5> t5;

    @Override
    @SuppressWarnings("unchecked")
    public <T0, T1, T> Join<T> createJoin(List<Stage<?>> stages, BiFunction<T0, T1, T> constructor, TableIdentifier<T0> t0, TableIdentifier<T1> t1) {
        set(
            stages,
            constructor,
            (TableIdentifier<E0>) t0,
            (TableIdentifier<E1>) t1,
            (TableIdentifier<E2>) null,
            (TableIdentifier<E3>) null,
            (TableIdentifier<E4>) null,
            (TableIdentifier<E5>) null
        );
        return empty();
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T0, T1, T2, T> Join<T> createJoin(List<Stage<?>> stages, TriFunction<T0, T1, T2, T> constructor, TableIdentifier<T0> t0, TableIdentifier<T1> t1, TableIdentifier<T2> t2) {
        set(
            stages,
            constructor,
            (TableIdentifier<E0>) t0,
            (TableIdentifier<E1>) t1,
            (TableIdentifier<E2>) t2,
            (TableIdentifier<E3>) null,
            (TableIdentifier<E4>) null,
            (TableIdentifier<E5>) null
        );

        return empty();
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T0, T1, T2, T3, T> Join<T> createJoin(List<Stage<?>> stages, QuadFunction<T0, T1, T2, T3, T> constructor, TableIdentifier<T0> t0, TableIdentifier<T1> t1, TableIdentifier<T2> t2, TableIdentifier<T3> t3) {
        set(
            stages,
            constructor,
            (TableIdentifier<E0>) t0,
            (TableIdentifier<E1>) t1,
            (TableIdentifier<E2>) t2,
            (TableIdentifier<E3>) t3,
            (TableIdentifier<E4>) null,
            (TableIdentifier<E5>) null
        );

        return empty();
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T0, T1, T2, T3, T4, T> Join<T> createJoin(List<Stage<?>> stages, Function5<T0, T1, T2, T3, T4, T> constructor, TableIdentifier<T0> t0, TableIdentifier<T1> t1, TableIdentifier<T2> t2, TableIdentifier<T3> t3, TableIdentifier<T4> t4) {
        set(
            stages,
            constructor,
            (TableIdentifier<E0>) t0,
            (TableIdentifier<E1>) t1,
            (TableIdentifier<E2>) t2,
            (TableIdentifier<E3>) t3,
            (TableIdentifier<E4>) t4,
            (TableIdentifier<E5>) null
        );

        return empty();
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T0, T1, T2, T3, T4, T5, T> Join<T> createJoin(List<Stage<?>> stages, Function6<T0, T1, T2, T3, T4, T5, T> constructor, TableIdentifier<T0> t0, TableIdentifier<T1> t1, TableIdentifier<T2> t2, TableIdentifier<T3> t3, TableIdentifier<T4> t4, TableIdentifier<T5> t5) {
        set(
            stages,
            constructor,
            (TableIdentifier<E0>) t0,
            (TableIdentifier<E1>) t1,
            (TableIdentifier<E2>) t2,
            (TableIdentifier<E3>) t3,
            (TableIdentifier<E4>) t4,
            (TableIdentifier<E5>) t5
        );
        return empty();
    }

    public List<Stage<?>> stages() {
        return stages;
    }

    public Object constructor() {
        return constructor;
    }

    public TableIdentifier<E0> t0() {
        return t0;
    }

    public TableIdentifier<E1> t1() {
        return t1;
    }

    public TableIdentifier<E2> t2() {
        return t2;
    }

    public TableIdentifier<E3> t3() {
        return t3;
    }

    public TableIdentifier<E4> t4() {
        return t4;
    }

    public TableIdentifier<E5> t5() {
        return t5;
    }

    public TableIdentifier<?> t(int index) {
        switch (index) {
            case 0:
                return t0();
            case 1:
                return t1();
            case 2:
                return t2();
            case 3:
                return t3();
            case 4:
                return t4();
            case 5:
                return t5();
        }
        throw new IndexOutOfBoundsException(Integer.toString(index));
    }

    private void set(List<Stage<?>> stages, Object constructor, TableIdentifier<E0> t0, TableIdentifier<E1> t1, TableIdentifier<E2> t2, TableIdentifier<E3> t3, TableIdentifier<E4> t4, TableIdentifier<E5> t5) {
        this.stages = stages;
        this.constructor = constructor;
        this.t0 = t0;
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.t4 = t4;
        this.t5 = t5;
    }

    private <T> Join<T> empty() {
        return new JoinImpl<>(Stream::empty);
    }
}