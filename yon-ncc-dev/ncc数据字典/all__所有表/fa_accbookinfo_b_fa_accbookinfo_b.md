# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8091.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accbookinfo_b | pk_accbookinfo_b | pk_accbookinfo_b | char(20) | √ |
| 2 | asset_category_type | asset_category_type | asset_category_type | number(38, 0) |
| 3 | bcanredevaluate | bcanredevaluate | bcanredevaluate | char(1) |
| 4 | depmethodattr | depmethodattr | depmethodattr | number(38, 0) | √ |  | 2 |
| 5 | localoriginvalue | localoriginvalue | localoriginvalue | varchar2(200) |
| 6 | pk_accbookinfo | pk_accbookinfo | pk_accbookinfo | char(20) | √ |
| 7 | pk_category | pk_category | pk_category | varchar2(20) | √ |
| 8 | pk_depmethod | pk_depmethod | pk_depmethod | varchar2(20) |  |  | '~' |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | salvagerate | salvagerate | salvagerate | number(28, 8) |
| 12 | servicemonth | servicemonth | servicemonth | number(38, 0) |
| 13 | taxinput_flag | taxinput_flag | taxinput_flag | char(1) |  |  | 'Y' |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |