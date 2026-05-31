# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6822.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_country | pk_country | pk_country | char(20) | √ |
| 2 | bbanrule | bbanrule | bbanrule | varchar2(50) |
| 3 | code | code | code | varchar2(40) | √ |
| 4 | codeth | codeth | codeth | varchar2(40) | √ |  | '~' |
| 5 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 6 | description | description | description | varchar2(300) |
| 7 | ename | ename | ename | varchar2(200) |
| 8 | ibanlength | ibanlength | ibanlength | number(38, 0) |
| 9 | ibanrule | ibanrule | ibanrule | varchar2(50) |
| 10 | iseucountry | iseucountry | iseucountry | char(1) |
| 11 | name | name | name | varchar2(300) | √ |
| 12 | name2 | name2 | name2 | varchar2(300) |
| 13 | name3 | name3 | name3 | varchar2(300) |
| 14 | name4 | name4 | name4 | varchar2(300) |
| 15 | name5 | name5 | name5 | varchar2(300) |
| 16 | name6 | name6 | name6 | varchar2(300) |
| 17 | phonecode | phonecode | phonecode | varchar2(20) |
| 18 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |
| 19 | pk_format | pk_format | pk_format | varchar2(20) |  |  | '~' |
| 20 | pk_lang | pk_lang | pk_lang | varchar2(20) | √ |
| 21 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 22 | pk_timezone | pk_timezone | pk_timezone | varchar2(20) | √ |  | '~' |
| 23 | wholename | wholename | wholename | varchar2(300) |
| 24 | wholename2 | wholename2 | wholename2 | varchar2(300) |
| 25 | wholename3 | wholename3 | wholename3 | varchar2(300) |
| 26 | wholename4 | wholename4 | wholename4 | varchar2(300) |
| 27 | wholename5 | wholename5 | wholename5 | varchar2(300) |
| 28 | wholename6 | wholename6 | wholename6 | varchar2(300) |
| 29 | creationtime | creationtime | creationtime | char(19) |
| 30 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 31 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 32 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 33 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 34 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |