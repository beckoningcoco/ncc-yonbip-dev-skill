# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6863.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cust_sup | pk_cust_sup | pk_cust_sup | char(20) | √ |
| 2 | code | code | code | varchar2(40) | √ |
| 3 | custenablestate | custenablestate | custenablestate | number(38, 0) |  |  | 2 |
| 4 | custsupprop | custsupprop | custsupprop | number(38, 0) |
| 5 | custsuptype | custsuptype | custsuptype | number(38, 0) |
| 6 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 7 | innerprofitcenter | innerprofitcenter | innerprofitcenter | char(1) |  |  | 'N' |
| 8 | mnecode | mnecode | mnecode | varchar2(50) |
| 9 | name | name | name | varchar2(300) | √ |
| 10 | name2 | name2 | name2 | varchar2(300) |
| 11 | name3 | name3 | name3 | varchar2(300) |
| 12 | name4 | name4 | name4 | varchar2(300) |
| 13 | name5 | name5 | name5 | varchar2(300) |
| 14 | name6 | name6 | name6 | varchar2(300) |
| 15 | pk_areacl | pk_areacl | pk_areacl | varchar2(20) |  |  | '~' |
| 16 | pk_custclass | pk_custclass | pk_custclass | varchar2(20) |  |  | '~' |
| 17 | pk_financeorg | pk_financeorg | pk_financeorg | varchar2(20) |  |  | '~' |
| 18 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 19 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 20 | pk_profitcenter | pk_profitcenter | pk_profitcenter | varchar2(20) |  |  | '~' |
| 21 | pk_supplierclass | pk_supplierclass | pk_supplierclass | varchar2(20) |  |  | '~' |
| 22 | shortname | shortname | shortname | varchar2(300) |
| 23 | supenablestate | supenablestate | supenablestate | number(38, 0) |  |  | 2 |
| 24 | taxpayerid | taxpayerid | taxpayerid | varchar2(20) |
| 25 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 26 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |