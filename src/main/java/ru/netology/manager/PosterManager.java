package ru.netology.manager;

import ru.netology.domain.Poster;

public class PosterManager {
    int amountFilmsMax;
    private Poster[] items = new Poster[0];

    public void add(Poster item) {
        // создаём новый массив размером на единицу больше
        int length = items.length + 1;
        Poster[] tmp = new Poster[length];


        System.arraycopy(items, 0, tmp, 0, items.length);
        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public Poster[] getAll() {
        Poster[] result = new Poster[amountFilmsMax];
        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном
        for (int i = 0; i < result.length; i++) {
            int index = amountFilmsMax - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    public PosterManager(int amountFilmsMax) {
        this.amountFilmsMax = amountFilmsMax;
    }
}
