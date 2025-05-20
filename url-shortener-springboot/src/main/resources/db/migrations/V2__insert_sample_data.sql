-- Sample data for users and short_urls tables

-- Insert users
INSERT INTO users (id, email, password, name, role, created_at) VALUES
(1, 'alice@example.com', '$2a$10$alicehash', 'Alice', 'ROLE_USER', CURRENT_TIMESTAMP),
(2, 'bob@example.com', '$2a$10$bobhash', 'Bob', 'ROLE_USER', CURRENT_TIMESTAMP),
(3, 'admin@example.com', '$2a$10$adminhash', 'Admin', 'ROLE_ADMIN', CURRENT_TIMESTAMP);

-- Insert short_urls
INSERT INTO short_urls (id, short_key, original_url, is_private, expires_at, created_by, click_count, created_at) VALUES
(1, 'abc123', 'https://www.google.com', FALSE, NULL, 1, 10, CURRENT_TIMESTAMP),
(2, 'xyz789', 'https://www.github.com', TRUE, '2025-12-31 23:59:59', 2, 5, CURRENT_TIMESTAMP),
(3, 'hello1', 'https://spring.io', FALSE, NULL, 1, 0, CURRENT_TIMESTAMP),
(4, 'admin1', 'https://admin.example.com', TRUE, NULL, 3, 2, CURRENT_TIMESTAMP);