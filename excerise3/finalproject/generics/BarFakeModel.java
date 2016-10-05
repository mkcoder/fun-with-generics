package excerise3.finalproject.generics;

import java.util.ArrayList;
import java.util.List;

public class BarFakeModel implements DomainModel {

    private List<String> list = new ArrayList<>();

    @Override
    public String Identity() {
        return "barModel";
    }

    @Override
    public Long Hash() {
        return (long) this.hashCode();
    }

    @Override
    public List<String> logs() {
        return list;
    }
}
