# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6410.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version | pk_version | pk_version | char(20) | √ |
| 2 | pk_asset | pk_asset | pk_asset | char(20) | √ |
| 3 | venddate | venddate | venddate | char(19) |
| 4 | vname | vname | vname | varchar2(300) | √ |
| 5 | vname2 | vname2 | vname2 | varchar2(300) |
| 6 | vname3 | vname3 | vname3 | varchar2(300) |
| 7 | vname4 | vname4 | vname4 | varchar2(300) |
| 8 | vname5 | vname5 | vname5 | varchar2(300) |
| 9 | vname6 | vname6 | vname6 | varchar2(300) |
| 10 | vno | vno | vno | varchar2(50) | √ |
| 11 | vstartdate | vstartdate | vstartdate | char(19) |
| 12 | creationtime | creationtime | creationtime | char(19) |
| 13 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 16 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |