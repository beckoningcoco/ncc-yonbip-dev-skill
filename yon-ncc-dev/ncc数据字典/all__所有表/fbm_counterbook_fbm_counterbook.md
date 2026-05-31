# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8190.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_register | pk_register | pk_register | char(20) | √ |
| 2 | acceptanceno | acceptanceno | acceptanceno | varchar2(50) |
| 3 | acceptoraccount | acceptoraccount | acceptoraccount | varchar2(50) |
| 4 | contractno | contractno | contractno | varchar2(50) |
| 5 | disableflag | disableflag | disableflag | char(1) |
| 6 | enddate | enddate | enddate | char(19) |
| 7 | fbmbillno | fbmbillno | fbmbillno | varchar2(50) |
| 8 | fbmbilltype | fbmbilltype | fbmbilltype | varchar2(20) |  |  | '~' |
| 9 | gatherdate | gatherdate | gatherdate | char(19) |
| 10 | hidepaybank | hidepaybank | hidepaybank | varchar2(20) |  |  | '~' |
| 11 | hidepaybankacc | hidepaybankacc | hidepaybankacc | varchar2(20) |  |  | '~' |
| 12 | hidepayunit | hidepayunit | hidepayunit | varchar2(20) |  |  | '~' |
| 13 | hidereceivebank | hidereceivebank | hidereceivebank | varchar2(20) |  |  | '~' |
| 14 | hidereceivebankacc | hidereceivebankacc | hidereceivebankacc | varchar2(20) |  |  | '~' |
| 15 | hidereceiveunit | hidereceiveunit | hidereceiveunit | varchar2(20) |  |  | '~' |
| 16 | initflag | initflag | initflag | char(1) |
| 17 | invoicedate | invoicedate | invoicedate | char(19) |
| 18 | invoiceunit | invoiceunit | invoiceunit | varchar2(20) |  |  | '~' |
| 19 | invoiceunitname | invoiceunitname | invoiceunitname | varchar2(181) |
| 20 | keepunit | keepunit | keepunit | varchar2(20) |  |  | '~' |
| 21 | keepunitname | keepunitname | keepunitname | varchar2(50) |
| 22 | money | money | money | number(28, 8) |
| 23 | paybank | paybank | paybank | varchar2(50) |
| 24 | paybankacc | paybankacc | paybankacc | varchar2(50) |
| 25 | payunit | payunit | payunit | varchar2(50) |
| 26 | pk_curr | pk_curr | pk_curr | varchar2(20) |  |  | '~' |
| 27 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 28 | pk_invoiceunit | pk_invoiceunit | pk_invoiceunit | varchar2(20) |  |  | '~' |
| 29 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 30 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 31 | pk_signagrbank | pk_signagrbank | pk_signagrbank | varchar2(20) |  |  | '~' |
| 32 | receivebank | receivebank | receivebank | varchar2(50) |
| 33 | receivebankacc | receivebankacc | receivebankacc | varchar2(50) |
| 34 | receiveunit | receiveunit | receiveunit | varchar2(50) |
| 35 | registerstatus | registerstatus | registerstatus | varchar2(50) |
| 36 | signagrbankname | signagrbankname | signagrbankname | varchar2(300) |
| 37 | signagrbanknum | signagrbanknum | signagrbanknum | varchar2(50) |
| 38 | def1 | def1 | def1 | varchar2(101) |
| 39 | def2 | def2 | def2 | varchar2(101) |
| 40 | def3 | def3 | def3 | varchar2(101) |
| 41 | def4 | def4 | def4 | varchar2(101) |
| 42 | def5 | def5 | def5 | varchar2(101) |
| 43 | def6 | def6 | def6 | varchar2(101) |
| 44 | def7 | def7 | def7 | varchar2(101) |
| 45 | def8 | def8 | def8 | varchar2(101) |
| 46 | def9 | def9 | def9 | varchar2(101) |
| 47 | def10 | def10 | def10 | varchar2(101) |
| 48 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 49 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |