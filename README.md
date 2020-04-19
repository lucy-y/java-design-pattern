# Design Pattern

## Strategy Pattern (스트래티지 패턴)
- 목표 : 인터페이스 개념, 델리게이트 개념, 전략패턴 개념 이해한다.
    - 인터페이스 : 사람과 컴퓨터를 연결하는 장비
    - 델리게이트 : 위임
    - 전략패턴 : 여러 알고리즘을 하나의 추상적인 접근점(interface)을 만들어 접근점에서 서로  교환하도록 하는 패턴
- 개념 : 여러 알고리즘을 하나의 추상적인 접근점을 만들어 접근 점에서 서로 교환가능하도록 하는 패턴 
- Example1) Ainterface(선언), AinterfaceImpl(구현), AObj(델리게이트..?)
- Example2) Weapon(Sword, Knife, Ax) - Attack

> 참고링크: 
> - https://shorturl.at/luE19
>

## Adapter Patten (어댑터 패턴)
- 목표 : 알고리즘을 요구사항에 맞춰 사용할 수 있다.
- 개념 : 클래스의 인터페이스를 사용자가 기대하는 다른 인터페이스로 변환하는 패턴.
호환성이 없는 인터페이스 때문에 함께 동작할 수 없는 클래스들이 함께 작동하도록 해준다
- Example) 
    두 수에 대한 다음 연산을 수행하는 객체를 만들어 주세요.

    - 수의 두배의 수 반환 : twiceOf(Float):Float
    - 수의 반(1/2)의 수를 반환 : halfOf(Float):Float
   
    구현 객체의 이름은 'Adapter'로 사용
    
    Math 클래스에서 두 배와 절반을 구하는 함수는 이미 구현
- Extra Example)
    알고리즘 변경
    - Math 클래스에 새롭게 두 배를 구할 수 있는 함수가 추가되었습니다
    새로 구현된 알고리즘을 이용하도록 프로그램을 수정해주세요.
    - 절반을 구하는 기능에서 로그를 찍는 기능을 추가해주세요.
    
> 참고링크: 
> - https://shorturl.at/cluC9
> - https://shorturl.at/efqAT
> 
## Template Method Pattern (템플릿 메소드 패턴)
- 목표 : 일정한 프로세스를 가진 요구사항을 템플릿 메소드 패턴을 이용하여 구현하기
- 개념 : 알고리즘의 **구조를 메소드에 정의**하고 하위 클래스에서 알고리즘 구조의 변경없이 알고리즘을 **재정의** 하는 패턴

    - 구현하려는 알고리즘이 일정한 프로세스가 있다.
    - 구현하려는 알고리즘이 변경 가능성이 있다.
    > 알고리즘을 여러 단계로 나눈다.
    > 나눠진 알고리즘의 단계를 메소드로 선언한다.
    > 알고리즘을 수행할 템플릿 메소드를 만든다.
    > 하위 클래스에서 나눠진 메소드들을 구현한다.

- Example)
    - 신작 게임의 접속을 구현해주세요.
        - reqeustConnection(String str):String
    - 유저가 게임 접속시 다음을 고려해야합니다.
        - 보안 doSecurity(String string):String
        - 인증 authentication(String id, String password):boolean
        - 권한 authoriztion(String userName):int
        - 접속 connection(String info):String
- Extra Example)
    - 보안 부분 강화
    - 10시 이후 청소년 접속 제한
    
> 참고링크:
> - https://shorturl.at/vwCIL
> 
 
## Factory Method Pattern (팩토리 메소드)
- 목표 : 
- 개념 : 

> 참고링크:
> - https://
> 

## Singleton Pattern (싱글톤 패턴)
- 목표 : 
- 개념 : 

> 참고링크:
> - https://
> 


## Prototype Pattern (프로토 타입 패턴)
- 목표 : 
- 개념 : 

> 참고링크:
> - https://
> 


## Builder Pattern (빌더 패턴)
- 목표 : 
- 개념 : 

> 참고링크:
> - https://
> 


## Abstract Factory Pattern (추상 팩토리 패턴)
- 목표 : 
- 개념 : 

> 참고링크:
> - https://
> 


## Bridge Pattern (브릿지 패턴)
- 목표 : 
- 개념 : 

> 참고링크:
> - https://
> 


## Composite Pattern (컴포짓 패턴)
- 목표 : 
- 개념 : 

> 참고링크:
> - https://
> 


## Decorator Pattern (데코레이터 패턴)
- 목표 : 
- 개념 : 

> 참고링크:
> - https://
> 


## Visitor Pattern (방문자 패턴)
- 목표 : 
- 개념 : 

> 참고링크:
> - https://
> 


## Chain of Resposibility (책임사슬 패턴)
- 목표 : 
- 개념 : 

> 참고링크:
> - https://
> 


## Facade (퍼사드 패턴)
- 목표 : 
- 개념 : 

> 참고링크:
> - https://
> 


## Observer (옵저버 패턴)
- 목표 : 
- 개념 : 

> 참고링크:
> - https://
> 


## Other Pattern (그 외 여러가지 디자인 패턴)
- Mediator
- State Pattern
- Memento Pattern
- Flyweight Pattern
- Proxy Pattern
- Command Pattern

