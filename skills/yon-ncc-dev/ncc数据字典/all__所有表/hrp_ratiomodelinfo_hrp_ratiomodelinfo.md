# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8780.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ratiomodelinfo | pk_ratiomodelinfo | pk_ratiomodelinfo | char(20) | √ |
| 2 | count_dimen | count_dimen | count_dimen | number(38, 0) |
| 3 | pk_dimensiondef | pk_dimensiondef | pk_dimensiondef | char(20) |
| 4 | pk_ratiomodel | pk_ratiomodel | pk_ratiomodel | char(20) |
| 5 | ratio | ratio | ratio | number(10, 4) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |