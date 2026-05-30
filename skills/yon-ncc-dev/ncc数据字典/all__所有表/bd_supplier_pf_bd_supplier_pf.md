# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7088.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_supplier_pf | pk_supplier_pf | pk_supplier_pf | char(20) | √ |
| 2 | apply_type | apply_type | apply_type | number(38, 0) | √ |  | 1 |
| 3 | bsupbaseinfo | bsupbaseinfo | bsupbaseinfo | blob |
| 4 | dapprovedate | dapprovedate | dapprovedate | char(19) |
| 5 | dmakedate | dmakedate | dmakedate | char(19) |
| 6 | meno | meno | meno | varchar2(1536) |
| 7 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | pk_org_sup | pk_org_sup | pk_org_sup | varchar2(20) |  |  | '~' |
| 11 | pk_supclass | pk_supclass | pk_supclass | varchar2(20) |  |  | '~' |
| 12 | pk_transtype | pk_transtype | pk_transtype | varchar2(20) |
| 13 | remark | remark | remark | varchar2(1024) |
| 14 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 15 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 16 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 17 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 18 | update_sup | update_sup | update_sup | varchar2(20) |
| 19 | vapproveid | vapproveid | vapproveid | varchar2(20) |  |  | '~' |
| 20 | vapprovenote | vapprovenote | vapprovenote | varchar2(1536) |
| 21 | vbillno | vbillno | vbillno | varchar2(50) |
| 22 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 23 | vgoalorg | vgoalorg | vgoalorg | number(38, 0) |
| 24 | voperatorid | voperatorid | voperatorid | varchar2(20) |  |  | '~' |
| 25 | vsupcode | vsupcode | vsupcode | varchar2(40) |
| 26 | vsupname | vsupname | vsupname | varchar2(300) |
| 27 | vsupname2 | vsupname2 | vsupname2 | varchar2(300) |
| 28 | vsupname3 | vsupname3 | vsupname3 | varchar2(300) |
| 29 | vsupname4 | vsupname4 | vsupname4 | varchar2(300) |
| 30 | vsupname5 | vsupname5 | vsupname5 | varchar2(300) |
| 31 | vsupname6 | vsupname6 | vsupname6 | varchar2(300) |
| 32 | def1 | def1 | def1 | varchar2(101) |
| 33 | def2 | def2 | def2 | varchar2(101) |
| 34 | def3 | def3 | def3 | varchar2(101) |
| 35 | def4 | def4 | def4 | varchar2(101) |
| 36 | def5 | def5 | def5 | varchar2(101) |
| 37 | def6 | def6 | def6 | varchar2(101) |
| 38 | def7 | def7 | def7 | varchar2(101) |
| 39 | def8 | def8 | def8 | varchar2(101) |
| 40 | def9 | def9 | def9 | varchar2(101) |
| 41 | def10 | def10 | def10 | varchar2(101) |
| 42 | creationtime | creationtime | creationtime | char(19) |
| 43 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 44 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 45 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 46 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 47 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |