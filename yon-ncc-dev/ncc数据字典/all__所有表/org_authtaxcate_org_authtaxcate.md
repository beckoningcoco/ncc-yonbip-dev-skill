# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10163.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_authtaxcate | pk_authtaxcate | pk_authtaxcate | char(20) | √ |
| 2 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 3 | pk_financeorg | pk_financeorg | pk_financeorg | char(20) | √ |
| 4 | pk_taxcategory | pk_taxcategory | pk_taxcategory | varchar2(20) |  |  | '~' |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |