INSERT INTO
  users (
    username,
    email,
    pwd,
    first_name,
    last_name,
    phone,
    role
  )
VALUES
  (
    'jdoe454',
    'jdoe@google.com',
    'ff61eb9a4a6360f66abee80009b6b5bd2ba9adb17847c9ad9469823421fcd690095c66d31b0c76016be81ccbeb456fe29073e0e35f0f02714e09d8ae156f9915.c2763f8778554788b2ed4197a0314c02',
    'John',
    'Doe',
    '1234567899',
    'customer'
  );
INSERT INTO
  users (
    username,
    email,
    pwd,
    first_name,
    last_name,
    phone,
    role
  )
VALUES
  (
    'admin',
    'smdaniel@ykz.com',
    '6b0ddffa0c47c26c27519fb5f9208f17addac4e0f47d0fa4bf16802cb445b173934dffdaa43b4fec0e22deb5b1a26f5c33c0ebcff17a049f21d3495c171ef351.1b2ce52529f9b7df139bdd4c6caeff3c',
    'Daniel',
    'Smith',
    '1234567899',
    'admin'
  );
INSERT INTO
  users (
    username,
    email,
    pwd,
    first_name,
    last_name,
    phone,
    role
  )
VALUES
  (
    'sklein',
    'sklein@ykz.com',
    '7e2cafbb57440b59ec3f4d4784b6701444dbd32ece60730514955a995fe628e90c65f7d32417624968006ff9a6c5bcbb70c08c3adff0fbe079a811b87a53855e.15a4ee9b91ec4daf84ce19df4a6dec87',
    'Sophia',
    'Klein',
    '1234567899',
    'employee'
  );
INSERT INTO
  users (
    username,
    email,
    pwd,
    first_name,
    last_name,
    phone,
    role
  )
VALUES
  (
    'lpeters',
    'peterslau@verizon.net',
    '6b034ac788b11d85d9cd20ac16a26f8af50c0d520fab94945d2648354ddeea7d8e08fe2685d45295f18b10418121ee936db56160ff98496e4bb35f467367bd66.152abab056dd42b3c29a3119b676365c',
    'Lauren',
    'Peterson',
    '4132642985',
    'customer'
  );
INSERT INTO
  users (
    username,
    email,
    pwd,
    first_name,
    last_name,
    phone,
    role
  )
VALUES
  (
    'jpeters',
    'jpeter@gmail.com',
    '6277606f9a2c5eb3300d41f266d57b79629dc93cbb249257b202afbea6cfec8b1ee8e8e22bf66a038b05b2fb580f2774f2d54d3075ce6b11e2e0bef0d77448cf.9caf43a73d6efa84eff12ad1b8809568',
    'Jake',
    'Peterson',
    '4132648529',
    'customer'
  );


INSERT INTO address (user_id, street, city, state, zip) VALUES(1, '404 Example Rd', 'New York', 'NY', '10017');
INSERT INTO address (user_id, street, city, state, zip) VALUES(2, '403 Example Rd', 'New York', 'NY', '10017');
INSERT INTO address (user_id, street, city, state, zip) VALUES( 3, '8917 Turcotte Tunnel Apt. 175', 'Morrisberg', 'VT', '63234' );
INSERT INTO address (user_id, street, city, state, zip) VALUES( 4, '1700 Zula Summit', 'Stantontown', 'NC', '27817' );
INSERT INTO address (user_id, street, city, state, zip) VALUES( 5, '1700 Zula Summit', 'Stantontown', 'NC', '27817' );

INSERT INTO account (user_id, balance, status) VALUES(1, 10000, 'active');
INSERT INTO account(user_id, balance, status) VALUES(4, 5412300, 'active');
INSERT INTO account (user_id, balance, status) VALUES(5, 514067, 'active');
INSERT INTO account (user_id, balance, status) VALUES(5, 514067, 'active');
INSERT INTO account (user_id, balance, status) VALUES(1, 10000, 'pending');
INSERT INTO account_holder (user_id, account_id) VALUES (1, 1);
INSERT INTO account_holder (user_id, account_id) VALUES (1, 5);
-- Jake Peters and Lauren Peters have a joint account
INSERT INTO account_holder (user_id, account_id) VALUES (4, 2), (5, 2);
-- Jake also has account of his own
INSERT INTO account_holder (user_id, account_id) VALUES (5, 3);