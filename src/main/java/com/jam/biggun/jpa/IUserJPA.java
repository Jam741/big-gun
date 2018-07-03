package com.jam.biggun.jpa;

import com.jam.biggun.domain.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;


/**
 * JpaRepository接口（SpringDataJPA提供的简单数据操作接口）
 * JpaSpecificationExecutor（SpringDataJPA提供的复杂查询接口）
 * Serializable（序列化接口）。
 */
public interface IUserJPA extends JpaRepository<UserEntity, Long>, JpaSpecificationExecutor<UserEntity>, Serializable {
}
