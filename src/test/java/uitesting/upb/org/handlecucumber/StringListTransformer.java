package uitesting.upb.org.handlecucumber;

import cucumber.api.Transformer;

public class StringListTransformer extends Transformer<String[]> {

    @Override
    public String[] transform(String value) {
        return value.split(",");
    }
}
