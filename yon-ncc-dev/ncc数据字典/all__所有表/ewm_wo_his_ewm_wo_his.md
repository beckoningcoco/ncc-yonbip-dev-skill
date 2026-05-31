# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8042.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wo_his | pk_wo_his | pk_wo_his | char(20) | √ |
| 2 | memo | memo | memo | varchar2(200) |
| 3 | pk_changer | pk_changer | pk_changer | varchar2(20) |  |  | '~' |
| 4 | pk_wo | pk_wo | pk_wo | char(20) | √ |
| 5 | pk_wostatus | pk_wostatus | pk_wostatus | varchar2(20) |  |  | '~' |
| 6 | rowno | rowno | rowno | varchar2(30) |
| 7 | systime | systime | systime | char(19) |
| 8 | def1 | def1 | def1 | varchar2(101) |
| 9 | def2 | def2 | def2 | varchar2(101) |
| 10 | def3 | def3 | def3 | varchar2(101) |
| 11 | def4 | def4 | def4 | varchar2(101) |
| 12 | def5 | def5 | def5 | varchar2(101) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |