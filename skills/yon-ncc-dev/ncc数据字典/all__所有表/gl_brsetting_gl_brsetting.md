# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8441.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_brsetting | pk_brsetting | pk_brsetting | char(20) | √ |
| 2 | balanceori | balanceori | balanceori | varchar2(50) |
| 3 | closeaccctrltype | closeaccctrltype | closeaccctrltype | varchar2(4) |  |  | '1' |
| 4 | code | code | code | varchar2(50) |
| 5 | con_amount | con_amount | con_amount | char(1) |
| 6 | con_locamount | con_locamount | con_locamount | char(1) |
| 7 | con_quantity | con_quantity | con_quantity | char(1) |
| 8 | creatorg | creatorg | creatorg | varchar2(20) |  |  | '~' |
| 9 | desp | desp | desp | varchar2(50) |
| 10 | name | name | name | varchar2(300) |
| 11 | name2 | name2 | name2 | varchar2(300) |
| 12 | name3 | name3 | name3 | varchar2(300) |
| 13 | name4 | name4 | name4 | varchar2(300) |
| 14 | name5 | name5 | name5 | varchar2(300) |
| 15 | name6 | name6 | name6 | varchar2(300) |
| 16 | pk_accountingbook | pk_accountingbook | pk_accountingbook | varchar2(20) |  |  | '~' |
| 17 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 18 | pk_defdoc | pk_defdoc | pk_defdoc | varchar2(20) |  |  | '~' |
| 19 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 20 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 21 | pk_setofbook | pk_setofbook | pk_setofbook | varchar2(20) |  |  | '~' |
| 22 | pk_unit | pk_unit | pk_unit | varchar2(20) |
| 23 | pk_unit_v | pk_unit_v | pk_unit_v | varchar2(20) |
| 24 | qrytemplate | qrytemplate | qrytemplate | blob |
| 25 | type_balance | type_balance | type_balance | char(1) |
| 26 | type_endbal | type_endbal | type_endbal | char(1) |
| 27 | type_end_ocr | type_end_ocr | type_end_ocr | char(1) |
| 28 | creationtime | creationtime | creationtime | char(19) |
| 29 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 30 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 31 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 32 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 33 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |