package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Poster;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PosterManagerTest5 {
    private PosterManager manager = new PosterManager(5);
    private Poster first = new Poster(1,1, "first", "link1", "genre1");
    private Poster second = new Poster(2,2, "second", "link2", "genre2");
    private Poster third = new Poster(3,3, "third", "link3", "genre3");
    private Poster fourth = new Poster(4,4, "forth", "link4", "genre4");
    private Poster fifth = new Poster(5,5, "fifth", "link5", "genre5");
    private Poster sixth = new Poster(6,6, "sixth", "link6", "genre6");
    private Poster seventh = new Poster(7,7, "seventh", "link7", "genre7");
    private Poster eighth = new Poster(8,8, "eighth", "link8", "genre8");
    private Poster ninth= new Poster(9,9, "ninth", "link9", "genre9");
    private Poster tenth = new Poster(10,10, "tenth", "link10", "genre10");

    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
    }

    @Test
    public void shouldShowTenPosters() {
        Poster[] actual = manager.getAll();
        Poster[] expected = new Poster[]{fifth, fourth, third, second, first};

        assertArrayEquals(expected,actual);
    }
}
