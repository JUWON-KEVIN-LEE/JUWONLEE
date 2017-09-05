# OOP_SOLID

### SRP - Single Responsibility Principle
단일 책임의 원칙
1. 하나의 클래스는 하나의 역할만 맡는다
2. 코드 변경의 영향이 미치는 범위가 최소화된다.

### OCP - Open Closed Principle
개방 폐쇄의 원칙
1. 확장에 열려있고, 수정에 닫혀있다.
1. 클래스간 통신을 위한 인터페이스가 확정되면 수정하지 않는다.

### LSP - Liskov Substitution Principle
리스코프 교체
1. 파생 클래스는 상위 클래스로 대체 가능해야 한다.
2. 상위 클래스의 기능을 파생 클래스가 포함해야 한다.

### ISP - Interface Segregation Principle
인터페이스 분리
1. 특화된 여러 개의 인터페이스가 범용 인터페이스 한 개 보다 낫다.

### DIP - Dependency Inversion Principle
의존 관계 역전 원칙
1. 상위 모듈이 하위 모듈에 의존하면 안된다.
1. 클라이언트는 클래스에 직접적인 의존이 아닌 추상화레이어(인터페이스)에 의존해야 한다.