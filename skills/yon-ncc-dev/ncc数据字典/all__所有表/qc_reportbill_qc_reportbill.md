# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11116.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reportbill | pk_reportbill | pk_reportbill | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | bcrtcertbill | bcrtcertbill | bcrtcertbill | char(1) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | bneeddeal | bneeddeal | bneeddeal | char(1) |
| 6 | bnewqcvsn | bnewqcvsn | bnewqcvsn | char(1) |
| 7 | brejectaudit | brejectaudit | brejectaudit | char(1) |
| 8 | capplytranid | capplytranid | capplytranid | varchar2(20) |  |  | '~' |
| 9 | castunitid | castunitid | castunitid | varchar2(20) |  |  | '~' |
| 10 | cfilecode | cfilecode | cfilecode | varchar2(100) |
| 11 | cfileid | cfileid | cfileid | varchar2(20) |
| 12 | cprojectid | cprojectid | cprojectid | varchar2(20) |  |  | '~' |
| 13 | ctrantypeid | ctrantypeid | ctrantypeid | varchar2(20) |  |  | '~' |
| 14 | cunitid | cunitid | cunitid | varchar2(20) |  |  | '~' |
| 15 | dapplydate | dapplydate | dapplydate | char(19) |
| 16 | dmakedate | dmakedate | dmakedate | char(19) |
| 17 | dreportdate | dreportdate | dreportdate | char(19) |
| 18 | facceptjudge | facceptjudge | facceptjudge | number(38, 0) |
| 19 | fbillstatus | fbillstatus | fbillstatus | number(38, 0) |
| 20 | fstrictlevel | fstrictlevel | fstrictlevel | number(38, 0) |
| 21 | iprintcount | iprintcount | iprintcount | number(38, 0) |
| 22 | napplyastnum | napplyastnum | napplyastnum | number(28, 8) |
| 23 | napplynum | napplynum | napplynum | number(28, 8) |
| 24 | ncheckastnum | ncheckastnum | ncheckastnum | number(28, 8) |
| 25 | nchecknum | nchecknum | nchecknum | number(28, 8) |
| 26 | nchgastnum | nchgastnum | nchgastnum | number(28, 8) |
| 27 | nchgnum | nchgnum | nchgnum | number(28, 8) |
| 28 | nchgrate | nchgrate | nchgrate | number(28, 8) |
| 29 | neligiastnum | neligiastnum | neligiastnum | number(28, 8) |
| 30 | neliginum | neliginum | neliginum | number(28, 8) |
| 31 | neligrate | neligrate | neligrate | number(28, 8) |
| 32 | nqcvsn | nqcvsn | nqcvsn | number(38, 0) |
| 33 | nsimpleflow | nsimpleflow | nsimpleflow | number(38, 0) |
| 34 | ntransferpoint | ntransferpoint | ntransferpoint | number(28, 8) |
| 35 | nuneligiastnum | nuneligiastnum | nuneligiastnum | number(28, 8) |
| 36 | nuneliginum | nuneliginum | nuneliginum | number(28, 8) |
| 37 | operationcode | operationcode | operationcode | varchar2(40) |
| 38 | operationrepcode | operationrepcode | operationrepcode | varchar2(40) |
| 39 | operationtype | operationtype | operationtype | varchar2(40) |
| 40 | pk_applybill | pk_applybill | pk_applybill | varchar2(20) |
| 41 | pk_applydept | pk_applydept | pk_applydept | varchar2(20) |  |  | '~' |
| 42 | pk_applydept_v | pk_applydept_v | pk_applydept_v | varchar2(20) |  |  | '~' |
| 43 | pk_applyer | pk_applyer | pk_applyer | varchar2(20) |  |  | '~' |
| 44 | pk_batchcode_h | pk_batchcode_h | pk_batchcode_h | varchar2(20) |
| 45 | pk_certbill | pk_certbill | pk_certbill | varchar2(20) |
| 46 | pk_chkbatch | pk_chkbatch | pk_chkbatch | varchar2(20) |  |  | '~' |
| 47 | pk_chkdept | pk_chkdept | pk_chkdept | varchar2(20) |  |  | '~' |
| 48 | pk_chkdept_v | pk_chkdept_v | pk_chkdept_v | varchar2(20) |  |  | '~' |
| 49 | pk_chkstd | pk_chkstd | pk_chkstd | varchar2(20) |  |  | '~' |
| 50 | pk_chkstd_v | pk_chkstd_v | pk_chkstd_v | varchar2(20) |  |  | '~' |
| 51 | pk_continuebatch | pk_continuebatch | pk_continuebatch | varchar2(20) |  |  | '~' |
| 52 | pk_customer | pk_customer | pk_customer | varchar2(20) |  |  | '~' |
| 53 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 54 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 55 | pk_operationrep | pk_operationrep | pk_operationrep | varchar2(20) |
| 56 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 57 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 58 | pk_prestockstate | pk_prestockstate | pk_prestockstate | varchar2(20) |
| 59 | pk_pudept | pk_pudept | pk_pudept | varchar2(20) |  |  | '~' |
| 60 | pk_pudept_v | pk_pudept_v | pk_pudept_v | varchar2(20) |  |  | '~' |
| 61 | pk_puorg | pk_puorg | pk_puorg | varchar2(20) |  |  | '~' |
| 62 | pk_puorg_v | pk_puorg_v | pk_puorg_v | varchar2(20) |  |  | '~' |
| 63 | pk_pupsndoc | pk_pupsndoc | pk_pupsndoc | varchar2(20) |  |  | '~' |
| 64 | pk_rejectbill | pk_rejectbill | pk_rejectbill | char(20) |
| 65 | pk_reporter | pk_reporter | pk_reporter | varchar2(20) |  |  | '~' |
| 66 | pk_serialno | pk_serialno | pk_serialno | varchar2(20) |
| 67 | pk_srcmaterial | pk_srcmaterial | pk_srcmaterial | varchar2(20) |  |  | '~' |
| 68 | pk_stockorg | pk_stockorg | pk_stockorg | varchar2(20) |  |  | '~' |
| 69 | pk_stockorg_v | pk_stockorg_v | pk_stockorg_v | varchar2(20) |  |  | '~' |
| 70 | pk_stordoc | pk_stordoc | pk_stordoc | varchar2(20) |  |  | '~' |
| 71 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 72 | pk_workcenter | pk_workcenter | pk_workcenter | varchar2(20) |  |  | '~' |
| 73 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |  |  | '~' |
| 74 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 75 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |  |  | '~' |
| 76 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 77 | taudittime | taudittime | taudittime | char(19) |
| 78 | vapplybillcode | vapplybillcode | vapplybillcode | varchar2(40) |
| 79 | vbatchcode_h | vbatchcode_h | vbatchcode_h | varchar2(40) |
| 80 | vbillcode | vbillcode | vbillcode | varchar2(40) |
| 81 | vchangerate | vchangerate | vchangerate | varchar2(60) |
| 82 | vchkbatch | vchkbatch | vchkbatch | varchar2(50) |
| 83 | vmemo | vmemo | vmemo | varchar2(512) |
| 84 | vprodbillcode | vprodbillcode | vprodbillcode | varchar2(40) |
| 85 | vprodrptcode | vprodrptcode | vprodrptcode | varchar2(40) |
| 86 | vrejectcode | vrejectcode | vrejectcode | varchar2(40) |
| 87 | vsncode | vsncode | vsncode | varchar2(128) |
| 88 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |  |  | '~' |
| 89 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 90 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 91 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 92 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 93 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 94 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 95 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 96 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 97 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 98 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 99 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 100 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 101 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 102 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 103 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 104 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 105 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 106 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 107 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 108 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 109 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 110 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 111 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 112 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 113 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 114 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 115 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 116 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 117 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 118 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 119 | vdef31 | vdef31 | vdef31 | varchar2(101) |
| 120 | vdef32 | vdef32 | vdef32 | varchar2(101) |
| 121 | vdef33 | vdef33 | vdef33 | varchar2(101) |
| 122 | vdef34 | vdef34 | vdef34 | varchar2(101) |
| 123 | vdef35 | vdef35 | vdef35 | varchar2(101) |
| 124 | vdef36 | vdef36 | vdef36 | varchar2(101) |
| 125 | vdef37 | vdef37 | vdef37 | varchar2(101) |
| 126 | vdef38 | vdef38 | vdef38 | varchar2(101) |
| 127 | vdef39 | vdef39 | vdef39 | varchar2(101) |
| 128 | vdef40 | vdef40 | vdef40 | varchar2(101) |
| 129 | vdef41 | vdef41 | vdef41 | varchar2(101) |
| 130 | vdef42 | vdef42 | vdef42 | varchar2(101) |
| 131 | vdef43 | vdef43 | vdef43 | varchar2(101) |
| 132 | vdef44 | vdef44 | vdef44 | varchar2(101) |
| 133 | vdef45 | vdef45 | vdef45 | varchar2(101) |
| 134 | vdef46 | vdef46 | vdef46 | varchar2(101) |
| 135 | vdef47 | vdef47 | vdef47 | varchar2(101) |
| 136 | vdef48 | vdef48 | vdef48 | varchar2(101) |
| 137 | vdef49 | vdef49 | vdef49 | varchar2(101) |
| 138 | vdef50 | vdef50 | vdef50 | varchar2(101) |
| 139 | creationtime | creationtime | creationtime | char(19) |
| 140 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 141 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 142 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 143 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 144 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |