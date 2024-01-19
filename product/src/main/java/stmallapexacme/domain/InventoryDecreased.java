package stmallapexacme.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmallapexacme.domain.*;
import stmallapexacme.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class InventoryDecreased extends AbstractEvent {

    private Long id;
    private String productName;
    private String productImage;
    private Integer stock;

    public InventoryDecreased(Inventory aggregate) {
        super(aggregate);
    }

    public InventoryDecreased() {
        super();
    }
}
//>>> DDD / Domain Event
