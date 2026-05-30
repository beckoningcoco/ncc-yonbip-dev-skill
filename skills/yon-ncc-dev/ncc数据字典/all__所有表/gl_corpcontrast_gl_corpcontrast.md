# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8475.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_corpcontrast | pk_corpcontrast | pk_corpcontrast | char(20) | √ |
| 2 | batchno | batchno | batchno | varchar2(50) |
| 3 | btotalcontrast | btotalcontrast | btotalcontrast | char(1) |
| 4 | contrastdate | contrastdate | contrastdate | char(19) |
| 5 | contrastperiod | contrastperiod | contrastperiod | varchar2(50) |
| 6 | coperatorid | coperatorid | coperatorid | char(20) |
| 7 | credit_other | credit_other | credit_other | number(28, 8) |  |  | 0 |
| 8 | credit_self | credit_self | credit_self | number(28, 8) |  |  | 0 |
| 9 | debit_other | debit_other | debit_other | number(28, 8) |  |  | 0 |
| 10 | debit_self | debit_self | debit_self | number(28, 8) |  |  | 0 |
| 11 | globalcredit_other | globalcredit_other | globalcredit_other | number(28, 8) |  |  | 0 |
| 12 | globalcredit_self | globalcredit_self | globalcredit_self | number(28, 8) |  |  | 0 |
| 13 | globaldebit_other | globaldebit_other | globaldebit_other | number(28, 8) |  |  | 0 |
| 14 | globaldebit_self | globaldebit_self | globaldebit_self | number(28, 8) |  |  | 0 |
| 15 | groupcredit_other | groupcredit_other | groupcredit_other | number(28, 8) |  |  | 0 |
| 16 | groupcredit_self | groupcredit_self | groupcredit_self | number(28, 8) |  |  | 0 |
| 17 | groupdebit_other | groupdebit_other | groupdebit_other | number(28, 8) |  |  | 0 |
| 18 | groupdebit_self | groupdebit_self | groupdebit_self | number(28, 8) |  |  | 0 |
| 19 | loccredit_other | loccredit_other | loccredit_other | number(16, 4) |  |  | 0 |
| 20 | loccredit_self | loccredit_self | loccredit_self | number(16, 4) |  |  | 0 |
| 21 | locdebit_other | locdebit_other | locdebit_other | number(16, 4) |  |  | 0 |
| 22 | locdebit_self | locdebit_self | locdebit_self | number(16, 4) |  |  | 0 |
| 23 | period | period | period | char(2) |
| 24 | pk_contrastrule | pk_contrastrule | pk_contrastrule | char(20) |
| 25 | pk_group | pk_group | pk_group | varchar2(50) |
| 26 | pk_org | pk_org | pk_org | varchar2(50) |
| 27 | pk_otheraccountingbook | pk_otheraccountingbook | pk_otheraccountingbook | char(20) |
| 28 | pk_otherbook | pk_otherbook | pk_otherbook | char(20) |
| 29 | pk_otherorg | pk_otherorg | pk_otherorg | char(20) |
| 30 | pk_selfaccountingbook | pk_selfaccountingbook | pk_selfaccountingbook | char(20) |
| 31 | pk_selfbook | pk_selfbook | pk_selfbook | char(20) |
| 32 | pk_selforg | pk_selforg | pk_selforg | char(20) |
| 33 | pk_setofbook | pk_setofbook | pk_setofbook | char(20) |
| 34 | quantitycredit_other | quantitycredit_other | quantitycredit_other | number(38, 0) |
| 35 | quantitycredit_self | quantitycredit_self | quantitycredit_self | number(38, 0) |
| 36 | quantitydebit_other | quantitydebit_other | quantitydebit_other | number(38, 0) |
| 37 | quantitydebit_self | quantitydebit_self | quantitydebit_self | number(38, 0) |
| 38 | year | year | year | char(4) |
| 39 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 40 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |