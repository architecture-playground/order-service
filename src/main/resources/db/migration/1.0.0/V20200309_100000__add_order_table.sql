CREATE TYPE order_management.order_status AS ENUM (
    'INITIATED',
    'COMPLETED',
    'CANCELED'
    );

CREATE TABLE order_management.order
(
    id           UUID NOT NULL PRIMARY KEY,
    order_status order_management.order_status DEFAULT 'INITIATED'
);
