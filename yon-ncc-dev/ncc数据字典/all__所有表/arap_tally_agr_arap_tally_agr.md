# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6591.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tally_agr | pk_tally_agr | pk_tally_agr | varchar2(20) | √ |
| 2 | deal_globallocal_money | deal_globallocal_money | deal_globallocal_money | number(28, 8) |
| 3 | deal_grouplocal_money | deal_grouplocal_money | deal_grouplocal_money | number(28, 8) |
| 4 | deal_local_money | deal_local_money | deal_local_money | number(28, 8) |
| 5 | deal_money | deal_money | deal_money | number(28, 8) |
| 6 | deal_quantity | deal_quantity | deal_quantity | number(28, 8) |
| 7 | expiredate | expiredate | expiredate | char(19) |
| 8 | globallocal_money_cr | globallocal_money_cr | globallocal_money_cr | number(28, 8) |
| 9 | globallocal_money_de | globallocal_money_de | globallocal_money_de | number(28, 8) |
| 10 | grouplocal_money_cr | grouplocal_money_cr | grouplocal_money_cr | number(28, 8) |
| 11 | grouplocal_money_de | grouplocal_money_de | grouplocal_money_de | number(28, 8) |
| 12 | inner_effect_date | inner_effect_date | inner_effect_date | varchar2(19) |
| 13 | local_money_cr | local_money_cr | local_money_cr | number(28, 8) |
| 14 | local_money_de | local_money_de | local_money_de | number(28, 8) |
| 15 | money_cr | money_cr | money_cr | number(28, 8) |
| 16 | money_de | money_de | money_de | number(28, 8) |
| 17 | pk_bill | pk_bill | pk_bill | char(20) |
| 18 | pk_busidata | pk_busidata | pk_busidata | varchar2(20) |
| 19 | pk_dealnum | pk_dealnum | pk_dealnum | varchar2(50) |
| 20 | pk_group | pk_group | pk_group | varchar2(20) |
| 21 | pk_item | pk_item | pk_item | char(20) |
| 22 | pk_org | pk_org | pk_org | varchar2(20) |
| 23 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |
| 24 | pk_tally | pk_tally | pk_tally | char(20) | √ |
| 25 | pk_termitem | pk_termitem | pk_termitem | char(20) |
| 26 | quantity_cr | quantity_cr | quantity_cr | number(28, 8) |
| 27 | quantity_de | quantity_de | quantity_de | number(28, 8) |
| 28 | tallydate | tallydate | tallydate | char(19) |
| 29 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 30 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |