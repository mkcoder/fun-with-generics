import java.util.List;

public class FakerFakeModel extends FakeDomainModel {

    public void SayHello() {
        System.out.println("Saying hello!");
    }

    @Override
    public List<String> logs() {
        List<String> str = super.logs();
        str.add("---faked---");
        return str;
    }
}
