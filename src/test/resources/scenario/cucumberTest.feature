#languege: ru
@all
@severity=blocked

Feature: Проверка создания командировки

  @Командировка
  Scenario Outline: Проверка создания командировки
    * Открыта страница авторизации: вводим логин "<login>", пароль "<password>"
    * Открываем страницу оформления заявки на новую командировку
    * Выбираем подразделение
    * Выбираем организацию  "<division>"
    * Активируем чекбокс Заказ билетов
    * Заполняем поля командировки: город выбытия "<departureCity>", дата выбытия "<departureDate>", дата прибытия "<returnDate>"
    * Проверяем значения заполненных полей: город выбытия "<departureCity>"
    * Проверяем значения заполненных полей: дата выбытия "<returnDate>", дата прибытия "<departureDate>"
    * Проверяем значения заполненных полей: чекбокс, подразделение "<division>"
    * Нажимаем сохранить и закрыть
    * Проверяем отображение сообщения о наличии незаполненных полей

    Examples:
      | login              | password | departureCity | returnDate | departureDate | division                                  |
      | Taraskina Valeriya | testing  | Тула          | 12.04.2024 | 13.04.2024    | (Safari) Призрачная Организация Охотников |