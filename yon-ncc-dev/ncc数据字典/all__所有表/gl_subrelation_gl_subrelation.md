# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8564.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_subrelation | pk_subrelation | pk_subrelation | char(20) | √ |
| 2 | aspect | aspect | aspect | number(28, 8) |
| 3 | cfreevalueid | cfreevalueid | cfreevalueid | char(20) |
| 4 | dfreevalueid | dfreevalueid | dfreevalueid | char(20) |
| 5 | iscd | iscd | iscd | char(1) |
| 6 | isdd | isdd | isdd | char(1) |
| 7 | memo | memo | memo | varchar2(50) |
| 8 | pk_accountingbook | pk_accountingbook | pk_accountingbook | varchar2(50) |
| 9 | pk_cashflow | pk_cashflow | pk_cashflow | char(20) | √ |
| 10 | pk_creditsubject | pk_creditsubject | pk_creditsubject | char(20) |
| 11 | pk_debitsubject | pk_debitsubject | pk_debitsubject | char(20) |
| 12 | pk_group | pk_group | pk_group | varchar2(50) |
| 13 | pk_org | pk_org | pk_org | varchar2(50) |
| 14 | pk_setofbook | pk_setofbook | pk_setofbook | varchar2(20) |  |  | '~' |
| 15 | pk_sob | pk_sob | pk_sob | varchar2(50) |
| 16 | pk_unit | pk_unit | pk_unit | char(20) |
| 17 | scale | scale | scale | number(28, 8) |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |