package entity;

import javax.persistence.*;

/**
 * 단일 테이블 전략을 사용한다.
 * 테이블 하나에 모든 것을 통합하므로 구분 컬럼을 필수로 사용해야 한다.
 *
 * 장점
 *  1. 조인이 필요 없으므로 일반적으로 조회 성능이 빠르다.
 *  2. 조회 쿼리가 단순하다.
 * 단점
 *  1. 자식 엔티티가 매핑한 컬럼은 모두 null을 허용해야한다.
 *  2. 단일 테이블에 모든 것을 저장하므로 테이블이 커질 수 있다.
 * 특징
 *  1. 구분 컬럼을 꼭 사용해야 한다.
 *  2. @DiscriminatorColumn를 지정하지 않으면 기본으로 엔티티 이름을 사용한다.
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "DTYPE")
public abstract class Item {

    @Id @GeneratedValue
    @Column(name = "ITEM_ID")
    private Long id;

    private String name;
    private int price;

}
