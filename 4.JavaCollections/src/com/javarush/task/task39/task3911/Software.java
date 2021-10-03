package com.javarush.task.task39.task3911;

import java.util.*;

public class Software {
    int currentVersion;

    private Map<Integer, String> versionHistoryMap = new LinkedHashMap<>();

    public void addNewVersion(int version, String description) {
        if (version > currentVersion) {
            versionHistoryMap.put(version, description);
            currentVersion = version;
        }
    }

    public int getCurrentVersion() {
        return currentVersion;
    }

    public Map<Integer, String> getVersionHistoryMap() {
        return Collections.unmodifiableMap(versionHistoryMap);
    }

    public boolean rollback(int rollbackVersion) {
        boolean flag = false;
        List<Integer> listToDelete = new ArrayList<>();
        for (Integer integer : versionHistoryMap.keySet()) {

            if (flag) {
                listToDelete.add(integer);
            }
            if (integer == rollbackVersion) {
                flag = true;
            }

        }
        if (!versionHistoryMap.keySet().contains(rollbackVersion)) return false;
        currentVersion = rollbackVersion;
        listToDelete.stream().forEach(x -> versionHistoryMap.remove(x));
        return true;
    }
}
