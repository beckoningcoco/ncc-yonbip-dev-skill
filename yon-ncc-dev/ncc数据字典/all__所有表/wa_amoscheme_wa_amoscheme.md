# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12852.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_amoscheme | pk_amoscheme | pk_amoscheme | char(20) | √ |
| 2 | classid | classid | classid | char(20) | √ |
| 3 | cperiod | cperiod | cperiod | char(2) | √ |
| 4 | cyear | cyear | cyear | char(4) | √ |
| 5 | fratio | fratio | fratio | number(9, 6) | √ |  | 0 |
| 6 | iitem | iitem | iitem | char(1) |
| 7 | name | name | name | varchar2(128) |
| 8 | name2 | name2 | name2 | varchar2(128) |
| 9 | name3 | name3 | name3 | varchar2(128) |
| 10 | name4 | name4 | name4 | varchar2(128) |
| 11 | name5 | name5 | name5 | varchar2(128) |
| 12 | name6 | name6 | name6 | varchar2(128) |
| 13 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |
| 14 | pk_group | pk_group | pk_group | char(20) | √ |
| 15 | pk_org | pk_org | pk_org | char(20) | √ |
| 16 | type | type | type | number(38, 0) | √ |
| 17 | vmemo | vmemo | vmemo | varchar2(128) |
| 18 | creationtime | creationtime | creationtime | char(19) |
| 19 | creator | creator | creator | char(20) |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 22 | modifier | modifier | modifier | char(20) |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |