# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11829.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_flowpath | pk_flowpath | pk_flowpath | char(20) | √ |
| 2 | actiontype | actiontype | actiontype | varchar2(50) |
| 3 | beginstate | beginstate | beginstate | varchar2(20) |
| 4 | beigntime | beigntime | beigntime | char(19) |
| 5 | endtime | endtime | endtime | char(19) |
| 6 | isautoapprove | isautoapprove | isautoapprove | char(1) |
| 7 | operater | operater | operater | varchar2(20) |  |  | '~' |
| 8 | operatetime | operatetime | operatetime | char(19) |
| 9 | pk_currenttask | pk_currenttask | pk_currenttask | varchar2(20) |
| 10 | pk_task | pk_task | pk_task | varchar2(20) |
| 11 | statisticaltime | statisticaltime | statisticaltime | number(38, 0) |  |  | 0 |
| 12 | statisticaltime_calendar | statisticaltime_calendar | statisticaltime_calendar | number(38, 0) |  |  | 0 |
| 13 | taskstatus | taskstatus | taskstatus | varchar2(20) |
| 14 | creationtime | creationtime | creationtime | char(19) |
| 15 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 18 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |