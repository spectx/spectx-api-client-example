package com.spectx.apiClientExample;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spectx.apiClientExample.model.Warning;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;

import java.io.IOException;
import java.time.ZoneId;

public class WarningTimeDeserializeTest {
    @Test
    public void testDeserializeWithoutOffset() throws IOException {
        Assume.assumeTrue(ZoneId.systemDefault().toString().equals("Europe/Tallinn"));
        String sampleData = "{\"time\":\"2019-07-10T13:54:05.167\",\"level\":\"WARN\",\"message\":\"blob not accessible: ssh://user:pass@nosuchhost/adsasasdsad: Unknown host nosuchhost: No address associated with hostname\"}";
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        Warning warning = mapper.readValue(sampleData, Warning.class);
        Assert.assertEquals("2019-07-10T13:54:05.000000167+03:00", warning.getTime().toString());
    }

    @Test
    public void testDeserializeWithoutOffsetShortNs() throws IOException {
        Assume.assumeTrue(ZoneId.systemDefault().toString().equals("Europe/Tallinn"));
        String sampleData = "{\"time\":\"2019-07-10T13:54:05.1\",\"level\":\"WARN\",\"message\":\"blob not accessible: ssh://user:pass@nosuchhost/adsasasdsad: Unknown host nosuchhost: No address associated with hostname\"}";
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        Warning warning = mapper.readValue(sampleData, Warning.class);
        Assert.assertEquals("2019-07-10T13:54:05.000000001+03:00", warning.getTime().toString());
    }

    @Test
    public void testDeserializeWithoutOffsetWithoutNs() throws IOException {
        Assume.assumeTrue(ZoneId.systemDefault().toString().equals("Europe/Tallinn"));
        String sampleData = "{\"time\":\"2019-07-10T13:54:05\",\"level\":\"WARN\",\"message\":\"blob not accessible: ssh://user:pass@nosuchhost/adsasasdsad: Unknown host nosuchhost: No address associated with hostname\"}";
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        Warning warning = mapper.readValue(sampleData, Warning.class);
        Assert.assertEquals("2019-07-10T13:54:05+03:00", warning.getTime().toString());
    }

    @Test
    public void testDeserializeWithZ() throws IOException {
        Assume.assumeTrue(ZoneId.systemDefault().toString().equals("Europe/Tallinn"));
        String sampleData = "{\"time\":\"2019-07-10T13:54:05.167Z\",\"level\":\"WARN\",\"message\":\"blob not accessible: ssh://user:pass@nosuchhost/adsasasdsad: Unknown host nosuchhost: No address associated with hostname\"}";
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        Warning warning = mapper.readValue(sampleData, Warning.class);
        Assert.assertEquals("2019-07-10T16:54:05.000000167+03:00", warning.getTime().toString());
    }

    @Test
    public void testDeserializeWithOffset() throws IOException {
        Assume.assumeTrue(ZoneId.systemDefault().toString().equals("Europe/Tallinn"));
        String sampleData = "{\"time\":\"2019-07-10T13:54:05.167+05:00\",\"level\":\"WARN\",\"message\":\"blob not accessible: ssh://user:pass@nosuchhost/adsasasdsad: Unknown host nosuchhost: No address associated with hostname\"}";
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        Warning warning = mapper.readValue(sampleData, Warning.class);
        Assert.assertEquals("2019-07-10T11:54:05.000000167+03:00", warning.getTime().toString());
    }
}
