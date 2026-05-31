# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12887.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_payslip_item | pk_payslip_item | pk_payslip_item | char(20) | √ |
| 2 | data_type | data_type | data_type | number(38, 0) |
| 3 | iflddecimal | iflddecimal | iflddecimal | number(38, 0) |
| 4 | iscountpro | iscountpro | iscountpro | char(1) |
| 5 | isemppro | isemppro | isemppro | char(1) |
| 6 | ismngpro | ismngpro | ismngpro | char(1) |
| 7 | item_displayname | item_displayname | item_displayname | varchar2(200) |
| 8 | item_table | item_table | item_table | varchar2(50) |
| 9 | pk_payslip | pk_payslip | pk_payslip | varchar2(20) |
| 10 | pre_flag | pre_flag | pre_flag | char(1) |
| 11 | showorder | showorder | showorder | number(38, 0) |
| 12 | slip_item | slip_item | slip_item | varchar2(50) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |