# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7273.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vouchertype | pk_vouchertype | pk_vouchertype | char(20) | √ |
| 2 | code | code | code | varchar2(40) | √ |
| 3 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 4 | description | description | description | varchar2(300) |
| 5 | description2 | description2 | description2 | varchar2(300) |
| 6 | description3 | description3 | description3 | varchar2(300) |
| 7 | description4 | description4 | description4 | varchar2(300) |
| 8 | description5 | description5 | description5 | varchar2(300) |
| 9 | description6 | description6 | description6 | varchar2(300) |
| 10 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 2 |
| 11 | name | name | name | varchar2(300) | √ |
| 12 | name2 | name2 | name2 | varchar2(300) |
| 13 | name3 | name3 | name3 | varchar2(300) |
| 14 | name4 | name4 | name4 | varchar2(300) |
| 15 | name5 | name5 | name5 | varchar2(300) |
| 16 | name6 | name6 | name6 | varchar2(300) |
| 17 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 18 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 19 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 20 | shortname | shortname | shortname | varchar2(300) |
| 21 | shortname2 | shortname2 | shortname2 | varchar2(300) |
| 22 | shortname3 | shortname3 | shortname3 | varchar2(300) |
| 23 | shortname4 | shortname4 | shortname4 | varchar2(300) |
| 24 | shortname5 | shortname5 | shortname5 | varchar2(300) |
| 25 | shortname6 | shortname6 | shortname6 | varchar2(300) |
| 26 | creationtime | creationtime | creationtime | char(19) |
| 27 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 28 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 29 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 30 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 31 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |