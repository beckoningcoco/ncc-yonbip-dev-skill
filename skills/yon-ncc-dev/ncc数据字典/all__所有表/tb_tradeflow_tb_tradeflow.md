# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12124.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | ctrlscheme_ts | ctrlscheme_ts | ctrlscheme_ts | varchar2(19) |
| 3 | memo | memo | memo | varchar2(1024) |
| 4 | pk_bill_type | pk_bill_type | pk_bill_type | varchar2(1024) |
| 5 | pk_ctrlscheme | pk_ctrlscheme | pk_ctrlscheme | varchar2(24) |
| 6 | pk_dimvector | pk_dimvector | pk_dimvector | varchar2(2000) |
| 7 | pk_entity | pk_entity | pk_entity | char(20) |
| 8 | pk_parent | pk_parent | pk_parent | char(20) |
| 9 | pk_src | pk_src | pk_src | char(20) |
| 10 | pk_system_type | pk_system_type | pk_system_type | varchar2(20) |
| 11 | plan_data | plan_data | plan_data | number(30, 8) |
| 12 | ready_data | ready_data | ready_data | number(30, 8) |
| 13 | run_data | run_data | run_data | number(30, 8) |
| 14 | source_type | source_type | source_type | char(1) |
| 15 | trade_data | trade_data | trade_data | number(30, 8) |
| 16 | trade_date | trade_date | trade_date | varchar2(10) |
| 17 | trade_time | trade_time | trade_time | varchar2(19) |
| 18 | voperator | voperator | voperator | varchar2(50) |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |