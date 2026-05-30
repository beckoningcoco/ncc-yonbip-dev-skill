# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6697.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_type_b | pk_type_b | pk_type_b | char(20) | √ |
| 2 | pk_type | pk_type | pk_type | char(20) | √ |
| 3 | transtype | transtype | transtype | varchar2(20) |  |  | '~' |
| 4 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 5 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |