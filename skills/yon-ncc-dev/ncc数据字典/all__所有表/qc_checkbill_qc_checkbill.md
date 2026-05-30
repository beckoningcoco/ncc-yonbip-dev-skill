# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11089.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_checkbill | pk_checkbill | pk_checkbill | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 4 | blatest | blatest | blatest | char(1) |
| 5 | bnewqcvsn | bnewqcvsn | bnewqcvsn | char(1) |
| 6 | brecheck | brecheck | brecheck | char(1) |
| 7 | brefbyreport | brefbyreport | brefbyreport | char(1) |  |  | 'N' |
| 8 | breportcreate | breportcreate | breportcreate | char(1) |
| 9 | castunitid | castunitid | castunitid | varchar2(20) |  |  | '~' |
| 10 | cfilecode | cfilecode | cfilecode | varchar2(100) |
| 11 | cfileid | cfileid | cfileid | varchar2(20) |
| 12 | cfirstid | cfirstid | cfirstid | varchar2(20) |
| 13 | cfirsttypecode | cfirsttypecode | cfirsttypecode | varchar2(20) |  |  | '~' |
| 14 | creviser | creviser | creviser | varchar2(20) |  |  | '~' |
| 15 | csourceid | csourceid | csourceid | varchar2(20) |
| 16 | csourcetypecode | csourcetypecode | csourcetypecode | varchar2(20) |  |  | '~' |
| 17 | ctrantypeid | ctrantypeid | ctrantypeid | varchar2(20) |  |  | '~' |
| 18 | cunitid | cunitid | cunitid | varchar2(20) |  |  | '~' |
| 19 | dapplydate | dapplydate | dapplydate | char(19) |
| 20 | dbilldate | dbilldate | dbilldate | char(19) |
| 21 | dmakedate | dmakedate | dmakedate | char(19) |
| 22 | fbillstatus | fbillstatus | fbillstatus | number(38, 0) |
| 23 | iprintcount | iprintcount | iprintcount | number(38, 0) |
| 24 | irechksampnum | irechksampnum | irechksampnum | number(38, 0) |
| 25 | iversion | iversion | iversion | number(38, 0) |
| 26 | nastnum | nastnum | nastnum | number(28, 8) |
| 27 | nnum | nnum | nnum | number(28, 8) |
| 28 | nqcvsn | nqcvsn | nqcvsn | number(38, 0) |
| 29 | nsamplenum | nsamplenum | nsamplenum | number(28, 8) |
| 30 | operationcode | operationcode | operationcode | varchar2(40) |
| 31 | operationrepcode | operationrepcode | operationrepcode | varchar2(40) |
| 32 | operationtype | operationtype | operationtype | varchar2(20) |  |  | '~' |
| 33 | pk_applydept | pk_applydept | pk_applydept | varchar2(20) |  |  | '~' |
| 34 | pk_applydept_v | pk_applydept_v | pk_applydept_v | varchar2(20) |  |  | '~' |
| 35 | pk_batchcode | pk_batchcode | pk_batchcode | varchar2(20) |
| 36 | pk_checkshape | pk_checkshape | pk_checkshape | varchar2(20) |  |  | '~' |
| 37 | pk_chkbatch | pk_chkbatch | pk_chkbatch | varchar2(20) |  |  | '~' |
| 38 | pk_chkdept | pk_chkdept | pk_chkdept | varchar2(20) |  |  | '~' |
| 39 | pk_chkdept_v | pk_chkdept_v | pk_chkdept_v | varchar2(20) |  |  | '~' |
| 40 | pk_chkgroup | pk_chkgroup | pk_chkgroup | varchar2(20) |  |  | '~' |
| 41 | pk_defaultstd | pk_defaultstd | pk_defaultstd | varchar2(20) |  |  | '~' |
| 42 | pk_defaultstd_v | pk_defaultstd_v | pk_defaultstd_v | varchar2(20) |  |  | '~' |
| 43 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 44 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 45 | pk_operationrep | pk_operationrep | pk_operationrep | varchar2(20) |
| 46 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 47 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 48 | pk_outsupplier | pk_outsupplier | pk_outsupplier | varchar2(20) |  |  | '~' |
| 49 | pk_serialno | pk_serialno | pk_serialno | varchar2(20) |
| 50 | pk_srcchkbill | pk_srcchkbill | pk_srcchkbill | char(20) |
| 51 | pk_srcmaterial | pk_srcmaterial | pk_srcmaterial | varchar2(20) |  |  | '~' |
| 52 | pk_stockorg | pk_stockorg | pk_stockorg | varchar2(20) |  |  | '~' |
| 53 | pk_stockorg_v | pk_stockorg_v | pk_stockorg_v | varchar2(20) |  |  | '~' |
| 54 | pk_trustorg | pk_trustorg | pk_trustorg | varchar2(20) |  |  | '~' |
| 55 | pk_trustorg_v | pk_trustorg_v | pk_trustorg_v | varchar2(20) |  |  | '~' |
| 56 | taudittime | taudittime | taudittime | char(19) |
| 57 | trevisiontime | trevisiontime | trevisiontime | char(19) |
| 58 | vbatchcode | vbatchcode | vbatchcode | varchar2(40) |
| 59 | vbillcode | vbillcode | vbillcode | varchar2(40) |
| 60 | vchangerate | vchangerate | vchangerate | varchar2(60) |
| 61 | vfirstcode | vfirstcode | vfirstcode | varchar2(40) |
| 62 | vfirsttrantype | vfirsttrantype | vfirsttrantype | varchar2(20) |  |  | '~' |
| 63 | vmemo | vmemo | vmemo | varchar2(181) |
| 64 | vrecheckreason | vrecheckreason | vrecheckreason | varchar2(181) |
| 65 | vsamplecode | vsamplecode | vsamplecode | varchar2(50) |
| 66 | vsncode | vsncode | vsncode | varchar2(128) |
| 67 | vsourcecode | vsourcecode | vsourcecode | varchar2(40) |
| 68 | vsourcetrantype | vsourcetrantype | vsourcetrantype | varchar2(20) |  |  | '~' |
| 69 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |  |  | '~' |
| 70 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 71 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 72 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 73 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 74 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 75 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 76 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 77 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 78 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 79 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 80 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 81 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 82 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 83 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 84 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 85 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 86 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 87 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 88 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 89 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 90 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 91 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 92 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 93 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 94 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 95 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 96 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 97 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 98 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 99 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 100 | vdef31 | vdef31 | vdef31 | varchar2(101) |
| 101 | vdef32 | vdef32 | vdef32 | varchar2(101) |
| 102 | vdef33 | vdef33 | vdef33 | varchar2(101) |
| 103 | vdef34 | vdef34 | vdef34 | varchar2(101) |
| 104 | vdef35 | vdef35 | vdef35 | varchar2(101) |
| 105 | vdef36 | vdef36 | vdef36 | varchar2(101) |
| 106 | vdef37 | vdef37 | vdef37 | varchar2(101) |
| 107 | vdef38 | vdef38 | vdef38 | varchar2(101) |
| 108 | vdef39 | vdef39 | vdef39 | varchar2(101) |
| 109 | vdef40 | vdef40 | vdef40 | varchar2(101) |
| 110 | vdef41 | vdef41 | vdef41 | varchar2(101) |
| 111 | vdef42 | vdef42 | vdef42 | varchar2(101) |
| 112 | vdef43 | vdef43 | vdef43 | varchar2(101) |
| 113 | vdef44 | vdef44 | vdef44 | varchar2(101) |
| 114 | vdef45 | vdef45 | vdef45 | varchar2(101) |
| 115 | vdef46 | vdef46 | vdef46 | varchar2(101) |
| 116 | vdef47 | vdef47 | vdef47 | varchar2(101) |
| 117 | vdef48 | vdef48 | vdef48 | varchar2(101) |
| 118 | vdef49 | vdef49 | vdef49 | varchar2(101) |
| 119 | vdef50 | vdef50 | vdef50 | varchar2(101) |
| 120 | creationtime | creationtime | creationtime | char(19) |
| 121 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 122 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 123 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 124 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 125 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |