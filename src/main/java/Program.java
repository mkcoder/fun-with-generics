public class Program {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        // service context reciver
        DomainRetriever dr = new DomainRetriever();

        // base model that every class should build on top of
        // then we have the derived types that
        dr.put(FakeDomainModel.class, FakerFakeModel.class);
        dr.put(FakeDomainModel.class, FakerFakerFakeModel.class);
        // dr.put(FakeDomainModel.class, BarFakerDomainModel.class); WILL NOT WORK BECAUSE OF THE CONSTRAINT!
        dr.put(BarFakeModel.class, BarFakerDomainModel.class);

        FakerFakeModel fakerFakeModel = dr.get(FakeDomainModel.class, FakerFakeModel.class);
        BarFakerDomainModel barFakerDomainModel = dr.get(BarFakeModel.class, BarFakerDomainModel.class);

        fakerFakeModel.SayHello();
        System.out.println(fakerFakeModel.Identity());
        fakerFakeModel.logs().stream().forEach(System.out::println);
    }
}