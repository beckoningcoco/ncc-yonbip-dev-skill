# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11119.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_samplebill | pk_samplebill | pk_samplebill | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 4 | bnewqcvsn | bnewqcvsn | bnewqcvsn | char(1) |
| 5 | castunitid | castunitid | castunitid | varchar2(20) |  |  | '~' |
| 6 | cfilecode | cfilecode | cfilecode | varchar2(100) |
| 7 | cfileid | cfileid | cfileid | varchar2(20) |
| 8 | cfirstid | cfirstid | cfirstid | char(20) |
| 9 | cfirsttypecode | cfirsttypecode | cfirsttypecode | varchar2(20) |  |  | '~' |
| 10 | csourceid | csourceid | csourceid | varchar2(20) |
| 11 | csourcetypecode | csourcetypecode | csourcetypecode | varchar2(20) |  |  | '~' |
| 12 | ctrantypeid | ctrantypeid | ctrantypeid | varchar2(20) |  |  | '~' |
| 13 | cunitid | cunitid | cunitid | varchar2(20) |  |  | '~' |
| 14 | dapplydate | dapplydate | dapplydate | char(19) |
| 15 | dbilldate | dbilldate | dbilldate | char(19) |
| 16 | dmakedate | dmakedate | dmakedate | char(19) |
| 17 | fbillstatus | fbillstatus | fbillstatus | number(38, 0) |
| 18 | fsamplingsource | fsamplingsource | fsamplingsource | number(38, 0) |
| 19 | fsourcetype | fsourcetype | fsourcetype | number(38, 0) |
| 20 | icrtbillcount | icrtbillcount | icrtbillcount | number(38, 0) |
| 21 | iprintcount | iprintcount | iprintcount | number(38, 0) |
| 22 | nastnum | nastnum | nastnum | number(28, 8) |
| 23 | nnum | nnum | nnum | number(28, 8) |
| 24 | nqcvsn | nqcvsn | nqcvsn | number(38, 0) |
| 25 | pk_applydept | pk_applydept | pk_applydept | varchar2(20) |  |  | '~' |
| 26 | pk_applydept_v | pk_applydept_v | pk_applydept_v | varchar2(20) |  |  | '~' |
| 27 | pk_batchcode | pk_batchcode | pk_batchcode | varchar2(20) |
| 28 | pk_chkbatch | pk_chkbatch | pk_chkbatch | varchar2(20) |  |  | '~' |
| 29 | pk_continuebatch | pk_continuebatch | pk_continuebatch | varchar2(20) |  |  | '~' |
| 30 | pk_defaultstd | pk_defaultstd | pk_defaultstd | varchar2(20) |  |  | '~' |
| 31 | pk_defaultstd_v | pk_defaultstd_v | pk_defaultstd_v | varchar2(20) |  |  | '~' |
| 32 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 33 | pk_hcheckmode | pk_hcheckmode | pk_hcheckmode | varchar2(20) |  |  | '~' |
| 34 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 35 | pk_operation | pk_operation | pk_operation | char(20) |  |  | '~' |
| 36 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 37 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 38 | pk_rc | pk_rc | pk_rc | varchar2(20) |  |  | '~' |
| 39 | pk_samplingpsn | pk_samplingpsn | pk_samplingpsn | varchar2(20) |  |  | '~' |
| 40 | pk_serialno | pk_serialno | pk_serialno | varchar2(20) |
| 41 | pk_srcmaterial | pk_srcmaterial | pk_srcmaterial | varchar2(20) |  |  | '~' |
| 42 | taudittime | taudittime | taudittime | char(19) |
| 43 | tsamplingtime | tsamplingtime | tsamplingtime | varchar2(19) |
| 44 | vbatchcode | vbatchcode | vbatchcode | varchar2(40) |
| 45 | vbillcode | vbillcode | vbillcode | varchar2(40) |
| 46 | vchangerate | vchangerate | vchangerate | varchar2(60) |
| 47 | vchkbatchcode | vchkbatchcode | vchkbatchcode | varchar2(50) |
| 48 | vfirstcode | vfirstcode | vfirstcode | varchar2(40) |
| 49 | vfirsttrantype | vfirsttrantype | vfirsttrantype | varchar2(20) |  |  | '~' |
| 50 | vmemo | vmemo | vmemo | varchar2(181) |
| 51 | voperationcode | voperationcode | voperationcode | varchar2(40) |
| 52 | voperationrepcode | voperationrepcode | voperationrepcode | varchar2(40) |
| 53 | vrecheckreason | vrecheckreason | vrecheckreason | varchar2(181) |
| 54 | vsncode | vsncode | vsncode | varchar2(128) |
| 55 | vsourcecode | vsourcecode | vsourcecode | varchar2(40) |
| 56 | vsourcetrantype | vsourcetrantype | vsourcetrantype | varchar2(20) |  |  | '~' |
| 57 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |  |  | '~' |
| 58 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 59 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 60 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 61 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 62 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 63 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 64 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 65 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 66 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 67 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 68 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 69 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 70 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 71 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 72 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 73 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 74 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 75 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 76 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 77 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 78 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 79 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 80 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 81 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 82 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 83 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 84 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 85 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 86 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 87 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 88 | vdef31 | vdef31 | vdef31 | varchar2(101) |
| 89 | vdef32 | vdef32 | vdef32 | varchar2(101) |
| 90 | vdef33 | vdef33 | vdef33 | varchar2(101) |
| 91 | vdef34 | vdef34 | vdef34 | varchar2(101) |
| 92 | vdef35 | vdef35 | vdef35 | varchar2(101) |
| 93 | vdef36 | vdef36 | vdef36 | varchar2(101) |
| 94 | vdef37 | vdef37 | vdef37 | varchar2(101) |
| 95 | vdef38 | vdef38 | vdef38 | varchar2(101) |
| 96 | vdef39 | vdef39 | vdef39 | varchar2(101) |
| 97 | vdef40 | vdef40 | vdef40 | varchar2(101) |
| 98 | vdef41 | vdef41 | vdef41 | varchar2(101) |
| 99 | vdef42 | vdef42 | vdef42 | varchar2(101) |
| 100 | vdef43 | vdef43 | vdef43 | varchar2(101) |
| 101 | vdef44 | vdef44 | vdef44 | varchar2(101) |
| 102 | vdef45 | vdef45 | vdef45 | varchar2(101) |
| 103 | vdef46 | vdef46 | vdef46 | varchar2(101) |
| 104 | vdef47 | vdef47 | vdef47 | varchar2(101) |
| 105 | vdef48 | vdef48 | vdef48 | varchar2(101) |
| 106 | vdef49 | vdef49 | vdef49 | varchar2(101) |
| 107 | vdef50 | vdef50 | vdef50 | varchar2(101) |
| 108 | creationtime | creationtime | creationtime | char(19) |
| 109 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 110 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 111 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 112 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 113 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |