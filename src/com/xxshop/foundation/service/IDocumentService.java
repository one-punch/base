package com.xxshop.foundation.service;

import com.xxshop.core.query.support.IPageList;
import com.xxshop.core.query.support.IQueryObject;
import com.xxshop.foundation.domain.Document;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IDocumentService
{
  public abstract boolean save(Document document);

  public abstract Document getObjById(Long id);

  public abstract boolean delete(Long id);

  public abstract boolean batchDelete(List<Serializable> ids);

  public abstract IPageList list(IQueryObject queryObject);

  public abstract boolean update(Document document);

  public abstract List<Document> query(String query, Map map, int begin, int max);

  public abstract Document getObjByProperty(String paramString, Object paramObject);
}

