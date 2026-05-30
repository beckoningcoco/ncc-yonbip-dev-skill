# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/13041.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_exsystem | pk_exsystem | pk_exsystem | char(20) | √ |
| 2 | deftranslator | deftranslator | deftranslator | number(1, 0) | √ |
| 3 | exsystemcode | exsystemcode | exsystemcode | varchar2(40) | √ |
| 4 | exsystemname | exsystemname | exsystemname | varchar2(300) | √ |
| 5 | exsystemname2 | exsystemname2 | exsystemname2 | varchar2(300) |
| 6 | exsystemname3 | exsystemname3 | exsystemname3 | varchar2(300) |
| 7 | exsystemname4 | exsystemname4 | exsystemname4 | varchar2(300) |
| 8 | exsystemname5 | exsystemname5 | exsystemname5 | varchar2(300) |
| 9 | exsystemname6 | exsystemname6 | exsystemname6 | varchar2(300) |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |