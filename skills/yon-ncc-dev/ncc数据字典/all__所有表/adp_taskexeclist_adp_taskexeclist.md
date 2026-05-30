# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6435.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | executorid | executorid | executorid | char(20) | √ |
| 2 | execsysid | execsysid | execsysid | varchar2(20) |  |  | '~' |
| 3 | firstsendtime | firstsendtime | firstsendtime | char(19) |
| 4 | opertype | opertype | opertype | number(38, 0) |
| 5 | sendingtarget | sendingtarget | sendingtarget | char(20) | √ |
| 6 | sendstatus | sendstatus | sendstatus | number(38, 0) |
| 7 | sendtime | sendtime | sendtime | char(19) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |