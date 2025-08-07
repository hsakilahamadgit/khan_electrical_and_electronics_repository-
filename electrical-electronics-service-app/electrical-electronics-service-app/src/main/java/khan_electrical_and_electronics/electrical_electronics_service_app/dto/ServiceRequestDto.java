package khan_electrical_and_electronics.electrical_electronics_service_app.dto;

import jakarta.validation.constraints.NotBlank;

public class ServiceRequestDto {

    @NotBlank(message = "Urgency address is required")
    private String urgencyAddress;

    @NotBlank(message = "Issue description is required")
    private String issueDescription;

    @NotBlank(message = "Preferred date is required")
    private String preferredDate;

    @NotBlank(message = "Preferred time is required")
    private String preferredTime;

    public ServiceRequestDto() {
    }

    public ServiceRequestDto(String urgencyAddress, String issueDescription, String preferredDate, String preferredTime) {
        this.urgencyAddress = urgencyAddress;
        this.issueDescription = issueDescription;
        this.preferredDate = preferredDate;
        this.preferredTime = preferredTime;
    }

    public String getUrgencyAddress() {
        return urgencyAddress;
    }

    public void setUrgencyAddress(String urgencyAddress) {
        this.urgencyAddress = urgencyAddress;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
    }

    public String getPreferredDate() {
        return preferredDate;
    }

    public void setPreferredDate(String preferredDate) {
        this.preferredDate = preferredDate;
    }

    public String getPreferredTime() {
        return preferredTime;
    }

    public void setPreferredTime(String preferredTime) {
        this.preferredTime = preferredTime;


    }
}
