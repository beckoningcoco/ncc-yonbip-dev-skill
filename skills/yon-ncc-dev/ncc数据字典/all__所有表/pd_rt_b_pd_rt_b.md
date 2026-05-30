# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10495.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | crt_bid | crt_bid | crt_bid | char(20) | √ |
| 2 | bboutprocess | bboutprocess | bboutprocess | char(1) |
| 3 | bcheckpoint | bcheckpoint | bcheckpoint | char(1) |
| 4 | bcountpoint | bcountpoint | bcountpoint | char(1) |
| 5 | bhandoverpoint | bhandoverpoint | bhandoverpoint | char(1) |
| 6 | bmainprocess | bmainprocess | bmainprocess | char(1) |
| 7 | cboutvendorid | cboutvendorid | cboutvendorid | varchar2(20) |  |  | '~' |
| 8 | cbpriceassmeasureid | cbpriceassmeasureid | cbpriceassmeasureid | varchar2(20) |  |  | '~' |
| 9 | cbpricemeasureid | cbpricemeasureid | cbpricemeasureid | varchar2(20) |  |  | '~' |
| 10 | crcid | crcid | crcid | varchar2(20) |  |  | '~' |
| 11 | crtid | crtid | crtid | char(20) | √ |
| 12 | cwkid | cwkid | cwkid | varchar2(20) |  |  | '~' |
| 13 | deffectdate | deffectdate | deffectdate | char(19) | √ |
| 14 | dinvaliddate | dinvaliddate | dinvaliddate | char(19) | √ |
| 15 | ndelivertime | ndelivertime | ndelivertime | number(28, 8) |
| 16 | nfixperiodnum | nfixperiodnum | nfixperiodnum | number(28, 8) |
| 17 | nmixdelivernum | nmixdelivernum | nmixdelivernum | number(28, 8) |
| 18 | noverlap | noverlap | noverlap | number(28, 8) |
| 19 | novertype | novertype | novertype | number(38, 0) |
| 20 | npreparetime | npreparetime | npreparetime | number(28, 8) |
| 21 | nremovetime | nremovetime | nremovetime | number(28, 8) |
| 22 | nwaitetime | nwaitetime | nwaitetime | number(28, 8) |
| 23 | nworktime | nworktime | nworktime | number(28, 8) | √ |
| 24 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 25 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 26 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 27 | processmovetype | processmovetype | processmovetype | number(38, 0) |
| 28 | vbpricechangerate | vbpricechangerate | vbpricechangerate | varchar2(60) |
| 29 | vcraftnote | vcraftnote | vcraftnote | varchar2(150) |
| 30 | vgraph | vgraph | vgraph | varchar2(50) |
| 31 | vmergeno | vmergeno | vmergeno | varchar2(10) |
| 32 | vprocessno | vprocessno | vprocessno | varchar2(10) | √ |
| 33 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 34 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 35 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 36 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 37 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 38 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 39 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 40 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 41 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 42 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 43 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 44 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 45 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 46 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 47 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 48 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 49 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 50 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 51 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 52 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 53 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 54 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |