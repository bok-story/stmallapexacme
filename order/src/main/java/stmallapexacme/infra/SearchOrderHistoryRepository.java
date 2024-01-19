package stmallapexacme.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import stmallapexacme.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "searchOrderHistories",
    path = "searchOrderHistories"
)
public interface SearchOrderHistoryRepository
    extends PagingAndSortingRepository<SearchOrderHistory, Long> {}
