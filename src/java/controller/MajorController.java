package controller;

import model.Major;
import model.MajorEnum;
import model.UnitType;
import util.DocumentReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MajorController {

    public static Map<MajorEnum, List<Major>> runFirst() throws IOException {
        DocumentReader.read();
        Map<MajorEnum, List<Major>> firstResult = DocumentReader.majorMap;
        System.out.println();
        return firstResult;
    }

    public static List<Major> runSecond(Map<MajorEnum, List<Major>> majorMap) {
        List<Major> resultList = new ArrayList<>();
        List<String> resultNames = new ArrayList<>();
        for (List<Major> majorList : majorMap.values()) {
            for (Major major : majorList) {
                if (major.getPrecondition().contains("NULL")) {
                    resultList.add(major);
                    resultNames.add(major.getUnitName());
                }
            }
        }
        return resultList;
    }

    public static List<String> runThird(List<Major> majorList, UnitType unitType) {
        List<String> majorNames = new ArrayList<>();
        for (Major major : majorList) {
            if (major.getUnitType().equals(unitType)) {
                majorNames.add(major.getUnitName());
            }
        }
        return majorNames;
    }

    public static Major runFourth(Map<MajorEnum, List<Major>> majorMap) {
        Major result = new Major();
        for (List<Major> majorList : majorMap.values()) {
            for (Major currentMajor : majorList) {
                if (currentMajor.getPrecondition().size() > result.getPrecondition().size()) {
                    result = currentMajor;
                }
            }
        }
        return result;
    }

    public static List<Major> runFifth(Map<MajorEnum, List<Major>> majorMap) {
        // TODO finish this task!
        return null;
    }
}
