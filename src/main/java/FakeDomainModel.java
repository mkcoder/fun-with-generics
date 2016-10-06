import java.util.ArrayList;
import java.util.List;

public class FakeDomainModel implements DomainModel<FakeDomainModel> {
    @Override
    public String Identity() {
        return "fakeModel";
    }

    @Override
    public Long Hash() {
        return (long) this.hashCode();
    }

    @Override
    public List<String> logs() {
        List<String> str = new ArrayList<>();
        str.add("===");
        return str;
    }
}
