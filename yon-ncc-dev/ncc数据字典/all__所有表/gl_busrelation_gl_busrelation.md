# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8442.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_busrelation | pk_busrelation | pk_busrelation | char(20) | √ |
| 2 | aspect | aspect | aspect | number(38, 0) |
| 3 | memo | memo | memo | char(20) |
| 4 | pk_accountingbook | pk_accountingbook | pk_accountingbook | char(20) |
| 5 | pk_busruledetail | pk_busruledetail | pk_busruledetail | char(20) |
| 6 | pk_cashflow | pk_cashflow | pk_cashflow | char(20) |
| 7 | pk_group | pk_group | pk_group | varchar2(50) |
| 8 | pk_org | pk_org | pk_org | varchar2(50) |
| 9 | scale | scale | scale | number(20, 4) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |