# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10519.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pkconf | pkconf | pkconf | char(20) | √ |
| 2 | archfields | archfields | archfields | varchar2(200) |
| 3 | architfname | architfname | architfname | varchar2(300) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | billmaketime | billmaketime | billmaketime | char(19) |
| 6 | billtypes | billtypes | billtypes | varchar2(20) |  |  | '~' |
| 7 | detailitfname | detailitfname | detailitfname | varchar2(300) |
| 8 | fileitfname | fileitfname | fileitfname | varchar2(300) |
| 9 | ispreset | ispreset | ispreset | char(1) |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | creationtime | creationtime | creationtime | char(19) |
| 12 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 15 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |