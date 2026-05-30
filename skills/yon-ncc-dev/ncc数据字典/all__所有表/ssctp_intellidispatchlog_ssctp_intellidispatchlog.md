# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11907.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_intellidispatchlog | pk_intellidispatchlog | pk_intellidispatchlog | char(20) | √ |
| 2 | content | content | content | clob |
| 3 | dispatchstatus | dispatchstatus | dispatchstatus | varchar2(50) |
| 4 | errormsg | errormsg | errormsg | varchar2(500) |
| 5 | pk_currenttask | pk_currenttask | pk_currenttask | varchar2(20) |
| 6 | pk_sscnode | pk_sscnode | pk_sscnode | varchar2(20) |
| 7 | pk_sscunit | pk_sscunit | pk_sscunit | varchar2(20) |  |  | '~' |
| 8 | pk_sscuser | pk_sscuser | pk_sscuser | varchar2(20) |  |  | '~' |
| 9 | pk_workinggroup | pk_workinggroup | pk_workinggroup | varchar2(20) |  |  | '~' |
| 10 | creationtime | creationtime | creationtime | char(19) |
| 11 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 14 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |