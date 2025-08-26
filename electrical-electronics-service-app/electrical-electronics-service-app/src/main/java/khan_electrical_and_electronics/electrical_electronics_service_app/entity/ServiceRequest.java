package khan_electrical_and_electronics.electrical_electronics_service_app.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


@Entity
@Table(name = "service_requests")
public class ServiceRequest {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
    /*
    @Column(name = "user_id", nullable = false, insertable = false, updatable = false)
    private int userId;*/

    @Column(name = "urgency_address")
    private String urgencyAddress;

    @Column(name = "issue_description", columnDefinition = "TEXT")
    private String issueDescription;

    @Column(name = "preferred_date")
    private LocalDate preferredDate;

    @Column(name = "preferred_time")
    private LocalTime preferredTime;

    private String status = "PENDING";

    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();
    @Column(name = "service_id")
    private int serviceId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public ServiceRequest() {
    }

    public ServiceRequest(String urgencyAddress, String issueDescription, LocalDate preferredDate, LocalTime preferredTime) {
        this.urgencyAddress = urgencyAddress;
        this.issueDescription = issueDescription;
        this.preferredDate = preferredDate;
        this.preferredTime = preferredTime;
        /*this.user = user;*/
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public int getServiceId() {
        return serviceId;
    }
    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }
   /* public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }*/


}
