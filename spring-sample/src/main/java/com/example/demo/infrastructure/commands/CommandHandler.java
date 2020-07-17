package com.example.demo.infrastructure.commands;

public interface CommandHandler<T> {

    void handle(T object);
}
