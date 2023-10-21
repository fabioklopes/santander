# Santander Dev Week 2023
Curso Spring Boot - Santander Dev Week 2023

## Diagrama de Classes

```mermaid
classDiagram
    class User {
        +name: string
        +document: string
        +account: Account
        +features: Feature[]
        +card: Card
        +news: News[]
    }

    class Account {
        +accountNumber: string
        +accountAgency: string
        +accountBalance: number
        +accountLimit: number
    }

    class Feature {
        +icon: string
        +description: string
    }

    class Card {
        +cardNumber: string
        +cardLimit: number
    }

    class News {
        +icon: string
        +description: string
    }

    User "1" *-- "1" Account
    User "1" *-- "N" Feature
    User "1" *-- "1" Card
    User "1" *-- "N" News
```
