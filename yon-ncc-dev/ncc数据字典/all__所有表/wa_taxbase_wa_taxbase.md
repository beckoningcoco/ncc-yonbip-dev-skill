# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12903.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_taxbase | pk_wa_taxbase | pk_wa_taxbase | char(20) | √ |
| 2 | code | code | code | varchar2(50) | √ |
| 3 | itbltype | itbltype | itbltype | number(38, 0) |
| 4 | mdebuctamount | mdebuctamount | mdebuctamount | number(31, 8) |  |  | 0 |
| 5 | name | name | name | varchar2(100) | √ |
| 6 | name2 | name2 | name2 | varchar2(100) |
| 7 | name3 | name3 | name3 | varchar2(100) |
| 8 | name4 | name4 | name4 | varchar2(100) |
| 9 | name5 | name5 | name5 | varchar2(100) |
| 10 | name6 | name6 | name6 | varchar2(100) |
| 11 | ndebuctamount | ndebuctamount | ndebuctamount | number(31, 8) | √ |
| 12 | ndebuctlowest | ndebuctlowest | ndebuctlowest | number(31, 8) | √ |
| 13 | ndebuctrate | ndebuctrate | ndebuctrate | number(9, 6) | √ |  | 0 |
| 14 | ndeductcritn | ndeductcritn | ndeductcritn | number(31, 8) |
| 15 | nfixrate | nfixrate | nfixrate | number(9, 6) |
| 16 | pk_country | pk_country | pk_country | varchar2(20) |
| 17 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 18 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 19 | creationtime | creationtime | creationtime | char(19) | √ |
| 20 | creator | creator | creator | varchar2(20) | √ |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 23 | modifier | modifier | modifier | varchar2(20) |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |