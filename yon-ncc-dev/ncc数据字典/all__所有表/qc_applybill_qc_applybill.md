# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11080.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_applybill | pk_applybill | pk_applybill | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 4 | bnewqcvsn | bnewqcvsn | bnewqcvsn | char(1) |
| 5 | brepeatapply | brepeatapply | brepeatapply | char(1) |
| 6 | castunitid | castunitid | castunitid | varchar2(20) |  |  | '~' |
| 7 | cfilecode | cfilecode | cfilecode | varchar2(100) |
| 8 | cfileid | cfileid | cfileid | varchar2(20) |
| 9 | cprojectid | cprojectid | cprojectid | varchar2(20) |  |  | '~' |
| 10 | ctrantypeid | ctrantypeid | ctrantypeid | varchar2(20) |  |  | '~' |
| 11 | cunitid | cunitid | cunitid | varchar2(20) |  |  | '~' |
| 12 | dapplydate | dapplydate | dapplydate | char(19) |
| 13 | dmakedate | dmakedate | dmakedate | char(19) |
| 14 | dproducedate | dproducedate | dproducedate | varchar2(19) |
| 15 | drejectdate | drejectdate | drejectdate | char(19) |
| 16 | fbillstatus | fbillstatus | fbillstatus | number(38, 0) |
| 17 | fsourcetype | fsourcetype | fsourcetype | number(38, 0) |
| 18 | fstrictlevel | fstrictlevel | fstrictlevel | number(38, 0) |
| 19 | iprintcount | iprintcount | iprintcount | number(38, 0) |
| 20 | naccumchknum | naccumchknum | naccumchknum | number(28, 8) |
| 21 | nastnum | nastnum | nastnum | number(28, 8) |
| 22 | nnum | nnum | nnum | number(28, 8) |
| 23 | nqcvsn | nqcvsn | nqcvsn | number(38, 0) |
| 24 | operationrepcode | operationrepcode | operationrepcode | varchar2(40) |
| 25 | pk_applydept | pk_applydept | pk_applydept | varchar2(20) |  |  | '~' |
| 26 | pk_applydept_v | pk_applydept_v | pk_applydept_v | varchar2(20) |  |  | '~' |
| 27 | pk_applyer | pk_applyer | pk_applyer | varchar2(20) |  |  | '~' |
| 28 | pk_batchcode | pk_batchcode | pk_batchcode | varchar2(20) |
| 29 | pk_chkdept | pk_chkdept | pk_chkdept | varchar2(20) |  |  | '~' |
| 30 | pk_chkdept_v | pk_chkdept_v | pk_chkdept_v | varchar2(20) |  |  | '~' |
| 31 | pk_continuebatch | pk_continuebatch | pk_continuebatch | varchar2(20) |  |  | '~' |
| 32 | pk_customer | pk_customer | pk_customer | varchar2(20) |  |  | '~' |
| 33 | pk_defaultstd | pk_defaultstd | pk_defaultstd | varchar2(20) |  |  | '~' |
| 34 | pk_defaultstd_v | pk_defaultstd_v | pk_defaultstd_v | varchar2(20) |  |  | '~' |
| 35 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 36 | pk_hcheckmode | pk_hcheckmode | pk_hcheckmode | varchar2(20) |  |  | '~' |
| 37 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 38 | pk_operation | pk_operation | pk_operation | varchar2(20) |  |  | '~' |
| 39 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 40 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 41 | pk_prodgroup | pk_prodgroup | pk_prodgroup | varchar2(20) |  |  | '~' |
| 42 | pk_prodpsn | pk_prodpsn | pk_prodpsn | varchar2(20) |  |  | '~' |
| 43 | pk_pudept | pk_pudept | pk_pudept | varchar2(20) |  |  | '~' |
| 44 | pk_pudept_v | pk_pudept_v | pk_pudept_v | varchar2(20) |  |  | '~' |
| 45 | pk_puorg | pk_puorg | pk_puorg | varchar2(20) |  |  | '~' |
| 46 | pk_puorg_v | pk_puorg_v | pk_puorg_v | varchar2(20) |  |  | '~' |
| 47 | pk_pupsndoc | pk_pupsndoc | pk_pupsndoc | varchar2(20) |  |  | '~' |
| 48 | pk_rc | pk_rc | pk_rc | varchar2(20) |  |  | '~' |
| 49 | pk_rejectpsn | pk_rejectpsn | pk_rejectpsn | varchar2(20) |  |  | '~' |
| 50 | pk_serialno | pk_serialno | pk_serialno | varchar2(20) |
| 51 | pk_srcmaterial | pk_srcmaterial | pk_srcmaterial | varchar2(20) |  |  | '~' |
| 52 | pk_stockorg | pk_stockorg | pk_stockorg | varchar2(20) |  |  | '~' |
| 53 | pk_stockorg_v | pk_stockorg_v | pk_stockorg_v | varchar2(20) |  |  | '~' |
| 54 | pk_stordoc | pk_stordoc | pk_stordoc | varchar2(20) |  |  | '~' |
| 55 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 56 | pk_workcenter | pk_workcenter | pk_workcenter | varchar2(20) |  |  | '~' |
| 57 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |  |  | '~' |
| 58 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 59 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |  |  | '~' |
| 60 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 61 | taudittime | taudittime | taudittime | char(19) |
| 62 | vbatchcode | vbatchcode | vbatchcode | varchar2(40) |
| 63 | vbillcode | vbillcode | vbillcode | varchar2(40) |
| 64 | vchangerate | vchangerate | vchangerate | varchar2(60) |
| 65 | vmemo | vmemo | vmemo | varchar2(181) |
| 66 | vmmpscreceivecode | vmmpscreceivecode | vmmpscreceivecode | varchar2(40) |
| 67 | voperationcode | voperationcode | voperationcode | varchar2(40) |
| 68 | vprodbatch | vprodbatch | vprodbatch | varchar2(40) |
| 69 | vprodbillcode | vprodbillcode | vprodbillcode | varchar2(40) |
| 70 | vprodrptcode | vprodrptcode | vprodrptcode | varchar2(40) |
| 71 | vproducesn | vproducesn | vproducesn | varchar2(30) |
| 72 | vrejectreason | vrejectreason | vrejectreason | varchar2(181) |
| 73 | vsncode | vsncode | vsncode | varchar2(128) |
| 74 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |  |  | '~' |
| 75 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 76 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 77 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 78 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 79 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 80 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 81 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 82 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 83 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 84 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 85 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 86 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 87 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 88 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 89 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 90 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 91 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 92 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 93 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 94 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 95 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 96 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 97 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 98 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 99 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 100 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 101 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 102 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 103 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 104 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 105 | vdef31 | vdef31 | vdef31 | varchar2(101) |
| 106 | vdef32 | vdef32 | vdef32 | varchar2(101) |
| 107 | vdef33 | vdef33 | vdef33 | varchar2(101) |
| 108 | vdef34 | vdef34 | vdef34 | varchar2(101) |
| 109 | vdef35 | vdef35 | vdef35 | varchar2(101) |
| 110 | vdef36 | vdef36 | vdef36 | varchar2(101) |
| 111 | vdef37 | vdef37 | vdef37 | varchar2(101) |
| 112 | vdef38 | vdef38 | vdef38 | varchar2(101) |
| 113 | vdef39 | vdef39 | vdef39 | varchar2(101) |
| 114 | vdef40 | vdef40 | vdef40 | varchar2(101) |
| 115 | vdef41 | vdef41 | vdef41 | varchar2(101) |
| 116 | vdef42 | vdef42 | vdef42 | varchar2(101) |
| 117 | vdef43 | vdef43 | vdef43 | varchar2(101) |
| 118 | vdef44 | vdef44 | vdef44 | varchar2(101) |
| 119 | vdef45 | vdef45 | vdef45 | varchar2(101) |
| 120 | vdef46 | vdef46 | vdef46 | varchar2(101) |
| 121 | vdef47 | vdef47 | vdef47 | varchar2(101) |
| 122 | vdef48 | vdef48 | vdef48 | varchar2(101) |
| 123 | vdef49 | vdef49 | vdef49 | varchar2(101) |
| 124 | vdef50 | vdef50 | vdef50 | varchar2(101) |
| 125 | vdef51 | vdef51 | vdef51 | varchar2(101) |
| 126 | vdef52 | vdef52 | vdef52 | varchar2(101) |
| 127 | vdef53 | vdef53 | vdef53 | varchar2(101) |
| 128 | vdef54 | vdef54 | vdef54 | varchar2(101) |
| 129 | vdef55 | vdef55 | vdef55 | varchar2(101) |
| 130 | vdef56 | vdef56 | vdef56 | varchar2(101) |
| 131 | vdef57 | vdef57 | vdef57 | varchar2(101) |
| 132 | vdef58 | vdef58 | vdef58 | varchar2(101) |
| 133 | vdef59 | vdef59 | vdef59 | varchar2(101) |
| 134 | vdef60 | vdef60 | vdef60 | varchar2(101) |
| 135 | vfree1 | vfree1 | vfree1 | varchar2(101) |
| 136 | vfree2 | vfree2 | vfree2 | varchar2(101) |
| 137 | vfree3 | vfree3 | vfree3 | varchar2(101) |
| 138 | vfree4 | vfree4 | vfree4 | varchar2(101) |
| 139 | vfree5 | vfree5 | vfree5 | varchar2(101) |
| 140 | vfree6 | vfree6 | vfree6 | varchar2(101) |
| 141 | vfree7 | vfree7 | vfree7 | varchar2(101) |
| 142 | vfree8 | vfree8 | vfree8 | varchar2(101) |
| 143 | vfree9 | vfree9 | vfree9 | varchar2(101) |
| 144 | vfree10 | vfree10 | vfree10 | varchar2(101) |
| 145 | creationtime | creationtime | creationtime | char(19) |
| 146 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 147 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 148 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 149 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 150 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |