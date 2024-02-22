package com.zvyap.dailycheckin;

public enum WebhookMessage {
    WEBHOOK_TITLE("توݢسن دفتر هارين اونتوق [{1}]"), // 0 - uid, 1 - in game name, 2 - region, 3 - level, for highest level account
    WEBHOOK_SUCCESS("برجاي مندفتر ماسوق!"),
    WEBHOOK_ALREADY_CHECK_IN("اوق ده دفتر ماسوق هاريني..."),
    WEBHOOK_FAILED("دفتر ماسوق ݢاݢل - {0},{1}"), //message and retcode
    WEBHOOK_CAPTCHA("اد Captcha! تولوڠ سلسايکنڽ سنديري"),
    FIELD_GAME("Game"),
    FIELD_REWARD_TODAY("ݢنجرن هاري اين"),
    FIELD_REWARD_TOMORROW("ݢنجرن ايسوق"),
    FIELD_DAYS_CHECKED_IN("هاري يڠ تله ددفتر ماسوق"),
    FIELD_DAYS_MISSING("هاري ترتيڠݢل"),
    FIELD_OFFICIAL_MESSAGE("ڤسنن راسمي");

    private final String message;

    WebhookMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
