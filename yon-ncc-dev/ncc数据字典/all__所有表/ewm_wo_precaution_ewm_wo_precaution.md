# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8050.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wo_precaution | pk_wo_precaution | pk_wo_precaution | char(20) | √ |
| 2 | isolate_flag | isolate_flag | isolate_flag | char(1) |
| 3 | memo | memo | memo | varchar2(200) |
| 4 | pk_isolate_temp | pk_isolate_temp | pk_isolate_temp | varchar2(20) |  |  | '~' |
| 5 | pk_isolation | pk_isolation | pk_isolation | varchar2(20) |  |  | '~' |
| 6 | pk_precaution | pk_precaution | pk_precaution | varchar2(20) |  |  | '~' |
| 7 | pk_wo | pk_wo | pk_wo | char(20) | √ |
| 8 | precaution_content | precaution_content | precaution_content | varchar2(1024) |
| 9 | risk_zone | risk_zone | risk_zone | varchar2(50) |
| 10 | def1 | def1 | def1 | varchar2(101) |
| 11 | def2 | def2 | def2 | varchar2(101) |
| 12 | def3 | def3 | def3 | varchar2(101) |
| 13 | def4 | def4 | def4 | varchar2(101) |
| 14 | def5 | def5 | def5 | varchar2(101) |
| 15 | def6 | def6 | def6 | varchar2(101) |
| 16 | def7 | def7 | def7 | varchar2(101) |
| 17 | def8 | def8 | def8 | varchar2(101) |
| 18 | def9 | def9 | def9 | varchar2(101) |
| 19 | def10 | def10 | def10 | varchar2(101) |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |