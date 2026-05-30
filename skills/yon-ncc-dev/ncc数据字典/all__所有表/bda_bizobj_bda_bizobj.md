# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6700.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bizobj | pk_bizobj | pk_bizobj | char(20) | √ |
| 2 | bocode | bocode | bocode | varchar2(50) |
| 3 | boname | boname | boname | varchar2(200) |
| 4 | boname2 | boname2 | boname2 | varchar2(200) |
| 5 | boname3 | boname3 | boname3 | varchar2(200) |
| 6 | boname4 | boname4 | boname4 | varchar2(200) |
| 7 | boname5 | boname5 | boname5 | varchar2(200) |
| 8 | boname6 | boname6 | boname6 | varchar2(200) |
| 9 | dealstatus | dealstatus | dealstatus | number(38, 0) |
| 10 | maintable | maintable | maintable | varchar2(50) |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_maintable | pk_maintable | pk_maintable | varchar2(50) |
| 13 | remark | remark | remark | varchar2(200) |
| 14 | creationtime | creationtime | creationtime | char(19) |
| 15 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 18 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |