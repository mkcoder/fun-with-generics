package excerise3.finalproject.generics;

import java.util.List;

/**
 * Defines a domain in the buisness:
 * Example: CarDealerShipDomain
 *     CarDealer<? DomainModel,  :
 *
 *
 *
 */
public interface DomainModel<T extends DomainModel> {

    public String Identity();

    public Long Hash();

    public List<String> logs();
}
