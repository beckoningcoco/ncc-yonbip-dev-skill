# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9612.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dxtype | pk_dxtype | pk_dxtype | char(20) | √ |
| 2 | code | code | code | number(38, 0) |
| 3 | dataorigin | dataorigin | dataorigin | varchar2(500) |
| 4 | isbuiltin | isbuiltin | isbuiltin | char(1) |
| 5 | name | name | name | varchar2(300) |
| 6 | name2 | name2 | name2 | varchar2(300) |
| 7 | name3 | name3 | name3 | varchar2(300) |
| 8 | name4 | name4 | name4 | varchar2(300) |
| 9 | name5 | name5 | name5 | varchar2(300) |
| 10 | name6 | name6 | name6 | varchar2(300) |
| 11 | note | note | note | varchar2(2000) |
| 12 | note2 | note2 | note2 | varchar2(2000) |
| 13 | note3 | note3 | note3 | varchar2(2000) |
| 14 | note4 | note4 | note4 | varchar2(2000) |
| 15 | note5 | note5 | note5 | varchar2(2000) |
| 16 | note6 | note6 | note6 | varchar2(2000) |
| 17 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 18 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 19 | creationtime | creationtime | creationtime | char(19) |
| 20 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 23 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |