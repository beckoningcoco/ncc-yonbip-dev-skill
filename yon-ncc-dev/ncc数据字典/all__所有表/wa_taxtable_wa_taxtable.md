# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12912.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_taxtable | pk_wa_taxtable | pk_wa_taxtable | char(20) | √ |
| 2 | itaxlevel | itaxlevel | itaxlevel | number(38, 0) | √ |
| 3 | ndebuctamount | ndebuctamount | ndebuctamount | number(31, 8) |
| 4 | ndebuctrate | ndebuctrate | ndebuctrate | number(9, 6) |
| 5 | nmaxamount | nmaxamount | nmaxamount | number(31, 8) |
| 6 | nminamount | nminamount | nminamount | number(31, 8) |
| 7 | nquickdebuct | nquickdebuct | nquickdebuct | number(31, 8) | √ |
| 8 | ntaxrate | ntaxrate | ntaxrate | number(9, 6) |
| 9 | pk_wa_taxbase | pk_wa_taxbase | pk_wa_taxbase | varchar2(20) | √ |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |