package design_patterns.composite;

import static java.util.Arrays.asList;

public class Client {

    public static void main(String[] args) {
        Variant v1 = new BaseVariant("v1", 10);
        Variant v2 = new BaseVariant("v2", 20);

        Variant v3 = new BaseVariant("v3", 10);
        Variant v4 = new BaseVariant("v4", 20);


        SubVariant subV1 = new SubVariant("subV1", asList(v1,v2));
        SubVariant subV2 = new SubVariant("subV1", asList(v3,v4));

        MainVariant mainVariant = new MainVariant("mainV1", asList(subV1, subV2));

        System.out.println("Main Variant Stock " + mainVariant.getStock());

    }


}
