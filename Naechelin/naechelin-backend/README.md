# naechelin-back
Naechelin-Back 

## Commit 
1. commit 시 본인 이름의 branch 를 이용하여 커밋한다.    
2. 본인 branch 가 최신 버전이 아닐 시 pull request 를 통해 버전업을 한 후 한다.  
3. commit 시 가장 최근 commit 한 사람에게 검토 후 가능하다.
4. __commit 시 commit change의 title란은 비워두지 않는다.(한글 또는 영어로 작성)__

--------
## Naming Convention
### 1. 자바 파일 맨 위에 주석으로 클래스명과 작성자명과 작성일자를 서술한다.

### 2. static final 순서로 서술한다.

### 3. 중괄호는 BSD스타일을 사용한다.
### 4. Tab은 4칸으로 한다.
### 5. 수식이 길어지면 두 줄로 나눈다.
### 6. "들여쓰기 시 본문 시작이 명확하게 한다.
```
if ((condition1 && condition2) 
        || (condition3 && condition4) 
        ||!(condition5 && condition6)) 
{ 
    doSomethingAboutIt(); 
}"
```
### 7. "삼항연산자는 다음과 같이 사용한다.
```
alpha = (aLongBooleanExpression) ? beta : gamma;"
```
### 8. if문 사용할 시 다음에 따른다.
##### 8-1."if문만 있으면 if(~) {~~~~}
##### 8-2. if else문 일 시
```
if(~)
  {~}
else(~)
  {~}
```

##### 8-3. if문을 사용할 때에는 중괄호를 생략하지 않는다."
```
if(true)
    return;
```
위 는 옳지 않다.

### 9. 한 줄에 하나의 선언문만 쓴다.
"같은 줄에 서로 다른 타입을 선언하면 안된다.
```Int foo, fooarray[];"```
##### 9-1."배열 선언은 다음과 같이 한다.
int[] fooarray;"

### 10. 지역 변수는 무조건 초기화하고 시작한다.

### 11. 한 줄에는 하나의 문만 사용한다.
##### 11-1. "switch문을 사용할 때에는 break 전에 개행한다.
```
switch(~~)
{
    case A:
         statement;
         ohoho;
         break;

    case B:
}"
```
##### 11-2. "try-catch문이 1줄이면 다음의 형식을 따른다.
```
try {~} 
catch() {~}
```

###### 11-2-1.길면 다음의 형식을 따른다.
```
try
{
    ~
}
catch()
{  
    ~
}"
```

### 12 .공백
##### 12-1. "." 을 제외한 모든 이항 연산자는 연산수들과 공백으로 분리한다.
```a += c + d;"```

##### 12-2. 캐스트는 공백으로 구분한다.
```myMethod((byte)aNum, (Object)x);"```

##### 12-3.복합 연산자 사용의 경우
```if ((a == b) && (c == d))"```


### 13. 그 외
##### "패키지 : 모두 소문자
##### 클래스 : 첫 글자는 대문자로
##### 인터페이스 : 클래스 명명규칙 앞에 I(대문자)를 붙인다.
##### 메소드 : 동사
##### 변수 : 콩글리시 금지.
##### 상수 : 모두 대문자에 언더바 사용"
