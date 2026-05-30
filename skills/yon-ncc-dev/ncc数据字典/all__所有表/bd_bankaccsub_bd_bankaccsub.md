# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6758.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bankaccsub | pk_bankaccsub | pk_bankaccsub | char(20) | √ |
| 2 | accname | accname | accname | varchar2(200) |
| 3 | accnum | accnum | accnum | varchar2(40) |
| 4 | acctype | acctype | acctype | number(38, 0) |
| 5 | banknotespec | banknotespec | banknotespec | char(1) |
| 6 | code | code | code | varchar2(40) |
| 7 | concertedmny | concertedmny | concertedmny | number(16, 4) |
| 8 | cooverdraf | cooverdraf | cooverdraf | char(1) |
| 9 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 10 | defrozendate | defrozendate | defrozendate | char(19) |
| 11 | fronzenmny | fronzenmny | fronzenmny | number(16, 4) |
| 12 | fronzenstate | fronzenstate | fronzenstate | number(38, 0) | √ |  | 0 |
| 13 | frozendate | frozendate | frozendate | char(19) |
| 14 | isconcerted | isconcerted | isconcerted | char(1) |
| 15 | isdefault | isdefault | isdefault | char(1) |
| 16 | istrade | istrade | istrade | char(1) |
| 17 | name | name | name | varchar2(300) |
| 18 | name2 | name2 | name2 | varchar2(300) |
| 19 | name3 | name3 | name3 | varchar2(300) |
| 20 | name4 | name4 | name4 | varchar2(300) |
| 21 | name5 | name5 | name5 | varchar2(300) |
| 22 | name6 | name6 | name6 | varchar2(300) |
| 23 | overdraftmny | overdraftmny | overdraftmny | number(16, 4) | √ |
| 24 | overdrafttype | overdrafttype | overdrafttype | number(38, 0) |
| 25 | payarea | payarea | payarea | number(38, 0) |
| 26 | pk_bankaccbas | pk_bankaccbas | pk_bankaccbas | varchar2(20) |  |  | '~' |
| 27 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 28 | def1 | def1 | def1 | varchar2(101) |
| 29 | def2 | def2 | def2 | varchar2(101) |
| 30 | def3 | def3 | def3 | varchar2(101) |
| 31 | def4 | def4 | def4 | varchar2(101) |
| 32 | def5 | def5 | def5 | varchar2(101) |
| 33 | def6 | def6 | def6 | varchar2(101) |
| 34 | def7 | def7 | def7 | varchar2(101) |
| 35 | def8 | def8 | def8 | varchar2(101) |
| 36 | def9 | def9 | def9 | varchar2(101) |
| 37 | def10 | def10 | def10 | varchar2(101) |
| 38 | def11 | def11 | def11 | varchar2(101) |
| 39 | def12 | def12 | def12 | varchar2(101) |
| 40 | def13 | def13 | def13 | varchar2(101) |
| 41 | def14 | def14 | def14 | varchar2(101) |
| 42 | def15 | def15 | def15 | varchar2(101) |
| 43 | def16 | def16 | def16 | varchar2(101) |
| 44 | def17 | def17 | def17 | varchar2(101) |
| 45 | def18 | def18 | def18 | varchar2(101) |
| 46 | def19 | def19 | def19 | varchar2(101) |
| 47 | def20 | def20 | def20 | varchar2(101) |
| 48 | creationtime | creationtime | creationtime | char(19) |
| 49 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 50 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 51 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 52 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 53 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |