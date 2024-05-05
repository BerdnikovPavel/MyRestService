package org.example.RestService.Model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class ClientInfo {

    private String id;
    private String clientName;
    private String status;
    private String clientCode;

    public void setId(String id) {
        this.id = id;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    public String getId() {
        return id;
    }

    public String getClientName() {
        return clientName;
    }

    public String getStatus() {
        return status;
    }

    public String getClientCode() {
        return clientCode;
    }
}
