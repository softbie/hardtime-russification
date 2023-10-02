# HardTime русификация

![image](https://github.com/softbie/hardtime-russification/assets/39442071/b0fd78b2-dede-430f-ab77-bdbb094be2fd)

**Прогресс**

![image](https://progress-bar.dev/55/?width=320&color=green&suffix=%)


Русификация игры [HardTime](http://www.mdickie.com/prev_hardtime.htm) от [MDickie](http://www.mdickie.com/)

Игра разработана на движке Blitz3D с языком программирования BlitzBasic

Перевод игры выполняется с помощью написанного мною плагина, представленный в виде функции `translate`

## Компиляция
1. Склонировать репозиторий
2. Поместить в папку с репозиторием ассеты игры (скачать игру на оф. сайте и переместить все папки - Characters, Data, и т.д)
3. Скачать и установить Blitz3D
4. (Опционально) Создать новую переменную среды `blitzpath` для компиляции из командной строки. `blitzpath` должен содержать путь до установленного Blitz3D (прим. `C:\Program Files\Blitz3D`). Так же, для удобства, вынести путь до директории с компилятором в переменную `PATH` (прим. `C:\Program Files\Blitz3D\bin`). Что бы проверить правильность настройки окружения для компиляции выполните команду `blitzcc -h`, должна будет отобразиться справка по компилятору
5. Стартовой точкой игры является файл `Gameplay.bb`. Пример компиляции в режиме отладки: `blitzcc -d Gameplay.bb`

## Общие сведения
Из за специфики языка BlitzBasic перевод выполнен в виде двумероного массива, содержащего строки с переводом вида:

```
array$(index, 0) = "Hello, #FIRST#"
array$(index, 1) = "Привет, #FIRST#"
```

Где `index` - номер переводимой строки, `0` - строка на английском, `1` - строка на русском

Сам перевод осуществляется непосредственно в исходных файлах, для перевода нужно подключить файл `Translate.bb` и использовать функцию `translate`.

```
;Пример работы

Include "translate_plugin/Translate.bb"

Print translate("Hello, #FIRST#", "Вася")

;result: Привет, Вася
```

Функция имеет четыре аргумента, первый - обязательный, содержит ключ для поиска строк, второй, третий и четвертый - необязательные и используются для подстановки по подстрокам `#FIRST#`, `#SECOND#`, `#THIRD#` соответственно.

## Специфика русификации

Если заглянуть в файлы, которые содержат строки с переводом, в самом GitHub можно увидеть, что кириллица отображается в неправильной кодировке, из за чего редактировать и вносить вклад в "онлайн" режиме становится невозможным. К сожалению, это особенность движка или самой игры. HardTime не умеет работать с UTF кодировкой, если использовать ее, то кракозябры будут уже в самой игре. Поэтому файлы с переводами сохранены в `Windows-1251`.

Ввиду того, что этот ЯП не поддерживает ассоциативные и динамические массивы необходимо заранее объявлять длину массива. Это может быть очень не удобным, потому, что строки с переводами разбиты по файлам, из за этого добавление или удаление строк приведет к полному переписыванию всех индексов в остальных файлах.

## Вспомогательный инструмент

Что бы избежать проблемы, описанной выше, я написал отдельную вспомогательную программу с использованием `flutter`, которая хранит все строки с переводом в `sqlite` базе данных и позволяет автоматически экспортировать строки в нужном формате.

![image](https://github.com/softbie/hardtime-russification/assets/39442071/582c6d17-59dc-4065-930f-05b4f3b64d63)

Скачать ее можно по [этой](https://github.com/softbie/hardtime-russification/releases/download/0.0.6/ht_translation.zip) ссылке

Краткое руководство к программе:
Программа представленна в виде окна, разделенного на две части (левая и правая).
В левой части содержится список групп. Они нужны для логического разделения пар строк с переводом, что бы упростить процесс перевода. Эти группы в конечном итоге будут экспортированы в виде файлов. Внизу левой части находятся две кнопки:
* Добавить - добавляет группу (рекомендую устанавливать названия групп на латинице без спец символов)
* Экспорт - экспортирует все строки с переводом в файлы `.bb`, которые в свою очередь перемещаются полностью с заменой в папку `./translate_plugin` в папке репозитория

В правой части отображаются строки с переводом. Этот блок становится активным только после выбора группы. Здесь в верхней части блока находятся такие элементы управления, как:
* Поиск - ищет строки как в английской версии так и в русской, в рамках выбранной группы
* Изменить - позволяет переименовать группу
* Добавить - добавляет новую пару строк в группу
* Удалить - полностью удаляет всю группу, включая все вложенные в нее строки

Ниже лежат все доступные строки с переводом. В левой части каждой отдельной строки находится текстовое поле, считающееся ключем или английской версией строки. В правой - перевод. Далее две кнопки: сохранить изменения и удалить пару.

Для того, что бы подтянуть актуальную базу данных, нужно:
1. Скачать актуальную базу данных (за актуальностью базы можно следить [здесь](https://github.com/softbie/hardtime-russification/releases)) - файл data.db
2. Переместить ее в папку `C:\Users\ИМЯ ПОЛЬЗОВАТЕЛЯ\Documents\databases`
3. Запустить программу

Если все сделать правильно, у вас должны будут появиться уже созданные группы.

В случае возникновения каких либо проблем прошу обращаться:
* [Issue](https://github.com/softbie/hardtime-russification/issues) - по ошибкам в переводе
* [Gmail](mailto:async13hhz@gmail.com) или [Telegram](https://t.me/async13hhz) - по любым другим проблемам
