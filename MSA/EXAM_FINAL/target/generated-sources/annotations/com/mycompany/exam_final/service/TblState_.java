package com.mycompany.exam_final.service;

import com.mycompany.exam_final.service.TblCity;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-09-20T18:45:39", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(TblState.class)
public class TblState_ { 

    public static volatile SingularAttribute<TblState, String> createdAt;
    public static volatile SingularAttribute<TblState, String> stateName;
    public static volatile SingularAttribute<TblState, Integer> stateId;
    public static volatile SingularAttribute<TblState, String> stateCode;
    public static volatile SingularAttribute<TblState, String> updatedAt;
    public static volatile CollectionAttribute<TblState, TblCity> tblCityCollection;

}