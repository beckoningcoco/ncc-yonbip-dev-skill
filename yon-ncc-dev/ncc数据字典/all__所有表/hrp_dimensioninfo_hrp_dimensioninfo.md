# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8772.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dimensioninfo | pk_dimensioninfo | pk_dimensioninfo | char(20) | √ |
| 2 | num | num | num | number(38, 0) |
| 3 | pk_dimension | pk_dimension | pk_dimension | char(20) |
| 4 | pk_dimensiondef | pk_dimensiondef | pk_dimensiondef | char(20) |
| 5 | pk_research | pk_research | pk_research | char(20) |
| 6 | ratio | ratio | ratio | number(7, 4) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |