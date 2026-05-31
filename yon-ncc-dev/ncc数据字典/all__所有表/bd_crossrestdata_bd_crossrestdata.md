# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6830.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_data | pk_data | pk_data | char(20) | √ |
| 2 | data | data | data | varchar2(50) |
| 3 | pk_restraint | pk_restraint | pk_restraint | varchar2(20) | √ |
| 4 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 5 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |