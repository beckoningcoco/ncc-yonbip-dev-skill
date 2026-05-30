# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10492.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | crttemplate_bid | crttemplate_bid | crttemplate_bid | char(20) | √ |
| 2 | bcheckpoint | bcheckpoint | bcheckpoint | char(1) |  |  | 'N' |
| 3 | bcountpoint | bcountpoint | bcountpoint | char(1) |  |  | 'N' |
| 4 | bhandoverpoint | bhandoverpoint | bhandoverpoint | char(1) |  |  | 'N' |
| 5 | bmainprocess | bmainprocess | bmainprocess | char(1) |  |  | 'N' |
| 6 | crcid | crcid | crcid | varchar2(20) |  |  | '~' |
| 7 | crttemplateid | crttemplateid | crttemplateid | char(20) | √ |
| 8 | cwkid | cwkid | cwkid | varchar2(20) |  |  | '~' |
| 9 | deffectdate | deffectdate | deffectdate | char(19) |
| 10 | dinvaliddate | dinvaliddate | dinvaliddate | char(19) |
| 11 | ndelivertime | ndelivertime | ndelivertime | number(20, 8) |
| 12 | nmixdelivernum | nmixdelivernum | nmixdelivernum | number(28, 8) |
| 13 | noverlap | noverlap | noverlap | number(20, 8) |
| 14 | novertype | novertype | novertype | number(38, 0) |
| 15 | npreparetime | npreparetime | npreparetime | number(20, 8) |
| 16 | nremovetime | nremovetime | nremovetime | number(20, 8) |
| 17 | nwaitetime | nwaitetime | nwaitetime | number(20, 8) |
| 18 | nworktime | nworktime | nworktime | number(20, 8) | √ |
| 19 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 20 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 21 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 22 | vcraftnote | vcraftnote | vcraftnote | varchar2(150) |
| 23 | vmergeno | vmergeno | vmergeno | varchar2(10) |
| 24 | vnote | vnote | vnote | varchar2(181) |
| 25 | vprocessno | vprocessno | vprocessno | varchar2(50) | √ |
| 26 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 27 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 28 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 29 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 30 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 31 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 32 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 33 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 34 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 35 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 36 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 37 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 38 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 39 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 40 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 41 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 42 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 43 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 44 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 45 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 46 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 47 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |