# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11899.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_comparison_result | pk_comparison_result | pk_comparison_result | char(20) | √ |
| 2 | billid | billid | billid | varchar2(50) |
| 3 | pk_flowpath | pk_flowpath | pk_flowpath | varchar2(20) |  |  | '~' |
| 4 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 5 | pk_sscunit | pk_sscunit | pk_sscunit | varchar2(20) |  |  | '~' |
| 6 | pk_task | pk_task | pk_task | varchar2(20) |  |  | '~' |
| 7 | pk_tradetype | pk_tradetype | pk_tradetype | varchar2(20) |  |  | '~' |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |