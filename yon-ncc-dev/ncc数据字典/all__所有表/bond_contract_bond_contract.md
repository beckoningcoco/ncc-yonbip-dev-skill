# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7370.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bondcontract | pk_bondcontract | pk_bondcontract | char(20) | √ |
| 2 | applycode | applycode | applycode | varchar2(20) |  |  | '~' |
| 3 | approvedissuemode | approvedissuemode | approvedissuemode | varchar2(50) |
| 4 | approvedissueorg | approvedissueorg | approvedissueorg | varchar2(50) |
| 5 | approvenote | approvenote | approvenote | varchar2(50) |
| 6 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 7 | autoenddate | autoenddate | autoenddate | char(19) |
| 8 | billmakedate | billmakedate | billmakedate | char(19) |
| 9 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 10 | billmaketime | billmaketime | billmaketime | char(19) |
| 11 | bondcontractno | bondcontractno | bondcontractno | varchar2(200) |
| 12 | bonddesc | bonddesc | bonddesc | varchar2(200) |
| 13 | bookkeeperid | bookkeeperid | bookkeeperid | varchar2(20) |  |  | '~' |
| 14 | busistatus | busistatus | busistatus | number(38, 0) |
| 15 | circulatequota | circulatequota | circulatequota | char(1) |
| 16 | commiter | commiter | commiter | varchar2(20) |  |  | '~' |
| 17 | committime | committime | committime | char(19) |
| 18 | costgllmny | costgllmny | costgllmny | number(28, 8) |
| 19 | costglmny | costglmny | costglmny | number(28, 8) |
| 20 | costmny | costmny | costmny | number(28, 8) |
| 21 | costolmny | costolmny | costolmny | number(28, 8) |
| 22 | creditagreementid | creditagreementid | creditagreementid | varchar2(20) |  |  | '~' |
| 23 | creditcurrency | creditcurrency | creditcurrency | varchar2(20) |  |  | '~' |
| 24 | creditgrade | creditgrade | creditgrade | varchar2(50) |
| 25 | creditmessage | creditmessage | creditmessage | varchar2(500) |
| 26 | creditoccupy | creditoccupy | creditoccupy | number(28, 8) |
| 27 | creditorg | creditorg | creditorg | varchar2(20) |  |  | '~' |
| 28 | credittype | credittype | credittype | varchar2(20) |  |  | '~' |
| 29 | dapprovedate | dapprovedate | dapprovedate | char(19) |
| 30 | directordept | directordept | directordept | varchar2(50) |
| 31 | duration | duration | duration | number(38, 0) |
| 32 | durationunit | durationunit | durationunit | varchar2(50) |
| 33 | evaluateorg | evaluateorg | evaluateorg | varchar2(200) |
| 34 | glccreditoccupy | glccreditoccupy | glccreditoccupy | number(28, 8) |
| 35 | glcrate | glcrate | glcrate | number(28, 8) |
| 36 | glcregistmny | glcregistmny | glcregistmny | number(28, 8) |
| 37 | gllccreditoccupy | gllccreditoccupy | gllccreditoccupy | number(28, 8) |
| 38 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 39 | gllregistmny | gllregistmny | gllregistmny | number(28, 8) |
| 40 | guaranteetype | guaranteetype | guaranteetype | varchar2(50) |
| 41 | iscreditrelease | iscreditrelease | iscreditrelease | char(1) |
| 42 | isguaranteerelease | isguaranteerelease | isguaranteerelease | char(1) |
| 43 | isinitial | isinitial | isinitial | char(1) |
| 44 | issueenddate | issueenddate | issueenddate | char(19) |
| 45 | issuemode | issuemode | issuemode | varchar2(50) |
| 46 | issuerid | issuerid | issuerid | varchar2(50) |  |  | '~' |
| 47 | issuestartdate | issuestartdate | issuestartdate | char(19) |
| 48 | lccreditoccupy | lccreditoccupy | lccreditoccupy | number(28, 8) |
| 49 | olcrate | olcrate | olcrate | number(28, 8) |
| 50 | olcregistmny | olcregistmny | olcregistmny | number(28, 8) |
| 51 | olcunissuemny | olcunissuemny | olcunissuemny | number(28, 8) |
| 52 | originalid | originalid | originalid | varchar2(200) |
| 53 | periodloan | periodloan | periodloan | varchar2(50) |
| 54 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 55 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(50) |
| 56 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 57 | pk_finvariety | pk_finvariety | pk_finvariety | varchar2(20) |  |  | '~' |
| 58 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 59 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 60 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 61 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 62 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 63 | pk_srcbilltypeid | pk_srcbilltypeid | pk_srcbilltypeid | varchar2(50) |
| 64 | pk_version | pk_version | pk_version | varchar2(20) |  |  | '~' |
| 65 | registmny | registmny | registmny | number(28, 8) |
| 66 | remark | remark | remark | varchar2(200) |
| 67 | signbilltype | signbilltype | signbilltype | varchar2(200) |
| 68 | signdata | signdata | signdata | varchar2(200) |
| 69 | signupfileno | signupfileno | signupfileno | varchar2(200) |
| 70 | signuserid | signuserid | signuserid | varchar2(200) |
| 71 | sourcesystypecode | sourcesystypecode | sourcesystypecode | varchar2(50) |
| 72 | srcbillno | srcbillno | srcbillno | varchar2(50) |
| 73 | summary | summary | summary | varchar2(200) |
| 74 | underwritmode | underwritmode | underwritmode | varchar2(50) |
| 75 | unissuemny | unissuemny | unissuemny | number(28, 8) |
| 76 | vbillno | vbillno | vbillno | varchar2(50) |
| 77 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 78 | versiondate | versiondate | versiondate | char(19) |
| 79 | versioner | versioner | versioner | varchar2(20) |  |  | '~' |
| 80 | versionmark | versionmark | versionmark | varchar2(100) |
| 81 | versionno | versionno | versionno | number(38, 0) |
| 82 | versionorigin | versionorigin | versionorigin | varchar2(50) |
| 83 | versiontime | versiontime | versiontime | char(19) |
| 84 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 85 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 86 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 87 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 88 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 89 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 90 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 91 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 92 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 93 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 94 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 95 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 96 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 97 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 98 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 99 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 100 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 101 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 102 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 103 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 104 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 105 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 106 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 107 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 108 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 109 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 110 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 111 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 112 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 113 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 114 | creationtime | creationtime | creationtime | char(19) |
| 115 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 116 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 117 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 118 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 119 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |