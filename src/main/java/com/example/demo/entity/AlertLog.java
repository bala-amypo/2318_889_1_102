import java.time.LocalDateTime;

public class AlertLog{
    private Long id;
    private LocalDateTime sentAt;
    private String message;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public LocalDateTime getSentAt() {
        return sentAt;
    }
    public AlertLog() {
    }
    public void setSentAt(LocalDateTime sentAt) {
        this.sentAt = sentAt;
    }
    public AlertLog(Long id, LocalDateTime sentAt, String message) {
        this.id = id;
        this.sentAt = sentAt;
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}