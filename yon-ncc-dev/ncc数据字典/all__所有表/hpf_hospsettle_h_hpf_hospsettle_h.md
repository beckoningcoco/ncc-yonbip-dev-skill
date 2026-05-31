# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8715.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hospsettle | pk_hospsettle | pk_hospsettle | char(20) | √ |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approvenote | approvenote | approvenote | varchar2(50) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | approvestatus | approvestatus | approvestatus | number(38, 0) |
| 6 | billdate | billdate | billdate | char(19) |
| 7 | billid | billid | billid | varchar2(50) |
| 8 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 9 | billno | billno | billno | varchar2(50) |
| 10 | billtype | billtype | billtype | varchar2(50) |
| 11 | billversionpk | billversionpk | billversionpk | varchar2(50) |
| 12 | busitype | busitype | busitype | varchar2(50) |
| 13 | bvoucher | bvoucher | bvoucher | char(1) |
| 14 | dbusdate | dbusdate | dbusdate | char(19) |
| 15 | emendenum | emendenum | emendenum | number(38, 0) |
| 16 | incometype | incometype | incometype | varchar2(50) |
| 17 | lastmaketime | lastmaketime | lastmaketime | char(19) |
| 18 | makebilltime | makebilltime | makebilltime | char(19) |
| 19 | maketime | maketime | maketime | char(19) |
| 20 | orgname | orgname | orgname | varchar2(50) |
| 21 | pkorg | pkorg | pkorg | varchar2(50) |
| 22 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 23 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 24 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 25 | srcbillid | srcbillid | srcbillid | varchar2(50) |
| 26 | srcbilltype | srcbilltype | srcbilltype | varchar2(50) |
| 27 | syscode | syscode | syscode | varchar2(20) |  |  | '~' |
| 28 | transtype | transtype | transtype | varchar2(50) |  |  | '~' |
| 29 | transtypepk | transtypepk | transtypepk | varchar2(20) |  |  | '~' |
| 30 | vvoucherno | vvoucherno | vvoucherno | varchar2(50) |
| 31 | def1 | def1 | def1 | varchar2(101) |
| 32 | def2 | def2 | def2 | varchar2(101) |
| 33 | def3 | def3 | def3 | varchar2(101) |
| 34 | def4 | def4 | def4 | varchar2(101) |
| 35 | def5 | def5 | def5 | varchar2(101) |
| 36 | def6 | def6 | def6 | varchar2(101) |
| 37 | def7 | def7 | def7 | varchar2(101) |
| 38 | def8 | def8 | def8 | varchar2(101) |
| 39 | def9 | def9 | def9 | varchar2(101) |
| 40 | def10 | def10 | def10 | varchar2(101) |
| 41 | def11 | def11 | def11 | varchar2(101) |
| 42 | def12 | def12 | def12 | varchar2(101) |
| 43 | def13 | def13 | def13 | varchar2(101) |
| 44 | def14 | def14 | def14 | varchar2(101) |
| 45 | def15 | def15 | def15 | varchar2(101) |
| 46 | def16 | def16 | def16 | varchar2(101) |
| 47 | def17 | def17 | def17 | varchar2(101) |
| 48 | def18 | def18 | def18 | varchar2(101) |
| 49 | def19 | def19 | def19 | varchar2(101) |
| 50 | def20 | def20 | def20 | varchar2(101) |
| 51 | def21 | def21 | def21 | varchar2(101) |
| 52 | def22 | def22 | def22 | varchar2(101) |
| 53 | def23 | def23 | def23 | varchar2(101) |
| 54 | def24 | def24 | def24 | varchar2(101) |
| 55 | def25 | def25 | def25 | varchar2(101) |
| 56 | def26 | def26 | def26 | varchar2(101) |
| 57 | def27 | def27 | def27 | varchar2(101) |
| 58 | def28 | def28 | def28 | varchar2(101) |
| 59 | def29 | def29 | def29 | varchar2(101) |
| 60 | def30 | def30 | def30 | varchar2(101) |
| 61 | def31 | def31 | def31 | varchar2(101) |
| 62 | def32 | def32 | def32 | varchar2(101) |
| 63 | def33 | def33 | def33 | varchar2(101) |
| 64 | def34 | def34 | def34 | varchar2(101) |
| 65 | def35 | def35 | def35 | varchar2(101) |
| 66 | def36 | def36 | def36 | varchar2(101) |
| 67 | def37 | def37 | def37 | varchar2(101) |
| 68 | def38 | def38 | def38 | varchar2(101) |
| 69 | def39 | def39 | def39 | varchar2(101) |
| 70 | def40 | def40 | def40 | varchar2(101) |
| 71 | creationtime | creationtime | creationtime | char(19) |
| 72 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 73 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 74 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 75 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 76 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |