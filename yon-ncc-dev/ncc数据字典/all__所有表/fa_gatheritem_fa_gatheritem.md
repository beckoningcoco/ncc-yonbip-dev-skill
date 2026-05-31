# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8134.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_gatheritem | pk_gatheritem | pk_gatheritem | char(20) | √ |
| 2 | accyear | accyear | accyear | varchar2(20) |
| 3 | item_code | item_code | item_code | varchar2(20) |
| 4 | item_name | item_name | item_name | varchar2(200) |
| 5 | item_name2 | item_name2 | item_name2 | varchar2(200) |
| 6 | item_name3 | item_name3 | item_name3 | varchar2(200) |
| 7 | item_name4 | item_name4 | item_name4 | varchar2(200) |
| 8 | item_name5 | item_name5 | item_name5 | varchar2(200) |
| 9 | item_name6 | item_name6 | item_name6 | varchar2(200) |
| 10 | level1 | level1 | level1 | number(38, 0) |
| 11 | level2 | level2 | level2 | number(38, 0) |
| 12 | period | period | period | varchar2(50) |
| 13 | pk_accbook | pk_accbook | pk_accbook | varchar2(20) |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | pk_period | pk_period | pk_period | varchar2(20) |  |  | '~' |
| 16 | system_flag | system_flag | system_flag | number(38, 0) |
| 17 | def1 | def1 | def1 | varchar2(101) |
| 18 | def2 | def2 | def2 | varchar2(101) |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |