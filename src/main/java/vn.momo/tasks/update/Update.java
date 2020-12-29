package vn.momo.tasks.update;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import vn.momo.model.Mode;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Update {
    public static UpdateIntimateNameBuilder theIntimateName(String intimateName) {
        return new UpdateIntimateNameBuilder(intimateName);
    }

    public static UpdateCurrentHomeLocationBuilder currentHomeLocation(String location) {
        return new UpdateCurrentHomeLocationBuilder(location);
    }

    public static Task friendListPrivacyTo(Mode mode) {
        return instrumented(UpdateFriendListPrivacy.class, mode);
    }

    public static class UpdateIntimateNameBuilder {
        private final String intimateName;

        UpdateIntimateNameBuilder(String intimateName) {
            this.intimateName = intimateName;
        }

        public Task to(Mode mode) {
            return instrumented(UpdateIntimateName.class, intimateName, mode);
        }
    }

    public static class UpdateCurrentHomeLocationBuilder {
        private final String location;

        UpdateCurrentHomeLocationBuilder(String location) {
            this.location=location;
        }

        public Task to(Mode mode) {
            return instrumented(UpdateCurrentHomeLocation.class, location, mode);
        }
    }
}
