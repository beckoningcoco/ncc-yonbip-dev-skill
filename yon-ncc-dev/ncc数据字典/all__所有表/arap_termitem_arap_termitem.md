# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6593.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_termitem | pk_termitem | pk_termitem | char(20) | √ |
| 2 | expiredate | expiredate | expiredate | char(19) |
| 3 | globalbalance | globalbalance | globalbalance | number(28, 8) |
| 4 | globalcredit | globalcredit | globalcredit | number(28, 8) |
| 5 | globaldebit | globaldebit | globaldebit | number(28, 8) |
| 6 | globallocal | globallocal | globallocal | number(28, 8) |
| 7 | groupbalance | groupbalance | groupbalance | number(28, 8) |
| 8 | groupcredit | groupcredit | groupcredit | number(28, 8) |
| 9 | groupdebit | groupdebit | groupdebit | number(28, 8) |
| 10 | grouplocal | grouplocal | grouplocal | number(28, 8) |
| 11 | innerctldeferdays | innerctldeferdays | innerctldeferdays | char(19) |
| 12 | insurance | insurance | insurance | char(1) |
| 13 | lastdiscount | lastdiscount | lastdiscount | number(9, 6) |
| 14 | lastdiscountdate | lastdiscountdate | lastdiscountdate | char(19) |
| 15 | local_money_bal | local_money_bal | local_money_bal | number(28, 8) |
| 16 | local_money_cr | local_money_cr | local_money_cr | number(28, 8) |
| 17 | local_money_de | local_money_de | local_money_de | number(28, 8) |
| 18 | money_bal | money_bal | money_bal | number(28, 8) |
| 19 | money_cr | money_cr | money_cr | number(28, 8) |
| 20 | money_de | money_de | money_de | number(28, 8) |
| 21 | occupationmny | occupationmny | occupationmny | number(28, 8) |
| 22 | pk_bill | pk_bill | pk_bill | char(20) |
| 23 | pk_group | pk_group | pk_group | char(20) |
| 24 | pk_item | pk_item | pk_item | char(20) |
| 25 | pk_org | pk_org | pk_org | char(20) |
| 26 | pk_org_v | pk_org_v | pk_org_v | char(20) |
| 27 | pk_term_b | pk_term_b | pk_term_b | varchar2(20) |
| 28 | prepay | prepay | prepay | char(1) |
| 29 | quantity_bal | quantity_bal | quantity_bal | number(20, 8) |
| 30 | quantity_cr | quantity_cr | quantity_cr | number(20, 8) |
| 31 | quantity_de | quantity_de | quantity_de | number(20, 8) |
| 32 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 33 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |