# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7261.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wg | pk_wg | pk_wg | char(20) | √ |
| 2 | code | code | code | varchar2(30) |
| 3 | name | name | name | varchar2(50) |
| 4 | name2 | name2 | name2 | varchar2(50) |
| 5 | name3 | name3 | name3 | varchar2(50) |
| 6 | name4 | name4 | name4 | varchar2(50) |
| 7 | name5 | name5 | name5 | varchar2(50) |
| 8 | name6 | name6 | name6 | varchar2(50) |
| 9 | note | note | note | varchar2(256) |
| 10 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 13 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 14 | creationtime | creationtime | creationtime | char(19) |
| 15 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 18 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |