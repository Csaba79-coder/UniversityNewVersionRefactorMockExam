package module;

import controller.MajorController;
import model.Major;
import model.MajorEnum;
import model.UnitType;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Processor {

    public static void run() {

        try {
            Map<MajorEnum, List<Major>> majorMap = MajorController.runFirst();

            List<Major> secondResult = MajorController.runSecond(majorMap);

            List<String> thirdResult = MajorController.runThird(majorMap.get(MajorEnum.ENG), UnitType.K);

            Major fourthResult = MajorController.runFourth(majorMap);

            List<Major> fifthResult = MajorController.runFifth(majorMap);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
