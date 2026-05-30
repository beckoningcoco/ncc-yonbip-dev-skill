# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11879.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_publicfield | pk_publicfield | pk_publicfield | varchar2(36) | √ |
| 2 | code | code | code | varchar2(36) |
| 3 | datatype | datatype | datatype | varchar2(50) |
| 4 | name | name | name | varchar2(200) |
| 5 | name2 | name2 | name2 | varchar2(200) |
| 6 | name3 | name3 | name3 | varchar2(200) |
| 7 | name4 | name4 | name4 | varchar2(200) |
| 8 | name5 | name5 | name5 | varchar2(200) |
| 9 | name6 | name6 | name6 | varchar2(200) |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | refname | refname | refname | varchar2(36) |  |  | '~' |
| 13 | sysflag | sysflag | sysflag | char(1) |  |  | 'N' |
| 14 | creationtime | creationtime | creationtime | varchar2(20) |
| 15 | creator | creator | creator | varchar2(36) |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifiedtime | modifiedtime | modifiedtime | varchar2(20) |
| 18 | modifier | modifier | modifier | varchar2(50) |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |