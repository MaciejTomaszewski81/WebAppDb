CREATE TABLE tabela_testowa (
    id bigint NOT NULL,
    kolumna1 character varying(256),
    kolumna2 character varying(256),
    kolumna3 character varying(256),
    kolumna4 bigint
);
insert into tabela_testowa VALUES
 ('1','wartość1','wartość2','wartość3','1'),
 ('2','wartość21','wartość22','wartość23','5'),
 ('3','wartość31','wartość22','wartość32','6'),
 ('4','wartość54','wartość43','wartość45','4'),
 ('5','wartość43','wartość23','wartość34','4'),
 ('6','wartość43','wartość54','wartość43','2'),
 ('7','wartość54','wartość52','wartość53','8'),
 ('8','wartość21','wartość2211','wartość43','4'),
 ('9','wartość43','wartość33','wartość45','9'),
 ('10','wartość87','wartość62','wartość11','3');