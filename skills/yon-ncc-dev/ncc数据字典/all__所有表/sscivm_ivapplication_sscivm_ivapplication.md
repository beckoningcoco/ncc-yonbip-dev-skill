# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11821.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ivapplication | pk_ivapplication | pk_ivapplication | char(20) | √ |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 4 | bchcje | bchcje | bchcje | number(28, 8) |
| 5 | billno | billno | billno | varchar2(50) | √ |
| 6 | billstatus | billstatus | billstatus | number(38, 0) | √ |
| 7 | billtypecode | billtypecode | billtypecode | varchar2(50) |
| 8 | bmb_bbh | bmb_bbh | bmb_bbh | varchar2(50) |
| 9 | bz | bz | bz | varchar2(50) |
| 10 | caninvoice_hjje | caninvoice_hjje | caninvoice_hjje | number(28, 8) |
| 11 | caninvoice_hjse | caninvoice_hjse | caninvoice_hjse | number(28, 8) |
| 12 | caninvoice_jshj | caninvoice_jshj | caninvoice_jshj | number(28, 8) |
| 13 | ckfp | ckfp | ckfp | char(1) |
| 14 | email | email | email | varchar2(400) |
| 15 | fhr | fhr | fhr | varchar2(50) |
| 16 | fpdm | fpdm | fpdm | varchar2(50) |
| 17 | fphm | fphm | fphm | varchar2(50) |
| 18 | fplx | fplx | fplx | number(38, 0) | √ |
| 19 | gmf_dzdh | gmf_dzdh | gmf_dzdh | varchar2(255) |
| 20 | gmf_khh | gmf_khh | gmf_khh | varchar2(20) |  |  | '~' |
| 21 | gmf_mc | gmf_mc | gmf_mc | varchar2(100) | √ |
| 22 | gmf_nsrsbh | gmf_nsrsbh | gmf_nsrsbh | varchar2(50) |
| 23 | gmf_yhzh | gmf_yhzh | gmf_yhzh | varchar2(155) |
| 24 | gmf_zh | gmf_zh | gmf_zh | varchar2(20) |  |  | '~' |
| 25 | hjje | hjje | hjje | number(28, 8) | √ |
| 26 | hjse | hjse | hjse | number(28, 8) | √ |
| 27 | hzfp | hzfp | hzfp | char(1) |
| 28 | hzxxsqb | hzxxsqb | hzxxsqb | varchar2(50) |
| 29 | invoiced_hjje | invoiced_hjje | invoiced_hjje | number(28, 8) |
| 30 | invoiced_hjse | invoiced_hjse | invoiced_hjse | number(28, 8) |
| 31 | invoiced_jshj | invoiced_jshj | invoiced_jshj | number(28, 8) |
| 32 | invoiceing_hjje | invoiceing_hjje | invoiceing_hjje | number(28, 8) |
| 33 | invoiceing_hjse | invoiceing_hjse | invoiceing_hjse | number(28, 8) |
| 34 | invoiceing_jshj | invoiceing_jshj | invoiceing_jshj | number(28, 8) |
| 35 | jshj | jshj | jshj | number(28, 8) | √ |
| 36 | kpfs | kpfs | kpfs | number(38, 0) |
| 37 | kpr | kpr | kpr | varchar2(50) |  |  | '~' |
| 38 | kpzt | kpzt | kpzt | char(1) |
| 39 | orgcode | orgcode | orgcode | varchar2(50) |
| 40 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) | √ |
| 41 | pk_customer | pk_customer | pk_customer | varchar2(20) | √ |  | '~' |
| 42 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 43 | pk_freecustom | pk_freecustom | pk_freecustom | varchar2(20) |  |  | '~' |
| 44 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 45 | pk_org | pk_org | pk_org | varchar2(20) | √ |  | '~' |
| 46 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) | √ |  | '~' |
| 47 | pk_tradetype | pk_tradetype | pk_tradetype | varchar2(20) | √ |
| 48 | preparedate | preparedate | preparedate | char(19) | √ |
| 49 | redrush_falg | redrush_falg | redrush_falg | varchar2(50) |
| 50 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 51 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 52 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 53 | saga_status | saga_status | saga_status | number(38, 0) |
| 54 | sgbz | sgbz | sgbz | varchar2(50) |
| 55 | skr | skr | skr | varchar2(50) |
| 56 | sqr | sqr | sqr | varchar2(20) | √ |
| 57 | src_billdate | src_billdate | src_billdate | char(19) |
| 58 | src_billno | src_billno | src_billno | varchar2(50) |
| 59 | src_billtype | src_billtype | src_billtype | varchar2(20) |  |  | '~' |
| 60 | src_jx_billid | src_jx_billid | src_jx_billid | varchar2(20) |
| 61 | src_jx_billno | src_jx_billno | src_jx_billno | varchar2(50) |
| 62 | src_jx_billtypeid | src_jx_billtypeid | src_jx_billtypeid | varchar2(20) |  |  | '~' |
| 63 | src_jx_sporg | src_jx_sporg | src_jx_sporg | varchar2(20) |  |  | '~' |
| 64 | src_jx_spr | src_jx_spr | src_jx_spr | varchar2(20) |  |  | '~' |
| 65 | src_jx_tradetypeid | src_jx_tradetypeid | src_jx_tradetypeid | varchar2(20) |  |  | '~' |
| 66 | src_pkbusibill | src_pkbusibill | src_pkbusibill | varchar2(50) |
| 67 | src_tradetype | src_tradetype | src_tradetype | varchar2(20) |  |  | '~' |
| 68 | transtypecode | transtypecode | transtypecode | varchar2(50) |
| 69 | wxappid | wxappid | wxappid | varchar2(50) |
| 70 | wxauthid | wxauthid | wxauthid | varchar2(50) |
| 71 | wxorderid | wxorderid | wxorderid | varchar2(50) |
| 72 | xsf_dzdh | xsf_dzdh | xsf_dzdh | varchar2(255) |
| 73 | xsf_khh | xsf_khh | xsf_khh | varchar2(20) |  |  | '~' |
| 74 | xsf_mc | xsf_mc | xsf_mc | varchar2(100) |
| 75 | xsf_nsrsbh | xsf_nsrsbh | xsf_nsrsbh | varchar2(50) |
| 76 | xsf_yhzh | xsf_yhzh | xsf_yhzh | varchar2(155) |
| 77 | xsf_zh | xsf_zh | xsf_zh | varchar2(20) |  |  | '~' |
| 78 | zdybz | zdybz | zdybz | varchar2(255) |
| 79 | zffp | zffp | zffp | char(1) |
| 80 | def1 | def1 | def1 | varchar2(101) |
| 81 | def2 | def2 | def2 | varchar2(101) |
| 82 | def3 | def3 | def3 | varchar2(101) |
| 83 | def4 | def4 | def4 | varchar2(101) |
| 84 | def5 | def5 | def5 | varchar2(101) |
| 85 | def6 | def6 | def6 | varchar2(101) |
| 86 | def7 | def7 | def7 | varchar2(101) |
| 87 | def8 | def8 | def8 | varchar2(101) |
| 88 | def9 | def9 | def9 | varchar2(101) |
| 89 | def10 | def10 | def10 | varchar2(101) |
| 90 | def11 | def11 | def11 | varchar2(101) |
| 91 | def12 | def12 | def12 | varchar2(101) |
| 92 | def13 | def13 | def13 | varchar2(101) |
| 93 | def14 | def14 | def14 | varchar2(101) |
| 94 | def15 | def15 | def15 | varchar2(101) |
| 95 | def16 | def16 | def16 | varchar2(101) |
| 96 | def17 | def17 | def17 | varchar2(101) |
| 97 | def18 | def18 | def18 | varchar2(101) |
| 98 | def19 | def19 | def19 | varchar2(101) |
| 99 | def20 | def20 | def20 | varchar2(101) |
| 100 | def21 | def21 | def21 | varchar2(101) |
| 101 | def22 | def22 | def22 | varchar2(101) |
| 102 | def23 | def23 | def23 | varchar2(101) |
| 103 | def24 | def24 | def24 | varchar2(101) |
| 104 | def25 | def25 | def25 | varchar2(101) |
| 105 | def26 | def26 | def26 | varchar2(101) |
| 106 | def27 | def27 | def27 | varchar2(101) |
| 107 | def28 | def28 | def28 | varchar2(101) |
| 108 | def29 | def29 | def29 | varchar2(101) |
| 109 | def30 | def30 | def30 | varchar2(101) |
| 110 | creationtime | creationtime | creationtime | char(19) | √ |
| 111 | creator | creator | creator | varchar2(20) | √ |
| 112 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 113 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 114 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 115 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |