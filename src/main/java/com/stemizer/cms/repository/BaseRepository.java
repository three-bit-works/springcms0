package com.stemizer.cms.repository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public abstract class BaseRepository< T > {

    private Class< T > theClass;

    @Autowired
    EntityManager entityManager;

    @Transactional
    public  void setTheClass(Class< T > classToSet ){
        this.theClass = classToSet;
    }

    @Transactional
    public T get( Integer id ){

        T entity =   getCurrentSession().get(theClass, id );
        return entity;
    }

    @Transactional
    public List< T > getAll(){
        return getCurrentSession().createQuery( "from " + theClass.getName() ).list();
    }

    @Transactional
    public void saveOrUpdate( T entity ){
        getCurrentSession().saveOrUpdate( entity );
    }


    @Transactional
    public void delete( Integer entityId ) {
        T entity =get( entityId );
        getCurrentSession().delete(entity);
    }

    protected final Session getCurrentSession() {
        Session session  = entityManager.unwrap(Session.class);

        return session;
    }
}