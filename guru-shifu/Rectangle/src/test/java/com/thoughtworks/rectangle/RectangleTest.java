package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class RectangleTest {

    @Test
    void shouldReturnAreaOf10000WhenLengthIs100AndBreadthIs100() {
        Rectangle rectangle = new Rectangle(100, 100);

        double area = rectangle.area();

        assertThat(area, is(closeTo(10000, 0.1)));
    }

    @Test
    void shouldReturnPerimeterOf40WhenLengthIs10AndBreadthIs10() {
        Rectangle rectangle = new Rectangle(10, 10);

        double perimeter = rectangle.perimeter();

        assertThat(perimeter, is(closeTo(40, 0.1)));
    }

}