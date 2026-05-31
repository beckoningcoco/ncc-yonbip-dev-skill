# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8043.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wo_log | pk_wo_log | pk_wo_log | char(20) | √ |
| 2 | content | content | content | varchar2(200) |
| 3 | memo | memo | memo | varchar2(200) |
| 4 | pk_recorder | pk_recorder | pk_recorder | varchar2(20) |  |  | '~' |
| 5 | pk_wo | pk_wo | pk_wo | char(20) | √ |
| 6 | rec_time | rec_time | rec_time | char(19) |
| 7 | rowno | rowno | rowno | varchar2(30) |
| 8 | def1 | def1 | def1 | varchar2(101) |
| 9 | def2 | def2 | def2 | varchar2(101) |
| 10 | def3 | def3 | def3 | varchar2(101) |
| 11 | def4 | def4 | def4 | varchar2(101) |
| 12 | def5 | def5 | def5 | varchar2(101) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |