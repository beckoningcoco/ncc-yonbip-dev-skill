# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11883.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_detail | pk_detail | pk_detail | char(20) | √ |
| 2 | pk_dimension | pk_dimension | pk_dimension | varchar2(20) |  |  | '~' |
| 3 | pk_evaluated | pk_evaluated | pk_evaluated | char(20) |
| 4 | pk_reason | pk_reason | pk_reason | varchar2(20) |  |  | '~' |
| 5 | pk_rule | pk_rule | pk_rule | varchar2(20) |  |  | '~' |
| 6 | result | result | result | char(1) |  |  | '~' |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |