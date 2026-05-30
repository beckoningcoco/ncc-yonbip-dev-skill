# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6694.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rule_b | pk_rule_b | pk_rule_b | char(20) | √ |
| 2 | bquery | bquery | bquery | char(1) |
| 3 | bresend | bresend | bresend | char(1) |
| 4 | bsend | bsend | bsend | char(1) |
| 5 | farrtype | farrtype | farrtype | number(38, 0) |
| 6 | ftrantype | ftrantype | ftrantype | varchar2(50) |
| 7 | fvoplace | fvoplace | fvoplace | varchar2(50) |
| 8 | pk_rule | pk_rule | pk_rule | char(20) | √ |
| 9 | vdest | vdest | vdest | varchar2(50) |
| 10 | vdestname | vdestname | vdestname | varchar2(100) |
| 11 | vparam | vparam | vparam | varchar2(50) |
| 12 | vsendfiled | vsendfiled | vsendfiled | varchar2(50) |
| 13 | vsendfiledname | vsendfiledname | vsendfiledname | varchar2(100) |
| 14 | vsysassign | vsysassign | vsysassign | varchar2(50) |
| 15 | vtrans | vtrans | vtrans | varchar2(50) |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |