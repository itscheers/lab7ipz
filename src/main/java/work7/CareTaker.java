package work7;

/**
 * Manages the saving and restoring of graphic element states.
 */
public class CareTaker {

    private GraphicElement.Memento memento;

    /**
     * Saves the state of a graphic element.
     *
     * @param element the graphic element to save
     */
    public void saveState(GraphicElement element) {
        this.memento = element.saveState();
    }

    /**
     * Restores the state of a graphic element.
     *
     * @param element the graphic element to restore
     */
    public void restoreState(GraphicElement element) {
        if (memento != null) {
            element.restoreState(memento);
        }
    }
}

