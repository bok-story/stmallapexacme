package stmallapexacme.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import stmallapexacme.infra.AbstractEvent;

@Data
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String productName;
    private String productId;
    private Integer qty;
    private String status;
    private Date deliveryDt;
}
