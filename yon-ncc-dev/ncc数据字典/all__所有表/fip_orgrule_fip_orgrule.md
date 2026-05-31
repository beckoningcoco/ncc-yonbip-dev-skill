# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8323.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_orgrule | pk_orgrule | pk_orgrule | char(20) | √ |
| 2 | des_billtype | des_billtype | des_billtype | varchar2(20) |  |  | '~' |
| 3 | factorformula | factorformula | factorformula | varchar2(2000) |
| 4 | orgformula | orgformula | orgformula | varchar2(2000) |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | sortindex | sortindex | sortindex | number(38, 0) |
| 8 | src_billtype | src_billtype | src_billtype | varchar2(20) |  |  | '~' |
| 9 | factor1 | factor1 | factor1 | varchar2(101) |
| 10 | factor2 | factor2 | factor2 | varchar2(101) |
| 11 | factor3 | factor3 | factor3 | varchar2(101) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |