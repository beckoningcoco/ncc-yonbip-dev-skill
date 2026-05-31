# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7413.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_jobsegmentation_b | pk_jobsegmentation_b | pk_jobsegmentation_b | char(20) | √ |
| 2 | costfactor | costfactor | costfactor | varchar2(20) |  |  | '~' |
| 3 | enablestate | enablestate | enablestate | number(38, 0) |
| 4 | factorgroup | factorgroup | factorgroup | varchar2(20) |  |  | '~' |
| 5 | pk_jobsegmentation | pk_jobsegmentation | pk_jobsegmentation | char(20) | √ |
| 6 | scale | scale | scale | number(28, 8) |
| 7 | work | work | work | varchar2(20) |  |  | '~' |
| 8 | def1 | def1 | def1 | varchar2(101) |
| 9 | def2 | def2 | def2 | varchar2(101) |
| 10 | def3 | def3 | def3 | varchar2(101) |
| 11 | def4 | def4 | def4 | varchar2(101) |
| 12 | def5 | def5 | def5 | varchar2(101) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |