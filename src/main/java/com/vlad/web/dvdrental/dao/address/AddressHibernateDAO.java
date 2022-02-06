package com.vlad.web.dvdrental.dao.address;


import com.vlad.web.dvdrental.dao.AbstractDAO;
import com.vlad.web.dvdrental.dto.AddressDTO;
import com.vlad.web.dvdrental.model.Address;
import com.vlad.web.dvdrental.util.DateUtil;
import com.vlad.web.dvdrental.util.HibernateUtil;
import lombok.SneakyThrows;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddressHibernateDAO implements AbstractDAO<AddressDTO> {

    @SneakyThrows
    @Override
    public List<AddressDTO> findAll() {
        List<AddressDTO> result = new ArrayList<>();
        final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        final Session session = sessionFactory.getCurrentSession();
        try {
            final Transaction transaction = session.beginTransaction();
            result.addAll(session.createQuery("SELECT a FROM  Address a ", Address.class)
                    .getResultStream()
                    .limit(25)
                    .map(this::convertEntityToDto)
                    .collect(Collectors.toList()));
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public AddressDTO findById(Long id) {
        final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        final Session session = sessionFactory.getCurrentSession();
        Address address = new Address();
        try {
            final Transaction transaction = session.beginTransaction();
            address = session.createQuery("SELECT a FROM Address a WHERE a.addressId = " + id, Address.class)
                    .getSingleResult();
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return convertEntityToDto(address);
    }

    @Override
    public void deleteById(Long id) {
        final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        final Session session = sessionFactory.getCurrentSession();
        try {
            final Transaction transaction = session.beginTransaction();
            Address address = new Address();
            address.setAddressId(id);
            session.delete(address);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void save(AddressDTO addressDTO) {
        final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        final Session session = sessionFactory.getCurrentSession();
        try {
            final Transaction transaction = session.beginTransaction();
            session.save(convertDTOToEntity(addressDTO));
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public AddressDTO convertEntityToDto(Address address) {
        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setAddressId(address.getAddressId());
        addressDTO.setAddress(address.getAddress());
        addressDTO.setAddress2(address.getAddress2());
        addressDTO.setDistrict(address.getDistrict());
        addressDTO.setCityId(address.getCityId());
        addressDTO.setPostelCode(address.getPostelCode());
        addressDTO.setPhone(address.getPhone());
        addressDTO.setLastUpdate(DateUtil.convertDateToString(address.getLastUpdate(), DateUtil.DATE_PAGE_FORMAT));
        return addressDTO;
    }

    private Address convertDTOToEntity(AddressDTO addressDTO) {
        Address address = new Address();
        address.setAddressId(addressDTO.getAddressId());
        address.setAddress(addressDTO.getAddress());
        address.setAddress2(addressDTO.getAddress2());
        address.setDistrict(addressDTO.getDistrict());
        address.setCityId(addressDTO.getCityId());
        address.setPostelCode(addressDTO.getPostelCode());
        address.setPhone(addressDTO.getPhone());
        address.setLastUpdate(LocalDateTime.now());
        return address;
    }

    public int countPages() {
        final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        final Session session = sessionFactory.getCurrentSession();
        Long result = 0L;
        try {
            final Transaction transaction = session.beginTransaction();
            String countQ = "Select count (a.id) from Address a";
            Query countQuery = session.createQuery(countQ);
            Long countResults = (Long) countQuery.uniqueResult();
            result = countResults;
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result.intValue() % 25 == 0 ? result.intValue() / 25 : (result.intValue() / 25) + 1;
    }

    public List<AddressDTO> findAllByPage(int currentPage) {
        final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        final Session session = sessionFactory.getCurrentSession();
        List<Address> listAddress = new ArrayList<>();
        try {
            final Transaction transaction = session.beginTransaction();
            Query selectQuery = session.createQuery("From Address");
            selectQuery.setFirstResult((currentPage - 1) * 25);
            selectQuery.setMaxResults(25);
            listAddress = selectQuery.list();
            transaction.commit();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        return listAddress.stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());

    }
}

