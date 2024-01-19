package stmallapexacme.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmallapexacme.domain.*;
import stmallapexacme.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class InventoryIncreased extends AbstractEvent {

    private Long id;
    private String productName;
    private String productImage;
    private Integer stock;

    public InventoryIncreased(Inventory aggregate) {
        super(aggregate);
    }

    public InventoryIncreased() {
        super();
    }
}
//>>> DDD / Domain Event
