package stmallapexacme.domain;

import java.util.*;
import lombok.*;
import stmallapexacme.domain.*;
import stmallapexacme.infra.AbstractEvent;

@Data
@ToString
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
