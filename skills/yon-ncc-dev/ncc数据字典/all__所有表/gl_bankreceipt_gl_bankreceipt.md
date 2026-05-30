# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8436.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bankreceipt | pk_bankreceipt | pk_bankreceipt | char(20) | √ |
| 2 | balance | balance | balance | number(28, 8) |
| 3 | checkdate | checkdate | checkdate | char(19) |
| 4 | checkstyle | checkstyle | checkstyle | varchar2(50) |
| 5 | creditamount | creditamount | creditamount | number(28, 8) |
| 6 | debitamount | debitamount | debitamount | number(28, 8) |
| 7 | explanation | explanation | explanation | varchar2(272) |
| 8 | memo | memo | memo | varchar2(272) |
| 9 | netbanknumber | netbanknumber | netbanknumber | varchar2(30) |
| 10 | nusage | nusage | nusage | varchar2(200) |
| 11 | oppunitname | oppunitname | oppunitname | varchar2(300) |
| 12 | period | period | period | varchar2(20) |
| 13 | pk_ass | pk_ass | pk_ass | varchar2(20) |
| 14 | pk_bank | pk_bank | pk_bank | varchar2(50) |
| 15 | pk_check | pk_check | pk_check | varchar2(30) |
| 16 | pk_contrastaccount | pk_contrastaccount | pk_contrastaccount | varchar2(20) |  |  | '~' |
| 17 | pk_corp | pk_corp | pk_corp | varchar2(50) |
| 18 | pk_group | pk_group | pk_group | varchar2(50) |
| 19 | pk_jszx | pk_jszx | pk_jszx | varchar2(20) |
| 20 | pk_jszxaccount | pk_jszxaccount | pk_jszxaccount | varchar2(20) |
| 21 | pk_jszxdetail | pk_jszxdetail | pk_jszxdetail | varchar2(20) |
| 22 | pk_org | pk_org | pk_org | varchar2(50) |
| 23 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |
| 24 | pk_subject | pk_subject | pk_subject | varchar2(50) |
| 25 | pk_vouchertype | pk_vouchertype | pk_vouchertype | varchar2(20) |
| 26 | styleflag | styleflag | styleflag | varchar2(50) |
| 27 | transerial | transerial | transerial | varchar2(50) |
| 28 | years | years | years | varchar2(20) |
| 29 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 30 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |