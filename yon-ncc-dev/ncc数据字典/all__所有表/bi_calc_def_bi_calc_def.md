# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7299.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | guid | guid | guid | char(20) | √ |
| 2 | defcode | defcode | defcode | varchar2(50) |
| 3 | defname | defname | defname | varchar2(300) |
| 4 | defname2 | defname2 | defname2 | varchar2(300) |
| 5 | defname3 | defname3 | defname3 | varchar2(300) |
| 6 | defname4 | defname4 | defname4 | varchar2(300) |
| 7 | defname5 | defname5 | defname5 | varchar2(300) |
| 8 | defname6 | defname6 | defname6 | varchar2(300) |
| 9 | dirid | dirid | dirid | varchar2(20) |  |  | '~' |
| 10 | model | model | model | blob |
| 11 | moduleid | moduleid | moduleid | varchar2(50) |
| 12 | note | note | note | varchar2(300) |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | creationtime | creationtime | creationtime | char(19) |
| 16 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 19 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |