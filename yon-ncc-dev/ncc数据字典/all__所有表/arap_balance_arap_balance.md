# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6559.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_balance | pk_balance | pk_balance | char(20) | √ |
| 2 | accmonth | accmonth | accmonth | char(2) |
| 3 | accperiod | accperiod | accperiod | char(7) |
| 4 | accyear | accyear | accyear | char(4) |
| 5 | billclass | billclass | billclass | varchar2(10) |
| 6 | billstatus | billstatus | billstatus | number(38, 0) |
| 7 | compondmd5 | compondmd5 | compondmd5 | varchar2(32) |
| 8 | customer | customer | customer | varchar2(20) |
| 9 | effectstatus | effectstatus | effectstatus | number(38, 0) |
| 10 | globallocal_money_cr | globallocal_money_cr | globallocal_money_cr | number(28, 8) |
| 11 | globallocal_money_de | globallocal_money_de | globallocal_money_de | number(28, 8) |
| 12 | grouplocal_money_cr | grouplocal_money_cr | grouplocal_money_cr | number(28, 8) |
| 13 | grouplocal_money_de | grouplocal_money_de | grouplocal_money_de | number(28, 8) |
| 14 | isrefund | isrefund | isrefund | char(1) |  |  | 'N' |
| 15 | local_money_cr | local_money_cr | local_money_cr | number(28, 8) |
| 16 | local_money_de | local_money_de | local_money_de | number(28, 8) |
| 17 | money_cr | money_cr | money_cr | number(28, 8) |
| 18 | money_de | money_de | money_de | number(28, 8) |
| 19 | objtype | objtype | objtype | number(38, 0) |
| 20 | pk_currtype | pk_currtype | pk_currtype | char(20) |
| 21 | pk_deptid | pk_deptid | pk_deptid | varchar2(20) |
| 22 | pk_group | pk_group | pk_group | char(20) |
| 23 | pk_org | pk_org | pk_org | char(20) |
| 24 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |
| 25 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |
| 26 | quantity_cr | quantity_cr | quantity_cr | number(28, 8) |
| 27 | quantity_de | quantity_de | quantity_de | number(28, 8) |
| 28 | supplier | supplier | supplier | varchar2(20) |
| 29 | def1 | def1 | def1 | varchar2(101) |
| 30 | def2 | def2 | def2 | varchar2(101) |
| 31 | def3 | def3 | def3 | varchar2(101) |
| 32 | def4 | def4 | def4 | varchar2(101) |
| 33 | def5 | def5 | def5 | varchar2(101) |
| 34 | def6 | def6 | def6 | varchar2(101) |
| 35 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 36 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |