package stmallapexacme.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import stmallapexacme.infra.AbstractEvent;

@Data
public class OrderCanceled extends AbstractEvent {

    private Long id;
    private String userId;
    private String productName;
    private Long productId;
    private Integer qty;
    private String status;
    private Date orderDt;
    private String address;
}
