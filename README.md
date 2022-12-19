# Group4-MERGE
[ PPT ]
 * PPT에 있는 다이어그램 사진은 이미지 파일을 추가로 첨부하였습니다.
   잘 안 보이실경우 이미지를 참고해주시기 바랍니다.

[ 개발환경 ]
   - Notion
     개발일정과 프로그램간 회의, 작성한 문서를 관리하는 공간으로 사용하였으며 회의는 일일단위 개발전 현재 진도와
     개발 간 발생한 이슈, 차후 계획에 대해 공유하는 공간으로 사용하였습니다.
   - GitHub
     일일단위 개발에 진도를 저장하는 공간으로 활용하였습니다.
   - Miro
     와이어프레임 작성 및 스토리보드를 구상하는 공간으로 사용하였습니다.
   - STS
     수업시간에 배운 Tool로 java코드 작성 및 수정하였습니다.
   - Oracle & Sql developer
      수업시간에 배운 Tool로 DB 및 쿼리문을 작성하여 관리하였습니다.
   - Tomcat
     서버는 수업시간에 배운 Tomcat v9를 이용하였습니다.

[ GolfMate를 실행하기위한 방법 ]
1) 시스템 환경 및 구성
   [ 기술스택 ]
    - OS : window10
    - Tool : Spring Tool Suite 3  v3.9.18
    - DB : Oracle 11g R2, Sql developer v20.2.0
    - Server : Tomcat v9.0.65
2) 최초환경 설정
   [ 파일경로 ]
    - 프로젝트폴더에 있는 GolfMate 폴더를 바탕화면에 옮겨줍니다.
   [ Sql developer ]
    - DB 만들기 (DB생성 쿼리문.zip에 있는 sql문을 아래에 순서대로 실행해 줍니다.)
     1. Oracle 계정만들기 : GOLFMATE USER CREATE.spl 실행 후 계정으로 접속
     2. TABLE CREATE 생성 : CREATE.sql 실행
     3. 더미데이터 생성 : INSERT.sql 실행
       * sql실행 후 커밋 해줍니다.
       * 혹시 순서가 꼬였다면 DROP.sql로 초기화후 처음부터 다시 실행
   [ Spring Tool Suite ]
     - sts를 실행하여 GolfMate를 WorkSpace로 설정합니다.
     - 서버오류시 서버를 지우고 Tomcat v9로 다시 생성해 줍니다.

프로젝를 실행합니다.
PPT에 있는 시연 이미지를 참고하여 실행주세요.
