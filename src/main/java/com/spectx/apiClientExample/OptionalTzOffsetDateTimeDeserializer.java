package com.spectx.apiClientExample;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQueries;

public class OptionalTzOffsetDateTimeDeserializer extends JsonDeserializer {
    private static final DateTimeFormatter OPTIONAL_TZ_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss[.n][Z][VV]");

    @Override
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String stringValue = jsonParser.readValueAs(String.class);

        TemporalAccessor parsed = OPTIONAL_TZ_FORMATTER.parse(stringValue);
        ZoneId remoteZoneId = parsed.query(TemporalQueries.zone());
        if (remoteZoneId == null) {
            remoteZoneId = ZoneId.systemDefault();
        }

        LocalDateTime remoteDateTime = LocalDateTime.from(parsed);
        ZonedDateTime atSpecifiedZone = remoteDateTime.atZone(remoteZoneId);
        ZonedDateTime atLocal = atSpecifiedZone.toOffsetDateTime().atZoneSameInstant(ZoneId.systemDefault());
        return atLocal.toOffsetDateTime();
    }
}
