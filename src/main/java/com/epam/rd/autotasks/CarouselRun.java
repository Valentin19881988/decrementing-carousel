package com.epam.rd.autotasks;

public class CarouselRun {
    static int n;
    Boolean s = false;
    Boolean isFinishChek = false;

    public int next() {


        int sumNull = 0;
        int sum = 0;
        if (DecrementingCarousel.count == 0) { //проверка есть ли элеметы для уменьшения (проверка на то, что не добавили ни одного элемента)
            s = true;
            return -1;
        }

        for (int i = DecrementingCarousel.count - 1; i >= 0; i--) {
            if (DecrementingCarousel.array[i] == 0)        //считаем количество нулевых элементов в массиве
                sumNull++;

            sum += DecrementingCarousel.array[i];
            // }
            if (i == 0 && sum == 1) {
                s = true;
                DecrementingCarousel.count = 0;   //когда цикл уменьшения закончен, обнуляем счётчик изначально добавленных элементов
                n = 0; isFinishChek = true;                             //переводим отсчёт к началу массива
                return 1;
            }}
            if (sumNull == DecrementingCarousel.count - 1) { //если кол-во нулевых элементов в массиве на 1 меньше количества элементов массива
                //int tmp = DecrementingCarousel.array[n];
                //DecrementingCarousel.array[n]--;
                //return tmp;
                n = 0;
                for (int e = n; e < DecrementingCarousel.count ; e++) {  //ищем следующий ненулевой эл-т
                    if (DecrementingCarousel.array[e] != 0) {
                        n = e;
                        break;
                    }
                }
                int tmp = DecrementingCarousel.array[n];
                DecrementingCarousel.array[n]--;
                return tmp;

            }                                                   //это значит что остался последний элемент масиива.


            if (DecrementingCarousel.array[n] == 0) {                //проверяем элемент на значение 0
                for (int e = n; e < DecrementingCarousel.count - 1; e++) {  //ищем следующий ненулевой эл-т
                    if (DecrementingCarousel.array[e] != 0) {
                        n = e;                               //если ненулевой элемент найден , выходим из цикла
                        break;
                    }
                    n++;
                }
            }
            if (n == DecrementingCarousel.count-1 && DecrementingCarousel.array[n] == 0 )      // если вся посделовательность элементов до конца матрицы ,включая последний элемент, равна 0
                n = 0;                                        //переходим к началу матрицы

            if (DecrementingCarousel.array[n] == 0) {        // повторяем поиск ненулевого элемента (уже с начала матрицы)
                for (int e = n; e < DecrementingCarousel.count - 1; e++) {
                    if (DecrementingCarousel.array[e] != 0) {
                        n = e;
                        break;
                    }

                }
            }


            int tmp = DecrementingCarousel.array[n];
            if (DecrementingCarousel.array[n] != 0)
                DecrementingCarousel.array[n]--;
            n++;

            if (n == DecrementingCarousel.count)
                n = 0;
            sumNull = 0;
            return tmp;

            //throw new UnsupportedOperationException();
        }

        public boolean isFinished () {
            if (DecrementingCarousel.count == 0 || isFinishChek == true)
                s = true;


            return s;
        }

    }
