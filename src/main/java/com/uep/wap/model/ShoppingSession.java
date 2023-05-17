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
        @Column(name = "session_id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
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

        public ShoppingSession() {
        }

}

