package components;

import javax.annotation.processing.Processor;

public class AMD implements PCProcessor{

    @Override
    public String getType() {
        return "AMD Ryzen 7 5700X";
    }

    @Override
    public Integer getPrice() {
        return 28000;
    }
}
