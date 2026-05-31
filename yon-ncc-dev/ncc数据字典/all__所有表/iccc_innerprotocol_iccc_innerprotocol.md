# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8992.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_incprotocol_i | pk_incprotocol_i | pk_incprotocol_i | char(20) | √ |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approvenote | approvenote | approvenote | varchar2(1024) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | appusdcdtlnamt | appusdcdtlnamt | appusdcdtlnamt | number(28, 8) |
| 6 | availcdtlnamt | availcdtlnamt | availcdtlnamt | number(28, 8) |
| 7 | begindate | begindate | begindate | char(19) |
| 8 | billmakedate | billmakedate | billmakedate | char(19) |
| 9 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 10 | billmaketime | billmaketime | billmaketime | char(19) |
| 11 | cdtlnamt | cdtlnamt | cdtlnamt | number(28, 8) |
| 12 | ctrlmethod | ctrlmethod | ctrlmethod | number(38, 0) |
| 13 | curusdcdtlnamt | curusdcdtlnamt | curusdcdtlnamt | number(28, 8) |
| 14 | emendenum | emendenum | emendenum | number(38, 0) |
| 15 | enddate | enddate | enddate | char(19) |
| 16 | frozendate | frozendate | frozendate | char(19) |
| 17 | frozener | frozener | frozener | varchar2(20) |  |  | '~' |
| 18 | frozentime | frozentime | frozentime | char(19) |
| 19 | glcappusdcdtlnamt | glcappusdcdtlnamt | glcappusdcdtlnamt | number(28, 8) |
| 20 | glcavailcdtlnamt | glcavailcdtlnamt | glcavailcdtlnamt | number(28, 8) |
| 21 | glccdtlnamt | glccdtlnamt | glccdtlnamt | number(28, 8) |
| 22 | glccurusdcdtlnamt | glccurusdcdtlnamt | glccurusdcdtlnamt | number(28, 8) |
| 23 | glcopnusdcdtlnamt | glcopnusdcdtlnamt | glcopnusdcdtlnamt | number(28, 8) |
| 24 | glcrate | glcrate | glcrate | number(15, 8) |
| 25 | gllcappusdcdtlnamt | gllcappusdcdtlnamt | gllcappusdcdtlnamt | number(28, 8) |
| 26 | gllcavailcdtlnamt | gllcavailcdtlnamt | gllcavailcdtlnamt | number(28, 8) |
| 27 | gllccdtlnamt | gllccdtlnamt | gllccdtlnamt | number(28, 8) |
| 28 | gllccurusdcdtlnamt | gllccurusdcdtlnamt | gllccurusdcdtlnamt | number(28, 8) |
| 29 | gllcopnusdcdtlnamt | gllcopnusdcdtlnamt | gllcopnusdcdtlnamt | number(28, 8) |
| 30 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 31 | initenddate | initenddate | initenddate | char(19) |
| 32 | isdiffcctype | isdiffcctype | isdiffcctype | char(1) |
| 33 | isinherit | isinherit | isinherit | char(1) |
| 34 | olcappusdcdtlnamt | olcappusdcdtlnamt | olcappusdcdtlnamt | number(28, 8) |
| 35 | olcavailcdtlnamt | olcavailcdtlnamt | olcavailcdtlnamt | number(28, 8) |
| 36 | olccdtlnamt | olccdtlnamt | olccdtlnamt | number(28, 8) |
| 37 | olccurusdcdtlnamt | olccurusdcdtlnamt | olccurusdcdtlnamt | number(28, 8) |
| 38 | olcopnusdcdtlnamt | olcopnusdcdtlnamt | olcopnusdcdtlnamt | number(28, 8) |
| 39 | olcrate | olcrate | olcrate | number(15, 8) |
| 40 | opnusdcdtlnamt | opnusdcdtlnamt | opnusdcdtlnamt | number(28, 8) |
| 41 | periodcount | periodcount | periodcount | number(38, 0) |
| 42 | periodunit | periodunit | periodunit | varchar2(50) |
| 43 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |
| 44 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 45 | pk_creditorg | pk_creditorg | pk_creditorg | varchar2(20) |  |  | '~' |
| 46 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 47 | pk_debitorg | pk_debitorg | pk_debitorg | varchar2(20) |  |  | '~' |
| 48 | pk_debitorg_v | pk_debitorg_v | pk_debitorg_v | varchar2(20) |  |  | '~' |
| 49 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 50 | pk_inheritprotocol | pk_inheritprotocol | pk_inheritprotocol | varchar2(20) |  |  | '~' |
| 51 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 52 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 53 | pk_version | pk_version | pk_version | varchar2(20) |
| 54 | protocolcode | protocolcode | protocolcode | varchar2(40) |
| 55 | protocolstatus | protocolstatus | protocolstatus | varchar2(50) |
| 56 | remark | remark | remark | varchar2(181) |
| 57 | terminatedate | terminatedate | terminatedate | char(19) |
| 58 | terminatetime | terminatetime | terminatetime | char(19) |
| 59 | terminator | terminator | terminator | varchar2(20) |  |  | '~' |
| 60 | vbillno | vbillno | vbillno | varchar2(40) |
| 61 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 62 | versionno | versionno | versionno | number(38, 0) |
| 63 | versionorigin | versionorigin | versionorigin | varchar2(50) |
| 64 | versiontime | versiontime | versiontime | char(19) |
| 65 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 66 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 67 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 68 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 69 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 70 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 71 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 72 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 73 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 74 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 75 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 76 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 77 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 78 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 79 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 80 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 81 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 82 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 83 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 84 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 85 | creationtime | creationtime | creationtime | char(19) |
| 86 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 87 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 88 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 89 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 90 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |