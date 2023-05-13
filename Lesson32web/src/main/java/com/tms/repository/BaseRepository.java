package com.tms.repository;


import com.tms.repository.util.ConnectionPool;

public interface BaseRepository {

    ConnectionPool CONNECTION_POOL = ConnectionPool.getInstance();
}