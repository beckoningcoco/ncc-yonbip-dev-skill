# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11846.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(36) | √ |
| 2 | code | code | code | varchar2(254) |
| 3 | fullpath | fullpath | fullpath | varchar2(254) |
| 4 | isleaf | isleaf | isleaf | char(1) |
| 5 | modulecode | modulecode | modulecode | varchar2(254) |
| 6 | name | name | name | varchar2(300) |
| 7 | name2 | name2 | name2 | varchar2(300) |
| 8 | name3 | name3 | name3 | varchar2(300) |
| 9 | name4 | name4 | name4 | varchar2(300) |
| 10 | name5 | name5 | name5 | varchar2(300) |
| 11 | name6 | name6 | name6 | varchar2(300) |
| 12 | parentid | parentid | parentid | varchar2(36) |
| 13 | pk_org | pk_org | pk_org | varchar2(36) |
| 14 | srcsystem | srcsystem | srcsystem | varchar2(254) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |