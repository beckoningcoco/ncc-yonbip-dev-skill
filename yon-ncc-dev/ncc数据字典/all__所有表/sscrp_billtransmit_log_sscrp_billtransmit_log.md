# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11869.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_log | pk_log | pk_log | char(20) | √ |
| 2 | billid | billid | billid | varchar2(20) |
| 3 | billno | billno | billno | varchar2(30) |
| 4 | billtype | billtype | billtype | varchar2(20) |  |  | '~' |
| 5 | newbillmaker | newbillmaker | newbillmaker | varchar2(20) |  |  | '~' |
| 6 | oldbillmaker | oldbillmaker | oldbillmaker | varchar2(20) |  |  | '~' |
| 7 | operator | operator | operator | varchar2(20) |  |  | '~' |
| 8 | tradetype | tradetype | tradetype | varchar2(20) |  |  | '~' |
| 9 | def1 | def1 | def1 | varchar2(20) |
| 10 | def2 | def2 | def2 | varchar2(20) |
| 11 | def3 | def3 | def3 | varchar2(20) |
| 12 | creationtime | creationtime | creationtime | char(19) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |