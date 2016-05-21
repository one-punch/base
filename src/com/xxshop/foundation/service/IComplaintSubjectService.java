package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.ComplaintSubject;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IComplaintSubjectService
{
  public abstract boolean save(ComplaintSubject complaintSubject);

  public abstract ComplaintSubject getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(ComplaintSubject complaintSubject);

  public abstract List<ComplaintSubject> query(String query, Map map, int begin, int max);
}

