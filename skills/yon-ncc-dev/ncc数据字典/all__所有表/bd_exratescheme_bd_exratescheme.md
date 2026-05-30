# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6922.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_exratescheme | pk_exratescheme | pk_exratescheme | char(20) | √ |
| 2 | code | code | code | varchar2(40) | √ |
| 3 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 4 | defaultflag | defaultflag | defaultflag | char(1) |
| 5 | desciption | desciption | desciption | varchar2(1024) |
| 6 | name | name | name | varchar2(200) | √ |
| 7 | name2 | name2 | name2 | varchar2(200) |
| 8 | name3 | name3 | name3 | varchar2(200) |
| 9 | name4 | name4 | name4 | varchar2(200) |
| 10 | name5 | name5 | name5 | varchar2(200) |
| 11 | name6 | name6 | name6 | varchar2(200) |
| 12 | pk_bankdoc | pk_bankdoc | pk_bankdoc | varchar2(20) |  |  | '~' |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | pk_timezone | pk_timezone | pk_timezone | varchar2(20) |  |  | '~' |
| 16 | creationtime | creationtime | creationtime | char(19) |
| 17 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 20 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |