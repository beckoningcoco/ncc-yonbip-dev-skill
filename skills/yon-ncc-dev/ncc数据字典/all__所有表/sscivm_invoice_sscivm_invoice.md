# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11806.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invoice | pk_invoice | pk_invoice | char(20) | √ |
| 2 | accountstatus | accountstatus | accountstatus | number(38, 0) |
| 3 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 4 | approve_time | approve_time | approve_time | char(19) |
| 5 | billdate | billdate | billdate | char(19) |
| 6 | billno | billno | billno | varchar2(50) |
| 7 | billstatus | billstatus | billstatus | number(38, 0) |
| 8 | billtypecode | billtypecode | billtypecode | varchar2(50) |
| 9 | bz | bz | bz | varchar2(512) |
| 10 | cjfs | cjfs | cjfs | number(38, 0) |
| 11 | classification | classification | classification | varchar2(50) |
| 12 | classtype | classtype | classtype | number(38, 0) |
| 13 | creattime | creattime | creattime | char(19) |
| 14 | djdl | djdl | djdl | varchar2(20) |  |  | '~' |
| 15 | djdlbm | djdlbm | djdlbm | varchar2(50) |
| 16 | fhr | fhr | fhr | varchar2(50) |
| 17 | filename | filename | filename | varchar2(300) |
| 18 | fpdm | fpdm | fpdm | varchar2(50) |
| 19 | fphm | fphm | fphm | varchar2(50) |
| 20 | fpmw | fpmw | fpmw | varchar2(255) |
| 21 | fpzt | fpzt | fpzt | number(38, 0) |
| 22 | gmfdzdh | gmfdzdh | gmfdzdh | varchar2(255) |
| 23 | gmfmc | gmfmc | gmfmc | varchar2(255) |
| 24 | gmfnsrsbh | gmfnsrsbh | gmfnsrsbh | varchar2(50) |
| 25 | gmfyhzh | gmfyhzh | gmfyhzh | varchar2(255) |
| 26 | hjje | hjje | hjje | number(28, 8) |
| 27 | hjse | hjse | hjse | number(28, 8) |
| 28 | invoice_type | invoice_type | invoice_type | number(38, 0) |
| 29 | isimport | isimport | isimport | char(1) |  |  | 'N' |
| 30 | jjm | jjm | jjm | varchar2(50) |
| 31 | jshj | jshj | jshj | number(28, 8) |
| 32 | jym | jym | jym | varchar2(50) |
| 33 | khcje | khcje | khcje | number(28, 8) |  |  | 0 |
| 34 | kpr | kpr | kpr | varchar2(50) |
| 35 | kprq | kprq | kprq | char(19) |
| 36 | lyxt | lyxt | lyxt | varchar2(50) |
| 37 | matchbill | matchbill | matchbill | char(1) |
| 38 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 39 | pk_customer | pk_customer | pk_customer | varchar2(20) |  |  | '~' |
| 40 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 41 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 42 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 43 | pk_voucher | pk_voucher | pk_voucher | varchar2(50) |
| 44 | red_flag | red_flag | red_flag | number(38, 0) |
| 45 | rzzt | rzzt | rzzt | number(38, 0) |
| 46 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 47 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 48 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 49 | saga_status | saga_status | saga_status | number(38, 0) |
| 50 | skr | skr | skr | varchar2(50) |
| 51 | spr | spr | spr | varchar2(20) |  |  | '~' |
| 52 | sprq | sprq | sprq | char(19) |
| 53 | viewurl | viewurl | viewurl | varchar2(512) |
| 54 | voucherno | voucherno | voucherno | varchar2(50) |
| 55 | xsfdzdh | xsfdzdh | xsfdzdh | varchar2(512) |
| 56 | xsfmc | xsfmc | xsfmc | varchar2(255) |
| 57 | xsfnsrsbh | xsfnsrsbh | xsfnsrsbh | varchar2(50) |
| 58 | xsfyhzh | xsfyhzh | xsfyhzh | varchar2(255) |
| 59 | xtbs | xtbs | xtbs | char(1) |  |  | 'N' |
| 60 | yhcje | yhcje | yhcje | number(28, 8) |  |  | 0 |
| 61 | yhzfpdm | yhzfpdm | yhzfpdm | varchar2(50) |
| 62 | yhzfphm | yhzfphm | yhzfphm | varchar2(50) |
| 63 | ylzfpdm | ylzfpdm | ylzfpdm | varchar2(50) |
| 64 | ylzfphm | ylzfphm | ylzfphm | varchar2(50) |
| 65 | zthcje | zthcje | zthcje | number(28, 8) |  |  | 0 |
| 66 | def1 | def1 | def1 | varchar2(101) |
| 67 | def2 | def2 | def2 | varchar2(101) |
| 68 | def3 | def3 | def3 | varchar2(101) |
| 69 | def4 | def4 | def4 | varchar2(101) |
| 70 | def5 | def5 | def5 | varchar2(101) |
| 71 | def6 | def6 | def6 | varchar2(101) |
| 72 | def7 | def7 | def7 | varchar2(101) |
| 73 | def8 | def8 | def8 | varchar2(101) |
| 74 | def9 | def9 | def9 | varchar2(101) |
| 75 | def10 | def10 | def10 | varchar2(101) |
| 76 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 77 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 78 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 79 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 80 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |