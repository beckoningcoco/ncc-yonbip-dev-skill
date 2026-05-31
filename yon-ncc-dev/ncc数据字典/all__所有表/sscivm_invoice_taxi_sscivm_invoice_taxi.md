# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11816.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invoice_taxi | pk_invoice_taxi | pk_invoice_taxi | char(20) | √ |
| 2 | carnum | carnum | carnum | varchar2(20) |
| 3 | endtime | endtime | endtime | varchar2(50) |
| 4 | fpdm | fpdm | fpdm | varchar2(50) | √ |
| 5 | fphm | fphm | fphm | varchar2(50) | √ |
| 6 | jshj | jshj | jshj | number(28, 8) | √ |
| 7 | kprq | kprq | kprq | char(19) | √ |
| 8 | mileage | mileage | mileage | number(28, 8) |
| 9 | pk_invoice | pk_invoice | pk_invoice | varchar2(20) |  |  | '~' |
| 10 | place | place | place | varchar2(80) |
| 11 | starttime | starttime | starttime | varchar2(50) |
| 12 | def1 | def1 | def1 | varchar2(50) |
| 13 | def2 | def2 | def2 | varchar2(50) |
| 14 | def3 | def3 | def3 | varchar2(50) |
| 15 | def4 | def4 | def4 | varchar2(50) |
| 16 | def5 | def5 | def5 | varchar2(50) |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |