# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8585.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_group | pk_group | pk_group | char(20) |
| 2 | pk_org | pk_org | pk_org | char(20) |
| 3 | pk_verrate | pk_verrate | pk_verrate | char(20) | √ |
| 4 | propertyid | propertyid | propertyid | number(38, 0) |
| 5 | rate | rate | rate | number(11, 8) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |