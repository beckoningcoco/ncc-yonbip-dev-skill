# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6846.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_custfinance | pk_custfinance | pk_custfinance | char(20) | √ |
| 2 | cooperateflag | cooperateflag | cooperateflag | char(1) | √ |  | 'N' |
| 3 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 4 | innerctldeferdays | innerctldeferdays | innerctldeferdays | number(38, 0) |
| 5 | ispromtesettlement | ispromtesettlement | ispromtesettlement | char(1) | √ |  | 'Y' |
| 6 | pk_currtype1 | pk_currtype1 | pk_currtype1 | varchar2(20) |  |  | '~' |
| 7 | pk_customer | pk_customer | pk_customer | char(20) | √ |
| 8 | pk_group | pk_group | pk_group | char(20) | √ |
| 9 | pk_org | pk_org | pk_org | char(20) | √ |
| 10 | pk_payterm | pk_payterm | pk_payterm | varchar2(20) |  |  | '~' |
| 11 | pk_respdept1 | pk_respdept1 | pk_respdept1 | varchar2(20) |  |  | '~' |
| 12 | pk_resppsn1 | pk_resppsn1 | pk_resppsn1 | varchar2(20) |  |  | '~' |
| 13 | def1 | def1 | def1 | varchar2(101) |
| 14 | def2 | def2 | def2 | varchar2(101) |
| 15 | def3 | def3 | def3 | varchar2(101) |
| 16 | def4 | def4 | def4 | varchar2(101) |
| 17 | def5 | def5 | def5 | varchar2(101) |
| 18 | def6 | def6 | def6 | varchar2(101) |
| 19 | def7 | def7 | def7 | varchar2(101) |
| 20 | def8 | def8 | def8 | varchar2(101) |
| 21 | def9 | def9 | def9 | varchar2(101) |
| 22 | def10 | def10 | def10 | varchar2(101) |
| 23 | def11 | def11 | def11 | varchar2(101) |
| 24 | def12 | def12 | def12 | varchar2(101) |
| 25 | def13 | def13 | def13 | varchar2(101) |
| 26 | def14 | def14 | def14 | varchar2(101) |
| 27 | def15 | def15 | def15 | varchar2(101) |
| 28 | def16 | def16 | def16 | varchar2(101) |
| 29 | def17 | def17 | def17 | varchar2(101) |
| 30 | def18 | def18 | def18 | varchar2(101) |
| 31 | def19 | def19 | def19 | varchar2(101) |
| 32 | def20 | def20 | def20 | varchar2(101) |
| 33 | def21 | def21 | def21 | varchar2(101) |
| 34 | def22 | def22 | def22 | varchar2(101) |
| 35 | def23 | def23 | def23 | varchar2(101) |
| 36 | def24 | def24 | def24 | varchar2(101) |
| 37 | def25 | def25 | def25 | varchar2(101) |
| 38 | def26 | def26 | def26 | varchar2(101) |
| 39 | def27 | def27 | def27 | varchar2(101) |
| 40 | def28 | def28 | def28 | varchar2(101) |
| 41 | def29 | def29 | def29 | varchar2(101) |
| 42 | def30 | def30 | def30 | varchar2(101) |
| 43 | creationtime | creationtime | creationtime | char(19) |
| 44 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 45 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 46 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 47 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 48 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |