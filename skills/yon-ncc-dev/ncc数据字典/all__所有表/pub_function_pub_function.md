# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10921.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_function | pk_function | pk_function | char(20) | √ |
| 2 | arguments | arguments | arguments | varchar2(256) |
| 3 | classname | classname | classname | varchar2(50) | √ |
| 4 | code | code | code | varchar2(20) |
| 5 | functionnote | functionnote | functionnote | varchar2(120) |
| 6 | functionnote_resid | functionnote_resid | functionnote_resid | varchar2(38) |
| 7 | functype | functype | functype | number(38, 0) |  |  | 0 |
| 8 | hintmessage | hintmessage | hintmessage | varchar2(256) |
| 9 | iscomp | iscomp | iscomp | char(1) |
| 10 | methodname | methodname | methodname | varchar2(50) | √ |
| 11 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) | √ |
| 12 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 13 | returntype | returntype | returntype | varchar2(30) | √ |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |