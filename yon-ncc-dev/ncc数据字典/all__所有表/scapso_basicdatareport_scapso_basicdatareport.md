# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11292.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_basicdatareport | pk_basicdatareport | pk_basicdatareport | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 4 | bisbelisted | bisbelisted | bisbelisted | char(1) |
| 5 | bisbelongsettle | bisbelongsettle | bisbelongsettle | char(1) |
| 6 | bisplatformcompany | bisplatformcompany | bisplatformcompany | char(1) |
| 7 | cbilltypecode | cbilltypecode | cbilltypecode | varchar2(20) |
| 8 | ccurrencyid | ccurrencyid | ccurrencyid | varchar2(20) |  |  | '~' |
| 9 | cfirstid | cfirstid | cfirstid | char(20) |
| 10 | cglobalcurrencyid | cglobalcurrencyid | cglobalcurrencyid | varchar2(20) |  |  | '~' |
| 11 | cgroupcurrencyid | cgroupcurrencyid | cgroupcurrencyid | varchar2(20) |  |  | '~' |
| 12 | corigcurrencyid | corigcurrencyid | corigcurrencyid | varchar2(20) |  |  | '~' |
| 13 | csrcid | csrcid | csrcid | char(20) |
| 14 | dbeginbusidate | dbeginbusidate | dbeginbusidate | char(19) |
| 15 | dbilldate | dbilldate | dbilldate | char(19) |
| 16 | dbuilddate | dbuilddate | dbuilddate | char(19) |
| 17 | dendbusidate | dendbusidate | dendbusidate | char(19) |
| 18 | dmakedate | dmakedate | dmakedate | char(19) |
| 19 | fstatusflag | fstatusflag | fstatusflag | number(38, 0) |
| 20 | ientermannum | ientermannum | ientermannum | number(38, 0) |
| 21 | imanagelevel | imanagelevel | imanagelevel | number(38, 0) |
| 22 | irightlevel | irightlevel | irightlevel | number(38, 0) |
| 23 | nallregistmny | nallregistmny | nallregistmny | number(28, 8) |
| 24 | nbaseregistmny | nbaseregistmny | nbaseregistmny | number(28, 8) |
| 25 | nexchangerate | nexchangerate | nexchangerate | number(28, 8) |
| 26 | nglobalexchgrate | nglobalexchgrate | nglobalexchgrate | number(28, 8) |
| 27 | ngpregistmny | ngpregistmny | ngpregistmny | number(28, 8) |
| 28 | ngroupexchgrate | ngroupexchgrate | ngroupexchgrate | number(28, 8) |
| 29 | ninvesthasratio | ninvesthasratio | ninvesthasratio | number(28, 8) |
| 30 | norigregistmny | norigregistmny | norigregistmny | number(28, 8) |
| 31 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 32 | pk_country | pk_country | pk_country | varchar2(20) |  |  | '~' |
| 33 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 34 | pk_dept_v | pk_dept_v | pk_dept_v | varchar2(20) |  |  | '~' |
| 35 | pk_group | pk_group | pk_group | char(20) | √ |
| 36 | pk_industry | pk_industry | pk_industry | varchar2(200) |  |  | '~' |
| 37 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 38 | pk_orgform | pk_orgform | pk_orgform | varchar2(20) |  |  | '~' |
| 39 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 40 | pk_parent | pk_parent | pk_parent | varchar2(50) |  |  | '~' |
| 41 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 42 | pk_region | pk_region | pk_region | varchar2(20) |  |  | '~' |
| 43 | pk_transtype | pk_transtype | pk_transtype | varchar2(20) |  |  | '~' |
| 44 | taudittime | taudittime | taudittime | char(19) |
| 45 | vaddtype | vaddtype | vaddtype | varchar2(50) |
| 46 | vapprovenote | vapprovenote | vapprovenote | varchar2(1024) |
| 47 | vbelonggroupname | vbelonggroupname | vbelonggroupname | varchar2(512) |
| 48 | vbillcode | vbillcode | vbillcode | varchar2(50) |
| 49 | vbillname | vbillname | vbillname | varchar2(200) |
| 50 | vbillname2 | vbillname2 | vbillname2 | varchar2(200) |
| 51 | vbillname3 | vbillname3 | vbillname3 | varchar2(200) |
| 52 | vbillname4 | vbillname4 | vbillname4 | varchar2(200) |
| 53 | vbillname5 | vbillname5 | vbillname5 | varchar2(200) |
| 54 | vbillname6 | vbillname6 | vbillname6 | varchar2(200) |
| 55 | vbiusnessscale | vbiusnessscale | vbiusnessscale | varchar2(50) |
| 56 | vcompanysite | vcompanysite | vcompanysite | varchar2(512) |
| 57 | vcontactphone | vcontactphone | vcontactphone | varchar2(64) |
| 58 | vcontinent | vcontinent | vcontinent | varchar2(50) |
| 59 | vcreditcode | vcreditcode | vcreditcode | varchar2(18) |
| 60 | vdemestic | vdemestic | vdemestic | varchar2(50) |
| 61 | venglishname | venglishname | venglishname | varchar2(512) |
| 62 | venglishshortname | venglishshortname | venglishshortname | varchar2(64) |
| 63 | ventercontactman | ventercontactman | ventercontactman | varchar2(64) |
| 64 | ventermanphone | ventermanphone | ventermanphone | varchar2(64) |
| 65 | venterprisetype | venterprisetype | venterprisetype | varchar2(50) |
| 66 | vfirstcode | vfirstcode | vfirstcode | varchar2(50) |
| 67 | vfirsttrantype | vfirsttrantype | vfirsttrantype | varchar2(20) |
| 68 | vfirsttype | vfirsttype | vfirsttype | varchar2(20) |
| 69 | vlegalrepresent | vlegalrepresent | vlegalrepresent | varchar2(512) |
| 70 | vmail | vmail | vmail | varchar2(512) |
| 71 | vmainbusiness | vmainbusiness | vmainbusiness | varchar2(1024) |
| 72 | vmaininvestor | vmaininvestor | vmaininvestor | varchar2(512) |
| 73 | vmemo | vmemo | vmemo | varchar2(2048) |
| 74 | voperastate | voperastate | voperastate | varchar2(50) |
| 75 | vproinceorgcode | vproinceorgcode | vproinceorgcode | varchar2(50) |
| 76 | vquittype | vquittype | vquittype | varchar2(50) |
| 77 | vregistaddress | vregistaddress | vregistaddress | varchar2(1024) |
| 78 | vreportstate | vreportstate | vreportstate | varchar2(50) |
| 79 | vreserve1 | vreserve1 | vreserve1 | varchar2(100) |
| 80 | vreserve2 | vreserve2 | vreserve2 | varchar2(100) |
| 81 | vreserve3 | vreserve3 | vreserve3 | varchar2(100) |
| 82 | vreserve4 | vreserve4 | vreserve4 | varchar2(100) |
| 83 | vreserve5 | vreserve5 | vreserve5 | varchar2(100) |
| 84 | vreserve6 | vreserve6 | vreserve6 | varchar2(100) |
| 85 | vreserve7 | vreserve7 | vreserve7 | varchar2(100) |
| 86 | vreserve8 | vreserve8 | vreserve8 | varchar2(100) |
| 87 | vreserve9 | vreserve9 | vreserve9 | varchar2(100) |
| 88 | vreserve10 | vreserve10 | vreserve10 | varchar2(100) |
| 89 | vshelltype | vshelltype | vshelltype | varchar2(50) |
| 90 | vsimpshortname | vsimpshortname | vsimpshortname | varchar2(64) |
| 91 | vsrccode | vsrccode | vsrccode | varchar2(50) |
| 92 | vsrctrantype | vsrctrantype | vsrctrantype | varchar2(20) |
| 93 | vsrctype | vsrctype | vsrctype | varchar2(20) |
| 94 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |
| 95 | vunittype | vunittype | vunittype | varchar2(50) |
| 96 | vversionno | vversionno | vversionno | varchar2(50) |
| 97 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 98 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 99 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 100 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 101 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 102 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 103 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 104 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 105 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 106 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 107 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 108 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 109 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 110 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 111 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 112 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 113 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 114 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 115 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 116 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 117 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 118 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 119 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 120 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 121 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 122 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 123 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 124 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 125 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 126 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 127 | vdef31 | vdef31 | vdef31 | varchar2(101) |
| 128 | vdef32 | vdef32 | vdef32 | varchar2(101) |
| 129 | vdef33 | vdef33 | vdef33 | varchar2(101) |
| 130 | vdef34 | vdef34 | vdef34 | varchar2(101) |
| 131 | vdef35 | vdef35 | vdef35 | varchar2(101) |
| 132 | vdef36 | vdef36 | vdef36 | varchar2(101) |
| 133 | vdef37 | vdef37 | vdef37 | varchar2(101) |
| 134 | vdef38 | vdef38 | vdef38 | varchar2(101) |
| 135 | vdef39 | vdef39 | vdef39 | varchar2(101) |
| 136 | vdef40 | vdef40 | vdef40 | varchar2(101) |
| 137 | creationtime | creationtime | creationtime | char(19) |
| 138 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 139 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 140 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 141 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 142 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |