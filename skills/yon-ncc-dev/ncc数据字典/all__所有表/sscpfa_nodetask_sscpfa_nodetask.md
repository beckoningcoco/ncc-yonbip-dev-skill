# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11830.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_task | pk_task | pk_task | char(20) | √ |
| 2 | appointtime | appointtime | appointtime | char(19) |
| 3 | flownode | flownode | flownode | varchar2(200) |
| 4 | flownodename | flownodename | flownodename | varchar2(200) |
| 5 | isautoapprove | isautoapprove | isautoapprove | char(1) |  |  | 'N' |
| 6 | operatetime | operatetime | operatetime | char(19) |
| 7 | operator | operator | operator | varchar2(20) |  |  | '~' |
| 8 | pk_currenttask | pk_currenttask | pk_currenttask | varchar2(20) |
| 9 | pk_sscgroup | pk_sscgroup | pk_sscgroup | varchar2(20) |  |  | '~' |
| 10 | pk_sscnode | pk_sscnode | pk_sscnode | varchar2(20) |  |  | '~' |
| 11 | pk_sscuser | pk_sscuser | pk_sscuser | varchar2(20) |  |  | '~' |
| 12 | taskendtime | taskendtime | taskendtime | char(19) |
| 13 | taskstarttime | taskstarttime | taskstarttime | char(19) |
| 14 | taskstatus | taskstatus | taskstatus | varchar2(20) |
| 15 | creationtime | creationtime | creationtime | char(19) |
| 16 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 19 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |