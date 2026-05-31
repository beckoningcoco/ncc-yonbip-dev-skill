# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12871.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_grd | pk_wa_grd | pk_wa_grd | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | ismultsec | ismultsec | ismultsec | char(1) | √ |
| 4 | isrange | isrange | isrange | char(1) |  |  | 'N' |
| 5 | name | name | name | varchar2(100) | √ |
| 6 | name2 | name2 | name2 | varchar2(100) |
| 7 | name3 | name3 | name3 | varchar2(100) |
| 8 | name4 | name4 | name4 | varchar2(100) |
| 9 | name5 | name5 | name5 | varchar2(100) |
| 10 | name6 | name6 | name6 | varchar2(100) |
| 11 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 12 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 13 | pk_wa_item | pk_wa_item | pk_wa_item | varchar2(20) |
| 14 | prmlvcnt | prmlvcnt | prmlvcnt | number(38, 0) |
| 15 | prmlv_money_sort | prmlv_money_sort | prmlv_money_sort | number(38, 0) |
| 16 | seclvcnt | seclvcnt | seclvcnt | number(38, 0) |
| 17 | seclv_money_sort | seclv_money_sort | seclv_money_sort | number(38, 0) |
| 18 | vmemo | vmemo | vmemo | varchar2(1024) |
| 19 | creationtime | creationtime | creationtime | char(19) | √ |
| 20 | creator | creator | creator | varchar2(20) | √ |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 23 | modifier | modifier | modifier | varchar2(20) |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |