# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/13038.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contra | pk_contra | pk_contra | char(20) | √ |
| 2 | bdclass | bdclass | bdclass | varchar2(36) | √ |  | '~' |
| 3 | bdclass2 | bdclass2 | bdclass2 | varchar2(50) |
| 4 | exsystem | exsystem | exsystem | varchar2(20) | √ |
| 5 | pk_org | pk_org | pk_org | varchar2(20) | √ |  | '~' |
| 6 | pk_orgtype | pk_orgtype | pk_orgtype | varchar2(20) |  |  | '~' |
| 7 | creationtime | creationtime | creationtime | char(19) |
| 8 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 11 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |