# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9617.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_extend | pk_extend | pk_extend | char(20) | √ |
| 2 | extend_class | extend_class | extend_class | varchar2(200) |
| 3 | extend_name | extend_name | extend_name | varchar2(20) |
| 4 | extend_type | extend_type | extend_type | varchar2(10) |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |