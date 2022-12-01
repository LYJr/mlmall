package com.mlmall.appcommon.domain;

import javax.persistence.Embeddable;
import java.time.ZonedDateTime;

@Embeddable
public class DefaultDate {

    private ZonedDateTime start;
    private ZonedDateTime end;

}
