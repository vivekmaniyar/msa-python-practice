package com.mycompany.exam_final.service;

import com.mycompany.exam_final.service.TblState;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-09-20T18:45:39", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(TblCity.class)
public class TblCity_ { 

    public static volatile SingularAttribute<TblCity, String> createdAt;
    public static volatile SingularAttribute<TblCity, String> cityName;
    public static volatile SingularAttribute<TblCity, String> cityCode;
    public static volatile SingularAttribute<TblCity, TblState> stateId;
    public static volatile SingularAttribute<TblCity, Integer> cityId;
    public static volatile SingularAttribute<TblCity, String> updatedAt;

}