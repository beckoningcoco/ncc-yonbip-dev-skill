# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10759.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invoice_settle | pk_invoice_settle | pk_invoice_settle | char(20) | √ |
| 2 | bpreflag | bpreflag | bpreflag | char(1) |
| 3 | cincomeperiod | cincomeperiod | cincomeperiod | varchar2(20) |  |  | '~' |
| 4 | csettlerowno | csettlerowno | csettlerowno | varchar2(20) |
| 5 | csettletype | csettletype | csettletype | varchar2(20) |  |  | '~' |
| 6 | dpaydate | dpaydate | dpaydate | char(19) |
| 7 | feffectdatebill | feffectdatebill | feffectdatebill | number(38, 0) |
| 8 | feffectmonth | feffectmonth | feffectmonth | number(38, 0) |
| 9 | icheckdata | icheckdata | icheckdata | number(38, 0) |
| 10 | ieffectaddday | ieffectaddday | ieffectaddday | number(38, 0) |
| 11 | ieffectaddmonth | ieffectaddmonth | ieffectaddmonth | number(38, 0) |
| 12 | ipaymentday | ipaymentday | ipaymentday | number(38, 0) |
| 13 | npaymny | npaymny | npaymny | number(28, 8) |
| 14 | npayrate | npayrate | npayrate | number(28, 8) |
| 15 | pk_apfinanceorg | pk_apfinanceorg | pk_apfinanceorg | varchar2(20) |  |  | '~' |
| 16 | pk_apfinanceorg_v | pk_apfinanceorg_v | pk_apfinanceorg_v | varchar2(20) |  |  | '~' |
| 17 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 18 | pk_invoice | pk_invoice | pk_invoice | char(20) | √ |
| 19 | vmemo | vmemo | vmemo | varchar2(181) |
| 20 | vpaydate | vpaydate | vpaydate | varchar2(20) |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |