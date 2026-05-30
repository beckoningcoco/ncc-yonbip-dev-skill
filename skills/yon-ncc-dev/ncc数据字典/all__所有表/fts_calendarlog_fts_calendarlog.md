# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8386.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_calendar | pk_calendar | pk_calendar | char(20) | √ |
| 2 | closer | closer | closer | varchar2(20) |  |  | '~' |
| 3 | closetime | closetime | closetime | char(19) |
| 4 | downer | downer | downer | varchar2(20) |  |  | '~' |
| 5 | downtime | downtime | downtime | char(19) |
| 6 | orgworkdate | orgworkdate | orgworkdate | char(10) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 9 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 10 | starter | starter | starter | varchar2(20) |  |  | '~' |
| 11 | starttime | starttime | starttime | char(19) |
| 12 | workdate | workdate | workdate | char(19) |
| 13 | creationtime | creationtime | creationtime | char(19) |
| 14 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 17 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |