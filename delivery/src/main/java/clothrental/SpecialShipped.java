package clothrental;


public class SpecialShipped extends AbstractEvent {

    private Long id;
    private Long odrderId;
    private String status;

    public SpecialShipped(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getOdrderId() {
        return odrderId;
    }

    public void setOdrderId(Long odrderId) {
        this.odrderId = odrderId;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}