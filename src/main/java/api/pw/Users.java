package api.pw;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Users {

    private String id;
    private String name;
    private String email;
    private String gender;
    private String status;

}
