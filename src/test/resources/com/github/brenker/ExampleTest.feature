#language = ru
Feature: Тест

  @test
  Scenario Outline: example
    * Открыта страница "<url>"
    * Пользователь выбирает категорию курса "<nameOfCourse>"
    * Открылся каталог курсов
    Examples:
      | url              | nameOfCourse     |
      | https://otus.ru/ | Программирование |
      | https://otus.ru/ | Безопасность     |
      | https://otus.ru/ | Аналитика |