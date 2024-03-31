package jpabook.jpashop.domain.item;

import jakarta.persistence.*;
import jpabook.jpashop.domain.Category;
import jpabook.jpashop.exeption.NotEnoughStokeException;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "dtype")
@Getter @Setter
public abstract class Item {
    @Id @GeneratedValue
    @Column(name = "item_id")
    private Long id;

    private String name;
    private int price;
    private int stockQuantity;

    @ManyToMany(mappedBy = "items")
    private List<Category>categories = new ArrayList<Category>();

    // ==비즈니스 로직== //
    /**
     * stoke 증가
     */
    public void addStoke(int quantity){
        this.stockQuantity += quantity;
    }
    /**
     * stoke 감소
     */
    public void removeStoke(int quantity){
        int restStoke = this.stockQuantity - quantity;
        if (restStoke < 0){
            throw new NotEnoughStokeException("need more stoke");
        }
        this.stockQuantity = restStoke;
    }
}

