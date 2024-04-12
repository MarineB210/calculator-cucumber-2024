package calculator.controller.components;

import com.sun.javafx.geom.Dimension2D;
import javafx.scene.control.TextField;

public interface ModeController {
    void setDisplayTextField(TextField display);
    void setExpressionTextField(TextField expression);
    float getPreferredWidth();
    float getPreferredHeight();
}
