package ru.skillbox.common.events.account;

import java.util.UUID;

public class UserEvent {

    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String role;
    private String messagePermission;
    private boolean deleted;
    private boolean blocked;

    // Пустой конструктор
    public UserEvent() {
    }

    // Конструктор с параметрами
    public UserEvent(UUID id, String firstName, String lastName, String email, String password,
                     String role, String messagePermission, boolean deleted, boolean blocked) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.role = role;
        this.messagePermission = messagePermission;
        this.deleted = deleted;
        this.blocked = blocked;
    }

    // Геттеры и сеттеры
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getMessagePermission() {
        return messagePermission;
    }

    public void setMessagePermission(String messagePermission) {
        this.messagePermission = messagePermission;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }
}
