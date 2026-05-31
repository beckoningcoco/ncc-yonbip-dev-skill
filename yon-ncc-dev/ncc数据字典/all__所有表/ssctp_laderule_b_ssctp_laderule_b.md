# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11911.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_laderule_b | pk_laderule_b | pk_laderule_b | char(20) | √ |
| 2 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 3 | pk_laderule | pk_laderule | pk_laderule | char(20) | √ |
| 4 | pk_sscunit | pk_sscunit | pk_sscunit | varchar2(50) |  |  | '~' |
| 5 | refpk | refpk | refpk | varchar2(20) |  |  | '~' |
| 6 | seqno | seqno | seqno | number(38, 0) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |