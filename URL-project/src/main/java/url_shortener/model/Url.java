package url_shortener.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "urls")
public class Url {

    @Id
    private String id;

    private String longUrl;

    private LocalDateTime expiresDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLongUrl() {
        return longUrl;
    }

    public void setLongUrl(String longUrl) {
        this.longUrl = longUrl;
    }

    public LocalDateTime getExpiresDate() {
        return expiresDate;
    }

    public void setExpiresDate(LocalDateTime expiresDate) {
        this.expiresDate = expiresDate;
    }
}
