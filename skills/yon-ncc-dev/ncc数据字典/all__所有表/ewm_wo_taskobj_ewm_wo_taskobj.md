# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8053.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wo_taskobj | pk_wo_taskobj | pk_wo_taskobj | char(20) | √ |
| 2 | allocationstatus | allocationstatus | allocationstatus | number(38, 0) |  |  | 1 |
| 3 | memo | memo | memo | varchar2(200) |
| 4 | pk_equip | pk_equip | pk_equip | varchar2(20) |  |  | '~' |
| 5 | pk_location | pk_location | pk_location | varchar2(20) |  |  | '~' |
| 6 | pk_wo | pk_wo | pk_wo | char(20) | √ |
| 7 | sequence_num | sequence_num | sequence_num | number(38, 0) |
| 8 | def1 | def1 | def1 | varchar2(101) |
| 9 | def2 | def2 | def2 | varchar2(101) |
| 10 | def3 | def3 | def3 | varchar2(101) |
| 11 | def4 | def4 | def4 | varchar2(101) |
| 12 | def5 | def5 | def5 | varchar2(101) |
| 13 | def6 | def6 | def6 | varchar2(101) |
| 14 | def7 | def7 | def7 | varchar2(101) |
| 15 | def8 | def8 | def8 | varchar2(101) |
| 16 | def9 | def9 | def9 | varchar2(101) |
| 17 | def10 | def10 | def10 | varchar2(101) |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |