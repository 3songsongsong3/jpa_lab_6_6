# 상속 관계 매핑 - 단일 테이블 전략 jpa_lab_6_6

<img width="153" alt="image" src="https://github.com/3songsongsong3/jpa_lab_6_6/assets/73326851/cbd49220-6083-47c3-803a-dfb27bddef1c">
# 단일 테이블 전략
* 테이블을 하나만 사용한다.
  * 구분 컬럼으로 어떤 자식 데이터가 저장되었는지 구분한다.
  * 조인을 사용하지 않으므로 일반적으로 가장 빠르다.
  * <b>주의점 : 자식 엔티티가 매핑한 컬럼은 모두 null을 허용해야 한다.</b>
