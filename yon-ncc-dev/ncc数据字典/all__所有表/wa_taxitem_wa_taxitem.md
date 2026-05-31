# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12906.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_taxitem | pk_wa_taxitem | pk_wa_taxitem | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | cperiod | cperiod | cperiod | varchar2(2) |
| 4 | cyear | cyear | cyear | varchar2(4) |
| 5 | datatype | datatype | datatype | number(38, 0) |
| 6 | displayorder | displayorder | displayorder | number(38, 0) |
| 7 | field | field | field | varchar2(200) |
| 8 | formular | formular | formular | varchar2(2048) |
| 9 | formularstr | formularstr | formularstr | varchar2(2048) |
| 10 | itemtype | itemtype | itemtype | number(38, 0) |
| 11 | mustitemflag | mustitemflag | mustitemflag | char(1) |
| 12 | name | name | name | varchar2(256) |
| 13 | name2 | name2 | name2 | varchar2(256) |
| 14 | name3 | name3 | name3 | varchar2(256) |
| 15 | name4 | name4 | name4 | varchar2(256) |
| 16 | name5 | name5 | name5 | varchar2(256) |
| 17 | name6 | name6 | name6 | varchar2(256) |
| 18 | pk_country | pk_country | pk_country | varchar2(20) |
| 19 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 20 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 21 | pk_wa_class | pk_wa_class | pk_wa_class | varchar2(20) |
| 22 | pk_wa_taxsetbase | pk_wa_taxsetbase | pk_wa_taxsetbase | varchar2(20) |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |