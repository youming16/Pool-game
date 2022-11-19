package factory.buttons;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowButton();
    }
}
