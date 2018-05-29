Default output folder : web/WEB-INF/classes
Context root : twp
Content directory : web
따로 빼서 보관하기 쉽게 하려면 web 밑에 다 두는 게 편하다.
그리고 Marketplace에서 jad 검색하여 Decompiler 설치

log4j-1.2-api-2.11.0
log4j-api-2.11.0
log4j-core-2.11.0
log4j-taglib-2.11.0
위 네 가지 log4j 사용하니 다운받아서 복붙하기
그 후, 프로젝트의 Java Build Path에서 Source로 들어가 Add Folder 선택 후 프로젝트명/config 추가
그리고 Log Filter 만들어주기

Scope
page : 현재 페이지 내에서만 사용할 값
request : 요청값을 담아서 넘길 때, 다음 페이지에서도 사용할 값들을 저장
session : 접속 유지되는 동안 계속 유지되어야 할 값들을 저장
application : 앱이 지속되는 동안 모든 사용자가 접근 가능해야 할 값들을 저장(context)
부족하다면 http://noritersand.tistory.com/104 참고

단방향 SHA-512 양방향 AES 암호화 그리고 MD5 잘 알고 있을 것
