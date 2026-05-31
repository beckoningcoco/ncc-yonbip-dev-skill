# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8385.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_agentacccfg_b | pk_agentacccfg_b | pk_agentacccfg_b | char(20) | √ |
| 2 | enablestate | enablestate | enablestate | number(38, 0) |
| 3 | linestatus | linestatus | linestatus | varchar2(50) |
| 4 | pk_agentacccfg | pk_agentacccfg | pk_agentacccfg | char(20) | √ |
| 5 | pk_bankaccbas | pk_bankaccbas | pk_bankaccbas | varchar2(20) | √ |  | '~' |
| 6 | pk_financeorg | pk_financeorg | pk_financeorg | char(20) | √ |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |