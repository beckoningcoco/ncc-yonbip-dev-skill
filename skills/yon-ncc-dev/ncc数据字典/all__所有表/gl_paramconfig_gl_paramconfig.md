# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8523.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_paramconfig | pk_paramconfig | pk_paramconfig | char(20) | √ |
| 2 | paramcode | paramcode | paramcode | varchar2(200) |
| 3 | paramname | paramname | paramname | varchar2(200) |
| 4 | paramvalue | paramvalue | paramvalue | varchar2(200) |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |