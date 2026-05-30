# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9123.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 2 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 3 | bitinbill | bitinbill | bitinbill | char(1) |  |  | 'N' |
| 4 | btriatradeflag | btriatradeflag | btriatradeflag | char(1) |
| 5 | casenumber | casenumber | casenumber | varchar2(50) |
| 6 | cbizid | cbizid | cbizid | varchar2(20) |  |  | '~' |
| 7 | cbiztype | cbiztype | cbiztype | varchar2(20) |  |  | '~' |
| 8 | ccostdomainid | ccostdomainid | ccostdomainid | varchar2(20) |  |  | '~' |
| 9 | ccustomerid | ccustomerid | ccustomerid | varchar2(20) |  |  | '~' |
| 10 | cdptid | cdptid | cdptid | varchar2(20) |  |  | '~' |
| 11 | cdptvid | cdptvid | cdptvid | varchar2(20) |  |  | '~' |
| 12 | cfanaceorgoid | cfanaceorgoid | cfanaceorgoid | varchar2(20) |  |  | '~' |
| 13 | cfanaceorgvid | cfanaceorgvid | cfanaceorgvid | varchar2(20) |  |  | '~' |
| 14 | cgeneralhid | cgeneralhid | cgeneralhid | char(20) | √ |
| 15 | corpoid | corpoid | corpoid | varchar2(20) |  |  | '~' |
| 16 | corpvid | corpvid | corpvid | varchar2(20) |  |  | '~' |
| 17 | cpayfinorgoid | cpayfinorgoid | cpayfinorgoid | varchar2(20) |  |  | '~' |
| 18 | cpayfinorgvid | cpayfinorgvid | cpayfinorgvid | varchar2(20) |  |  | '~' |
| 19 | cpurorgoid | cpurorgoid | cpurorgoid | varchar2(20) |  |  | '~' |
| 20 | cpurorgvid | cpurorgvid | cpurorgvid | varchar2(20) |  |  | '~' |
| 21 | crececountryid | crececountryid | crececountryid | varchar2(20) |  |  | '~' |
| 22 | csendcountryid | csendcountryid | csendcountryid | varchar2(20) |  |  | '~' |
| 23 | csendtypeid | csendtypeid | csendtypeid | varchar2(20) |  |  | '~' |
| 24 | ctaxcountryid | ctaxcountryid | ctaxcountryid | varchar2(20) |  |  | '~' |
| 25 | ctradewordid | ctradewordid | ctradewordid | varchar2(20) |  |  | '~' |
| 26 | ctrantypeid | ctrantypeid | ctrantypeid | varchar2(20) |  |  | '~' |
| 27 | cvendorid | cvendorid | cvendorid | varchar2(20) |  |  | '~' |
| 28 | cwarehouseid | cwarehouseid | cwarehouseid | varchar2(20) |  |  | '~' |
| 29 | cwhsmanagerid | cwhsmanagerid | cwhsmanagerid | varchar2(20) |  |  | '~' |
| 30 | dbilldate | dbilldate | dbilldate | char(19) |
| 31 | dmakedate | dmakedate | dmakedate | char(19) |
| 32 | fbillflag | fbillflag | fbillflag | number(38, 0) |  |  | 2 |
| 33 | fbuysellflag | fbuysellflag | fbuysellflag | number(38, 0) |
| 34 | freplenishflag | freplenishflag | freplenishflag | char(1) |
| 35 | iprintcount | iprintcount | iprintcount | number(38, 0) |
| 36 | materialpackage | materialpackage | materialpackage | varchar2(50) |
| 37 | ntotalmny | ntotalmny | ntotalmny | number(28, 8) |
| 38 | ntotalnum | ntotalnum | ntotalnum | number(28, 8) |
| 39 | ntotalpiece | ntotalpiece | ntotalpiece | number(28, 8) |
| 40 | ntotalvolume | ntotalvolume | ntotalvolume | number(28, 8) |
| 41 | ntotalweight | ntotalweight | ntotalweight | number(28, 8) |
| 42 | operationcode | operationcode | operationcode | varchar2(100) |
| 43 | operationname | operationname | operationname | varchar2(200) |
| 44 | patientname | patientname | patientname | varchar2(50) |
| 45 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 46 | pk_measware | pk_measware | pk_measware | varchar2(20) |  |  | '~' |
| 47 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 48 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 49 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |  |  | '~' |
| 50 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 51 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |  |  | '~' |
| 52 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 53 | setpartcode | setpartcode | setpartcode | varchar2(20) |  |  | '~' |
| 54 | setpartname | setpartname | setpartname | varchar2(50) |
| 55 | sterilization | sterilization | sterilization | char(1) |
| 56 | taudittime | taudittime | taudittime | char(19) |
| 57 | vbillcode | vbillcode | vbillcode | varchar2(40) |
| 58 | vnote | vnote | vnote | varchar2(200) |
| 59 | vreturnreason | vreturnreason | vreturnreason | varchar2(20) |  |  | '~' |
| 60 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |  |  | '~' |
| 61 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 62 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 63 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 64 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 65 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 66 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 67 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 68 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 69 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 70 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 71 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 72 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 73 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 74 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 75 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 76 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 77 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 78 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 79 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 80 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 81 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 82 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 83 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 84 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 85 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 86 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 87 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 88 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 89 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 90 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 91 | vdef31 | vdef31 | vdef31 | varchar2(101) |
| 92 | vdef32 | vdef32 | vdef32 | varchar2(101) |
| 93 | vdef33 | vdef33 | vdef33 | varchar2(101) |
| 94 | vdef34 | vdef34 | vdef34 | varchar2(101) |
| 95 | vdef35 | vdef35 | vdef35 | varchar2(101) |
| 96 | vdef36 | vdef36 | vdef36 | varchar2(101) |
| 97 | vdef37 | vdef37 | vdef37 | varchar2(101) |
| 98 | vdef38 | vdef38 | vdef38 | varchar2(101) |
| 99 | vdef39 | vdef39 | vdef39 | varchar2(101) |
| 100 | vdef40 | vdef40 | vdef40 | varchar2(101) |
| 101 | vdef41 | vdef41 | vdef41 | varchar2(101) |
| 102 | vdef42 | vdef42 | vdef42 | varchar2(101) |
| 103 | vdef43 | vdef43 | vdef43 | varchar2(101) |
| 104 | vdef44 | vdef44 | vdef44 | varchar2(101) |
| 105 | vdef45 | vdef45 | vdef45 | varchar2(101) |
| 106 | vdef46 | vdef46 | vdef46 | varchar2(101) |
| 107 | vdef47 | vdef47 | vdef47 | varchar2(101) |
| 108 | vdef48 | vdef48 | vdef48 | varchar2(101) |
| 109 | vdef49 | vdef49 | vdef49 | varchar2(101) |
| 110 | vdef50 | vdef50 | vdef50 | varchar2(101) |
| 111 | creationtime | creationtime | creationtime | char(19) |
| 112 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 113 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 114 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 115 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 116 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |