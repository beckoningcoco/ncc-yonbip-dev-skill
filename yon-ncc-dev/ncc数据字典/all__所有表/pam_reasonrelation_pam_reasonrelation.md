# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10427.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reasonrelation | pk_reasonrelation | pk_reasonrelation | char(20) | √ |
| 2 | pk_failure_reason | pk_failure_reason | pk_failure_reason | varchar2(50) |
| 3 | pk_source | pk_source | pk_source | varchar2(50) | √ |
| 4 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 5 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |