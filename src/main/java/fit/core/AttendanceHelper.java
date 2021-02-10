package fit.core;
import java.util.HashMap;
import java.util.Map;

public class AttendanceHelper {
    
    public static Map<String, Boolean> random (int qtd, int porc) {
        int result = (qtd * porc) / 100;

        Map<String, Boolean> listUser = new HashMap<>();

        for (int i = 0; i < result; i++) {
            listUser.put("usuario" + i, true);
        }

        for (int i = 0; i < qtd - result; i++) {
            listUser.put("usuarioTotal" + i, false);
        }

        return listUser;
    }
}
