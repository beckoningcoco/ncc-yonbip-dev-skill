# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11809.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invoice_airdetail | pk_invoice_airdetail | pk_invoice_airdetail | char(20) | √ |
| 2 | carrier | carrier | carrier | varchar2(30) |
| 3 | destination | destination | destination | varchar2(50) |
| 4 | flightnumber | flightnumber | flightnumber | varchar2(20) |
| 5 | kprq | kprq | kprq | char(19) |
| 6 | origin | origin | origin | varchar2(50) |
| 7 | pk_invoice_air | pk_invoice_air | pk_invoice_air | char(20) | √ |
| 8 | rowno | rowno | rowno | number(38, 0) | √ |
| 9 | seat | seat | seat | varchar2(20) |
| 10 | def1 | def1 | def1 | varchar2(101) |
| 11 | def2 | def2 | def2 | varchar2(101) |
| 12 | def3 | def3 | def3 | varchar2(101) |
| 13 | def4 | def4 | def4 | varchar2(101) |
| 14 | def5 | def5 | def5 | varchar2(101) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |