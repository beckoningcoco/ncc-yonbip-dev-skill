# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8589.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vouchermaxno | pk_vouchermaxno | pk_vouchermaxno | char(20) | √ |
| 2 | maxno | maxno | maxno | number(38, 0) |
| 3 | period | period | period | char(2) |
| 4 | pk_accountingbook | pk_accountingbook | pk_accountingbook | char(20) |
| 5 | pk_financeorg | pk_financeorg | pk_financeorg | varchar2(50) |
| 6 | pk_group | pk_group | pk_group | varchar2(50) |
| 7 | pk_vouchertype | pk_vouchertype | pk_vouchertype | char(20) |
| 8 | year | year | year | char(4) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |