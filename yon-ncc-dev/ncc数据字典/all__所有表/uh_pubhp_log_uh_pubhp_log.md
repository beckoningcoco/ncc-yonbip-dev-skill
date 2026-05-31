# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12733.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pubhp_log | pk_pubhp_log | pk_pubhp_log | char(20) | √ |
| 2 | call_result | call_result | call_result | varchar2(50) |
| 3 | pk_hp | pk_hp | pk_hp | varchar2(50) |
| 4 | return_information | return_information | return_information | varchar2(50) |
| 5 | trade_exitparam | trade_exitparam | trade_exitparam | varchar2(500) |
| 6 | trade_intoparam | trade_intoparam | trade_intoparam | varchar2(500) |
| 7 | trade_time | trade_time | trade_time | char(19) |
| 8 | trade_type | trade_type | trade_type | varchar2(50) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |