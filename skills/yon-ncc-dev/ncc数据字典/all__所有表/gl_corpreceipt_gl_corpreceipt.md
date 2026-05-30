# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8477.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_corpreceipt | pk_corpreceipt | pk_corpreceipt | char(20) | √ |
| 2 | balance | balance | balance | number(28, 8) |
| 3 | checkdate | checkdate | checkdate | char(19) |
| 4 | checkno | checkno | checkno | varchar2(30) |
| 5 | checkstyle | checkstyle | checkstyle | varchar2(50) |
| 6 | creditamount | creditamount | creditamount | number(28, 8) |
| 7 | debitamount | debitamount | debitamount | number(28, 8) |
| 8 | explanation | explanation | explanation | varchar2(181) |
| 9 | memo | memo | memo | varchar2(272) |
| 10 | netbanknumber | netbanknumber | netbanknumber | varchar2(30) |
| 11 | pk_accountlink | pk_accountlink | pk_accountlink | varchar2(20) |
| 12 | pk_ass | pk_ass | pk_ass | varchar2(20) |
| 13 | pk_bank | pk_bank | pk_bank | varchar2(20) |
| 14 | pk_contrastaccount | pk_contrastaccount | pk_contrastaccount | varchar2(20) |  |  | '~' |
| 15 | pk_corp | pk_corp | pk_corp | varchar2(20) |
| 16 | pk_group | pk_group | pk_group | varchar2(50) |
| 17 | pk_org | pk_org | pk_org | varchar2(50) |
| 18 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |
| 19 | pk_subject | pk_subject | pk_subject | varchar2(150) |
| 20 | pk_vouchertype | pk_vouchertype | pk_vouchertype | varchar2(50) |
| 21 | prepareddate | prepareddate | prepareddate | char(19) |
| 22 | tradername | tradername | tradername | varchar2(50) |
| 23 | transerial | transerial | transerial | varchar2(50) |
| 24 | vouchno | vouchno | vouchno | varchar2(30) |
| 25 | years | years | years | varchar2(20) |
| 26 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |