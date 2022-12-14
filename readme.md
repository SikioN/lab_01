# Отчёт по лабораторной работе

### 1. Текст задания:

Создать одномерный массив c типа short. Заполнить его числами от 2 до 19 включительно в порядке возрастания.
Создать одномерный массив x типа double. Заполнить его 16-ю случайными числами в диапазоне от -10.0 до 3.0.
Создать двумерный массив d размером 18x16. Вычислить его элементы по следующей формуле (где x = x[j]):
> если c[i] = 8, то d[i][j] = ((0.75 / arcsin((x − 3.5) / 13)) ^ 2 * x − 0.75) / 0.25;

> если c[i] ∈ {6, 7, 10, 12, 13, 14, 16, 18, 19}, то d[i][j] = (2 * tan(x / (x + 1))) ^ arcsin(1 / (e ^ |x|));

> для остальных значений c[i]: d[i][j] = sin((arctan(sin(x)) / (cos(x ^ (x / 2)) − 1)) ^ 3).

Напечатать полученный в результате массив в формате с четырьмя знаками после запятой.
___

### 2. Исходный код программы:

https://github.com/SikioN/lab_01
___

### 3. Результат работы программы:

```
-0,0578     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN
-0,0578     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN
-0,0578     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN
-0,0578     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN
 1,0389  1,0008  1,0341  1,0871  1,0055  1,0217  1,0166  1,0021  1,0135  1,0154  1,0093  1,0006  1,0043  1,0002     NaN  1,3945
 1,0389  1,0008  1,0341  1,0871  1,0055  1,0217  1,0166  1,0021  1,0135  1,0154  1,0093  1,0006  1,0043  1,0002     NaN  1,3945
    NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN
-0,0578     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN
 1,0389  1,0008  1,0341  1,0871  1,0055  1,0217  1,0166  1,0021  1,0135  1,0154  1,0093  1,0006  1,0043  1,0002     NaN  1,3945
-0,0578     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN
 1,0389  1,0008  1,0341  1,0871  1,0055  1,0217  1,0166  1,0021  1,0135  1,0154  1,0093  1,0006  1,0043  1,0002     NaN  1,3945
 1,0389  1,0008  1,0341  1,0871  1,0055  1,0217  1,0166  1,0021  1,0135  1,0154  1,0093  1,0006  1,0043  1,0002     NaN  1,3945
 1,0389  1,0008  1,0341  1,0871  1,0055  1,0217  1,0166  1,0021  1,0135  1,0154  1,0093  1,0006  1,0043  1,0002     NaN  1,3945
-0,0578     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN
 1,0389  1,0008  1,0341  1,0871  1,0055  1,0217  1,0166  1,0021  1,0135  1,0154  1,0093  1,0006  1,0043  1,0002     NaN  1,3945
-0,0578     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN     NaN
 1,0389  1,0008  1,0341  1,0871  1,0055  1,0217  1,0166  1,0021  1,0135  1,0154  1,0093  1,0006  1,0043  1,0002     NaN  1,3945
 1,0389  1,0008  1,0341  1,0871  1,0055  1,0217  1,0166  1,0021  1,0135  1,0154  1,0093  1,0006  1,0043  1,0002     NaN  1,3945
 ```

 ___

### 4. Выводы по работе:

В процессе выполнения лабораторной работы я изучил особенности языка программирования Java, примитивные типы данных,
массивы и операторы ветвления. Также изучил класс Math, статический импорт и научился заниматься отладкой программы.