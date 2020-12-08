package vn.momo.questions.displayof;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import vn.momo.ui.PictureAppSelectionGrid;

public class DisplayOfPictureAppSelect implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor theUser) {
        return Visibility.of(PictureAppSelectionGrid.GRID_VIEW)
                .viewedBy(theUser).resolve();
    }
}
