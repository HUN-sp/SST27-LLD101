package com.example.imports;
import java.nio.file.*; 

public class CsvProfileImporter implements ProfileImporter {
    private final NaiveCsvReader csvReader;
    private final ProfileService profileService;

    public CsvProfileImporter(NaiveCsvReader csvReader, ProfileService profileService) {
        this.csvReader = csvReader;
        this.profileService = profileService;
    }

    @Override
    public int importFrom(Path csvFile) {
        int count = 0;
        
        for (String[] row : csvReader.read(csvFile)) {
            if (row.length < 3) continue; 
            String id = row[0];
            String email = row[1];
            String displayName = row[2];
            try {
                profileService.createProfile(id, email, displayName);
                count++;
            } catch (Exception e) {
                System.err.println("Skipping bad profile: " + String.join(",", row) + " because " + e);
            }
        }
        return count;
   }
}