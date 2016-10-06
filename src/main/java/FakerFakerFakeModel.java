import java.util.List;

public class FakerFakerFakeModel extends FakeDomainModel {

    public void SayHello() {
        System.out.println("Saying fake hello!");
    }

    @Override
    public List<String> logs() {
        List<String> str = super.logs();
        str.add("---faked---");
        return str;
    }
}
