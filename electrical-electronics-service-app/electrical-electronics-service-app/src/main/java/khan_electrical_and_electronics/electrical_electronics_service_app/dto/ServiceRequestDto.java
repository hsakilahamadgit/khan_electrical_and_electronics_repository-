package khan_electrical_and_electronics.electrical_electronics_service_app.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ServiceRequestDto {

    @NotBlank(message = "Urgency address is required")
    private String urgencyAddress;

    @NotBlank(message = "Issue description is required")
    private String issueDescription;

    @NotNull(message = "Preferred date is required")
    private LocalDate preferredDate;

    @DateTimeFormat(pattern = "HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss")
    @NotNull(message = "Preferred time is required")
    private LocalTime preferredTime;

    public ServiceRequestDto() {
    }

    public ServiceRequestDto(String urgencyAddress, String issueDescription, LocalDate preferredDate, LocalTime preferredTime) {
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

    public LocalDate getPreferredDate() {
        return preferredDate;
    }

    public void setPreferredDate(LocalDate preferredDate) {
        this.preferredDate = preferredDate;
    }

    public LocalTime getPreferredTime() {
        return preferredTime;
    }

    public void setPreferredTime(LocalTime preferredTime) {
        this.preferredTime = preferredTime;


    }
}
