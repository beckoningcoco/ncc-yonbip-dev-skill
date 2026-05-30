# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7107.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taxregion_b | pk_taxregion_b | pk_taxregion_b | char(20) | √ |
| 2 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) | √ |  | 0 |
| 3 | pk_region | pk_region | pk_region | varchar2(20) | √ |  | '~' |
| 4 | pk_taxregion | pk_taxregion | pk_taxregion | char(20) | √ |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |