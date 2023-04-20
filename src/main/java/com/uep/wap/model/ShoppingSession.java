package com.uep.wap.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "shopping_session")
public class ShoppingSession {
        @Id
        @Column(name = "sesssion_id")
        private long sessionId;
        @Column(name = "total")
        private Float total;
        @Column(name = "created_at")
        private Timestamp createdAt;
        @Column(name = "modified_at")
        private Timestamp modifiedAt;

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

