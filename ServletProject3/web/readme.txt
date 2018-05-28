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