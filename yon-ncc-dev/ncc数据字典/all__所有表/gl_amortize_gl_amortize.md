# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8429.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_amortize | pk_amortize | pk_amortize | char(20) | √ |
| 2 | amortizename | amortizename | amortizename | varchar2(50) |
| 3 | amortizeno | amortizeno | amortizeno | varchar2(50) |
| 4 | amortizerate | amortizerate | amortizerate | varchar2(20) |  |  | '~' |
| 5 | billnum | billnum | billnum | number(38, 0) |
| 6 | cycle | cycle | cycle | number(38, 0) |
| 7 | desciption | desciption | desciption | varchar2(1000) |
| 8 | exctimes | exctimes | exctimes | number(38, 0) |
| 9 | frequency | frequency | frequency | number(38, 0) |
| 10 | lastexctime | lastexctime | lastexctime | varchar2(20) |  |  | '~' |
| 11 | pk_accountingbook | pk_accountingbook | pk_accountingbook | varchar2(20) |  |  | '~' |
| 12 | pk_amorcycle | pk_amorcycle | pk_amorcycle | varchar2(50) |  |  | '~' |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_operator | pk_operator | pk_operator | varchar2(20) |  |  | '~' |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | pk_vouchertype | pk_vouchertype | pk_vouchertype | varchar2(20) |  |  | '~' |
| 17 | speriod | speriod | speriod | varchar2(20) |  |  | '~' |
| 18 | state | state | state | varchar2(50) |
| 19 | time | time | time | varchar2(50) |
| 20 | creationtime | creationtime | creationtime | char(19) |
| 21 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 24 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |