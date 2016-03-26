package com.observer.child;

import com.observer.father.Subject;

/**
 * Created by zzp on 2016/1/22.
 */
public class ConcreateSubject extends Subject {

    private String subjectState;//状态

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
