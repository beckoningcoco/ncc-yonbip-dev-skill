# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6477.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_evaluate_c | pk_evaluate_c | pk_evaluate_c | char(20) | √ |
| 2 | end_date | end_date | end_date | char(19) |
| 3 | memo | memo | memo | varchar2(50) |
| 4 | pk_contract_b | pk_contract_b | pk_contract_b | varchar2(20) |
| 5 | pk_evaluate | pk_evaluate | pk_evaluate | char(20) | √ |
| 6 | pre_rent_tax | pre_rent_tax | pre_rent_tax | number(28, 8) |
| 7 | pre_rent_tax_org | pre_rent_tax_org | pre_rent_tax_org | number(28, 8) |
| 8 | pre_rent_type | pre_rent_type | pre_rent_type | number(38, 0) |
| 9 | start_date | start_date | start_date | char(19) |
| 10 | def1 | def1 | def1 | varchar2(101) |
| 11 | def2 | def2 | def2 | varchar2(101) |
| 12 | def3 | def3 | def3 | varchar2(101) |
| 13 | def4 | def4 | def4 | varchar2(101) |
| 14 | def5 | def5 | def5 | varchar2(101) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |