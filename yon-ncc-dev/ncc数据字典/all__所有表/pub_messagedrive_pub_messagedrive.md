# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10931.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_driveconfig | pk_driveconfig | pk_driveconfig | char(20) | √ |
| 2 | actiontype | actiontype | actiontype | varchar2(20) | √ |
| 3 | configflag | configflag | configflag | number(38, 0) | √ |
| 4 | operator | operator | operator | varchar2(20) |  |  | '~' |
| 5 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) | √ |
| 6 | pk_businesstype | pk_businesstype | pk_businesstype | char(20) | √ |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | pk_sourcebilltype | pk_sourcebilltype | pk_sourcebilltype | varchar2(20) | √ |
| 9 | pk_sourcebusinesstype | pk_sourcebusinesstype | pk_sourcebusinesstype | char(20) | √ |
| 10 | sourceaction | sourceaction | sourceaction | varchar2(20) |
| 11 | sysindex | sysindex | sysindex | number(38, 0) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |