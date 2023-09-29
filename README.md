# goncharov_education

В программе вы можете создать задачу, заполнив форму. Созданная задача добавляется к списку задач.  
Вы можете добавлять новые задачи в список, изменять их и удалять.   
Задачи пока ничего не делают: просто хранятся в списке.  
Список задач существует только до закрытия приложения.

Данный проект для связи учителей и учеников создан в рамках образовательного проекте Андрея Гончарова  
и находится на раннем этапе развития. План по развитию проекта вы можете посмотреть в презентации.

### [Презентация.](https://github.com/catboy1989/goncharov_education/blob/main/presentation.md)

Если вы желаете поучаствовать в моём проекте, прошу ознакомиться с правилами.

### [Правила для участников проекта.](https://github.com/catboy1989/goncharov_education/blob/main/rules)

Вы можете скачать apk файл для установки программы на телефон Android (на вашем телефоне должна быть включена возможность установки из внешних источников).

### [Релизы программы со ссылками на скачивание apk файлов.](https://github.com/catboy1989/goncharov_education/releases)

## Сборка проекта

Для самостоятельной сборки приложения клонируйте репозиторий https://github.com/catboy1989/goncharov_education.  
Через программу Android Studio откройте проект по адресу **goncharov_education/android_client**  на вашем компьютере.
После этого вы сможете запустить проект на эмуляторе в Android Studio, самостоятельно собрать apk, изучать и изменять код.

## Структура проекта

### [Андроид клиент](https://github.com/catboy1989/goncharov_education/tree/main/android_client)
1. [Настройка вывода изображения на экран](https://github.com/catboy1989/goncharov_education/tree/main/android_client/app/src/main/java/com/catboy/goncharov_edu/screens)
2. [Связь между настройкой экрана и логикой приложения (презентеры).](https://github.com/catboy1989/goncharov_education/tree/main/android_client/app/src/main/java/com/catboy/goncharov_edu/presenters)
3. [Вся логика приложения.](https://github.com/catboy1989/goncharov_education/tree/main/android_client/app/src/main/java/com/catboy/goncharov_edu/usecases)
4. [Модели приложения (DTO - объекты для передачи данных)](https://github.com/catboy1989/goncharov_education/tree/main/android_client/app/src/main/java/com/catboy/goncharov_edu/models)
5. [Репозиторий приложения](https://github.com/catboy1989/goncharov_education/tree/main/android_client/app/src/main/java/com/catboy/goncharov_edu/repository)
6. [Ресурсные файлы (вёрстка, стили, картинки...)](https://github.com/catboy1989/goncharov_education/tree/main/android_client/app/src/main/res)

