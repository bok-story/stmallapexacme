package stmallapexacme.domain;

import java.util.*;
import lombok.*;
import stmallapexacme.domain.*;
import stmallapexacme.infra.AbstractEvent;

@Data
@ToString
public class DeliveryCollected extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String productName;
    private String productId;
    private Integer qty;
    private String status;
    private Date deliveryDt;
}
