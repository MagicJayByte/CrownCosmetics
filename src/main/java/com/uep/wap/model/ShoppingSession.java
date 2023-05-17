package com.uep.wap.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
@Getter
@Setter
@Entity
@Table(name = "shopping_session")
public class ShoppingSession {
        @Id
        @Column(name = "sesssion_id")
        private long sessionId;
        @Column(name = "total")
        private float total;
        @Column(name = "created_at")
        private Timestamp createdAt;
        @Column(name = "modified_at")
        private Timestamp modifiedAt;

        @OneToMany(mappedBy = "shoppingSession", cascade = CascadeType.ALL)
        private List<CartItem> cartItems;

        @OneToOne
        @JoinColumn(name = "user_id")
        private User user;

        @GeneratedValue(strategy = GenerationType.IDENTITY)
        public void setId(long id) {
            this.sessionId = id;
        }

        public long getId() {
            return sessionId;
        }

        public ShoppingSession() {

        }

        public Timestamp getModifiedAt() {
                return modifiedAt;
        }

        public void setModifiedAt(Timestamp modifiedAt) {
                this.modifiedAt = modifiedAt;

        }

        public long getSessionId() {
                return sessionId;
        }

        public void setSessionId(long sessionId) {
                this.sessionId = sessionId;
        }

        public Float getTotal() {
                return total;
        }

        public void setTotal(Float total) {
                this.total = total;
        }

        public Timestamp getCreatedAt() {
                return createdAt;
        }

        public void setCreatedAt(Timestamp createdAt) {
                this.createdAt = createdAt;
        }
}

