# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8285.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billregister | pk_billregister | pk_billregister | char(20) | √ |
| 2 | billdrawclass | billdrawclass | billdrawclass | varchar2(200) |
| 3 | billreflectclass | billreflectclass | billreflectclass | varchar2(200) |
| 4 | billsumclass | billsumclass | billsumclass | varchar2(200) |
| 5 | class_entity_id | class_entity_id | class_entity_id | varchar2(36) |  |  | '~' |
| 6 | ctrlorgfindclass | ctrlorgfindclass | ctrlorgfindclass | varchar2(200) |
| 7 | defdoc1 | defdoc1 | defdoc1 | varchar2(50) |
| 8 | defdoc2 | defdoc2 | defdoc2 | varchar2(50) |
| 9 | defdoc3 | defdoc3 | defdoc3 | varchar2(50) |
| 10 | defqueryclass | defqueryclass | defqueryclass | varchar2(200) |
| 11 | desbillservclass | desbillservclass | desbillservclass | varchar2(200) |
| 12 | desbillsumclass | desbillsumclass | desbillsumclass | varchar2(200) |
| 13 | desctrlruleclass | desctrlruleclass | desctrlruleclass | varchar2(200) |
| 14 | dessumruleclass | dessumruleclass | dessumruleclass | varchar2(200) |
| 15 | dessumruleentity | dessumruleentity | dessumruleentity | varchar2(200) |
| 16 | dessumruleref | dessumruleref | dessumruleref | varchar2(200) |
| 17 | displayclass | displayclass | displayclass | varchar2(200) |
| 18 | drawqueryclass | drawqueryclass | drawqueryclass | varchar2(200) |
| 19 | drawquerypanel | drawquerypanel | drawquerypanel | varchar2(200) |
| 20 | editclass | editclass | editclass | varchar2(200) |
| 21 | linkqueryclass | linkqueryclass | linkqueryclass | varchar2(200) |
| 22 | linksrcbillclass | linksrcbillclass | linksrcbillclass | varchar2(200) |
| 23 | modulecode | modulecode | modulecode | varchar2(40) |
| 24 | org_ctrl_entity1 | org_ctrl_entity1 | org_ctrl_entity1 | varchar2(36) |  |  | '~' |
| 25 | org_ctrl_entity2 | org_ctrl_entity2 | org_ctrl_entity2 | varchar2(36) |  |  | '~' |
| 26 | org_entity_id | org_entity_id | org_entity_id | varchar2(36) |  |  | '~' |
| 27 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 28 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 29 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 30 | previewvoucherclass | previewvoucherclass | previewvoucherclass | varchar2(200) |
| 31 | queryconditionclass | queryconditionclass | queryconditionclass | varchar2(200) |
| 32 | voucherdataprocessclass | voucherdataprocessclass | voucherdataprocessclass | varchar2(200) |
| 33 | webcomponent | webcomponent | webcomponent | varchar2(200) |
| 34 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 35 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |