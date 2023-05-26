package engine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarWithSetter {

    @Autowired
    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

//    public void setEngine(Engine engine) {
//        this.engine = engine;
//    }

    //
//    public Engine getEngine() {
//        return engine;
//    }
//    public String toString() {
//        return "CarWithSetter{" +
//                "engine=" + engine +
//                '}';
//    }
}
