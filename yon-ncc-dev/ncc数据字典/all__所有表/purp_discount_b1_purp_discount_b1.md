# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11057.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_discount_b1 | pk_discount_b1 | pk_discount_b1 | char(20) | √ |
| 2 | bincludelower | bincludelower | bincludelower | char(1) |
| 3 | bincludeupper | bincludeupper | bincludeupper | char(1) |
| 4 | nlower | nlower | nlower | number(28, 8) |
| 5 | nmoneypercent | nmoneypercent | nmoneypercent | number(28, 8) |
| 6 | npricenum | npricenum | npricenum | number(28, 8) |
| 7 | npricepercent | npricepercent | npricepercent | number(28, 8) |
| 8 | nupper | nupper | nupper | number(28, 8) |
| 9 | pk_discount_h | pk_discount_h | pk_discount_h | char(20) | √ |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |