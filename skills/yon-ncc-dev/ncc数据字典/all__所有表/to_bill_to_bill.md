# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12177.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbillid | cbillid | cbillid | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 4 | bioreverseflag | bioreverseflag | bioreverseflag | char(1) |
| 5 | blatestflag | blatestflag | blatestflag | char(1) |
| 6 | botreverseflag | botreverseflag | botreverseflag | char(1) |
| 7 | btriatradeflag | btriatradeflag | btriatradeflag | char(1) |
| 8 | bunilateralflag | bunilateralflag | bunilateralflag | char(1) |
| 9 | cbiztypeid | cbiztypeid | cbiztypeid | varchar2(20) |  |  | '~' |
| 10 | ccurrencyid | ccurrencyid | ccurrencyid | varchar2(20) |  |  | '~' |
| 11 | cincountryid | cincountryid | cincountryid | varchar2(20) |
| 12 | cinfinanceorgid | cinfinanceorgid | cinfinanceorgid | varchar2(20) |  |  | '~' |
| 13 | cinfinanceorgvid | cinfinanceorgvid | cinfinanceorgvid | varchar2(20) |  |  | '~' |
| 14 | cinstockorgid | cinstockorgid | cinstockorgid | varchar2(20) |  |  | '~' |
| 15 | cinstockorgvid | cinstockorgvid | cinstockorgvid | varchar2(20) |  |  | '~' |
| 16 | conwayownerorgid | conwayownerorgid | conwayownerorgid | char(20) |
| 17 | corigbillid | corigbillid | corigbillid | char(20) |
| 18 | corigcurrencyid | corigcurrencyid | corigcurrencyid | varchar2(20) |  |  | '~' |
| 19 | coutcountryid | coutcountryid | coutcountryid | varchar2(20) |
| 20 | coutdeptid | coutdeptid | coutdeptid | varchar2(20) |  |  | '~' |
| 21 | coutdeptvid | coutdeptvid | coutdeptvid | varchar2(20) |  |  | '~' |
| 22 | coutfinanceorgid | coutfinanceorgid | coutfinanceorgid | varchar2(20) |  |  | '~' |
| 23 | coutfinanceorgvid | coutfinanceorgvid | coutfinanceorgvid | varchar2(20) |  |  | '~' |
| 24 | coutpsnid | coutpsnid | coutpsnid | varchar2(20) |  |  | '~' |
| 25 | creviser | creviser | creviser | varchar2(20) |  |  | '~' |
| 26 | csettlepathid | csettlepathid | csettlepathid | varchar2(20) |  |  | '~' |
| 27 | csrcmodulecode | csrcmodulecode | csrcmodulecode | varchar2(10) |
| 28 | ctaxcountryid | ctaxcountryid | ctaxcountryid | varchar2(20) |
| 29 | ctoutcountryid | ctoutcountryid | ctoutcountryid | varchar2(20) |
| 30 | ctoutdeptid | ctoutdeptid | ctoutdeptid | varchar2(20) |  |  | '~' |
| 31 | ctoutdeptvid | ctoutdeptvid | ctoutdeptvid | varchar2(20) |  |  | '~' |
| 32 | ctoutfinanceorgid | ctoutfinanceorgid | ctoutfinanceorgid | varchar2(20) |  |  | '~' |
| 33 | ctoutfinanceorgvid | ctoutfinanceorgvid | ctoutfinanceorgvid | varchar2(20) |  |  | '~' |
| 34 | ctoutpsnid | ctoutpsnid | ctoutpsnid | varchar2(20) |  |  | '~' |
| 35 | ctoutstockorgid | ctoutstockorgid | ctoutstockorgid | varchar2(20) |  |  | '~' |
| 36 | ctoutstockorgvid | ctoutstockorgvid | ctoutstockorgvid | varchar2(20) |  |  | '~' |
| 37 | ctradewordid | ctradewordid | ctradewordid | varchar2(20) |
| 38 | ctrantypeid | ctrantypeid | ctrantypeid | varchar2(20) |
| 39 | dbilldate | dbilldate | dbilldate | char(19) |
| 40 | dmakedate | dmakedate | dmakedate | char(19) |
| 41 | fbuysellflag | fbuysellflag | fbuysellflag | number(38, 0) |
| 42 | fioonwayownerflag | fioonwayownerflag | fioonwayownerflag | number(38, 0) | √ |  | 1 |
| 43 | fmodeflag | fmodeflag | fmodeflag | number(38, 0) |
| 44 | fotonwayownerflag | fotonwayownerflag | fotonwayownerflag | number(38, 0) | √ |  | 1 |
| 45 | fstatusflag | fstatusflag | fstatusflag | number(38, 0) | √ |  | 1 |
| 46 | iprintcount | iprintcount | iprintcount | number(38, 0) |
| 47 | iversion | iversion | iversion | number(38, 0) |
| 48 | nexchangerate | nexchangerate | nexchangerate | number(28, 8) |
| 49 | nglobalexchgrate | nglobalexchgrate | nglobalexchgrate | number(28, 8) |
| 50 | ngroupexchgrate | ngroupexchgrate | ngroupexchgrate | number(28, 8) |
| 51 | ntotalastnum | ntotalastnum | ntotalastnum | number(28, 8) |
| 52 | ntotalorigmny | ntotalorigmny | ntotalorigmny | number(28, 8) |
| 53 | ntotalpiece | ntotalpiece | ntotalpiece | number(28, 8) |
| 54 | ntotalvolume | ntotalvolume | ntotalvolume | number(28, 8) |
| 55 | ntotalweight | ntotalweight | ntotalweight | number(28, 8) |
| 56 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 57 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 58 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 59 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |  |  | '~' |
| 60 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 61 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |  |  | '~' |
| 62 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 63 | taudittime | taudittime | taudittime | varchar2(19) |
| 64 | trevisetime | trevisetime | trevisetime | varchar2(19) |
| 65 | vbillcode | vbillcode | vbillcode | varchar2(40) |
| 66 | vnote | vnote | vnote | varchar2(181) |
| 67 | vrevisereason | vrevisereason | vrevisereason | varchar2(181) |
| 68 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |  |  | '~' |
| 69 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 70 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 71 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 72 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 73 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 74 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 75 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 76 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 77 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 78 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 79 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 80 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 81 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 82 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 83 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 84 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 85 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 86 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 87 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 88 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 89 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 90 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 91 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 92 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 93 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 94 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 95 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 96 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 97 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 98 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 99 | vdef31 | vdef31 | vdef31 | varchar2(101) |
| 100 | vdef32 | vdef32 | vdef32 | varchar2(101) |
| 101 | vdef33 | vdef33 | vdef33 | varchar2(101) |
| 102 | vdef34 | vdef34 | vdef34 | varchar2(101) |
| 103 | vdef35 | vdef35 | vdef35 | varchar2(101) |
| 104 | vdef36 | vdef36 | vdef36 | varchar2(101) |
| 105 | vdef37 | vdef37 | vdef37 | varchar2(101) |
| 106 | vdef38 | vdef38 | vdef38 | varchar2(101) |
| 107 | vdef39 | vdef39 | vdef39 | varchar2(101) |
| 108 | vdef40 | vdef40 | vdef40 | varchar2(101) |
| 109 | vdef41 | vdef41 | vdef41 | varchar2(101) |
| 110 | vdef42 | vdef42 | vdef42 | varchar2(101) |
| 111 | vdef43 | vdef43 | vdef43 | varchar2(101) |
| 112 | vdef44 | vdef44 | vdef44 | varchar2(101) |
| 113 | vdef45 | vdef45 | vdef45 | varchar2(101) |
| 114 | vdef46 | vdef46 | vdef46 | varchar2(101) |
| 115 | vdef47 | vdef47 | vdef47 | varchar2(101) |
| 116 | vdef48 | vdef48 | vdef48 | varchar2(101) |
| 117 | vdef49 | vdef49 | vdef49 | varchar2(101) |
| 118 | vdef50 | vdef50 | vdef50 | varchar2(101) |
| 119 | creationtime | creationtime | creationtime | char(19) |
| 120 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 121 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 122 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 123 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 124 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |