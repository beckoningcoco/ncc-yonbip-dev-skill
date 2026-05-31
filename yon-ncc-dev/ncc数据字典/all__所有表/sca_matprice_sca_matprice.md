# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11409.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_matprice | pk_matprice | pk_matprice | char(20) | √ |
| 2 | accounttype | accounttype | accounttype | number(38, 0) |  |  | 2 |
| 3 | calculatelevel | calculatelevel | calculatelevel | number(38, 0) |
| 4 | cbomid | cbomid | cbomid | varchar2(50) |
| 5 | cbomversion | cbomversion | cbomversion | varchar2(50) |
| 6 | ccostcomponentid | ccostcomponentid | ccostcomponentid | varchar2(20) |  |  | '~' |
| 7 | ccostcompstrucid | ccostcompstrucid | ccostcompstrucid | varchar2(20) |  |  | '~' |
| 8 | ccosttypeid | ccosttypeid | ccosttypeid | varchar2(20) |  |  | '~' |
| 9 | ccustomerid | ccustomerid | ccustomerid | varchar2(20) |  |  | '~' |
| 10 | cffileid | cffileid | cffileid | varchar2(20) |  |  | '~' |
| 11 | cmaterialid | cmaterialid | cmaterialid | varchar2(20) |  |  | '~' |
| 12 | cmaterialvid | cmaterialvid | cmaterialvid | varchar2(20) |  |  | '~' |
| 13 | cmeasdoc | cmeasdoc | cmeasdoc | varchar2(20) |  |  | '~' |
| 14 | convmethod | convmethod | convmethod | number(38, 0) |
| 15 | costdomainid | costdomainid | costdomainid | varchar2(20) |  |  | '~' |
| 16 | cpackversion | cpackversion | cpackversion | varchar2(50) |
| 17 | cperiod | cperiod | cperiod | varchar2(20) |
| 18 | cproductorid | cproductorid | cproductorid | varchar2(20) |  |  | '~' |
| 19 | cprojectid | cprojectid | cprojectid | varchar2(20) |  |  | '~' |
| 20 | craftid | craftid | craftid | varchar2(50) |
| 21 | cvendorid | cvendorid | cvendorid | varchar2(20) |  |  | '~' |
| 22 | effectivedate | effectivedate | effectivedate | char(19) |  |  | '~' |
| 23 | history_name | history_name | history_name | varchar2(50) |
| 24 | initstate | initstate | initstate | char(1) |
| 25 | invaliddate | invaliddate | invaliddate | char(19) |  |  | '~' |
| 26 | issubentry | issubentry | issubentry | char(1) |  |  | 'N' |
| 27 | materialhashkey | materialhashkey | materialhashkey | number(38, 0) |
| 28 | materialinfo | materialinfo | materialinfo | varchar2(1450) |
| 29 | materstate | materstate | materstate | number(38, 0) |
| 30 | normcost | normcost | normcost | number(28, 8) |
| 31 | pk_accbook | pk_accbook | pk_accbook | varchar2(20) |  |  | '~' |
| 32 | pk_convscheme | pk_convscheme | pk_convscheme | varchar2(20) |  |  | '~' |
| 33 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 34 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 35 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 36 | pk_profitcenter | pk_profitcenter | pk_profitcenter | varchar2(20) |  |  | '~' |
| 37 | pk_profitcenter_v | pk_profitcenter_v | pk_profitcenter_v | varchar2(20) |  |  | '~' |
| 38 | pk_setofbook | pk_setofbook | pk_setofbook | varchar2(20) |  |  | '~' |
| 39 | remark | remark | remark | varchar2(200) |
| 40 | rtversion | rtversion | rtversion | varchar2(50) |
| 41 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 42 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 43 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 44 | saga_status | saga_status | saga_status | number(38, 0) |
| 45 | sourcetype | sourcetype | sourcetype | number(38, 0) |
| 46 | thiscost | thiscost | thiscost | number(28, 8) |
| 47 | upcost | upcost | upcost | number(28, 8) |
| 48 | updateversion | updateversion | updateversion | varchar2(50) |
| 49 | def1 | def1 | def1 | varchar2(50) |
| 50 | def2 | def2 | def2 | varchar2(50) |
| 51 | def3 | def3 | def3 | varchar2(50) |
| 52 | def4 | def4 | def4 | varchar2(50) |
| 53 | vfree1 | vfree1 | vfree1 | varchar2(101) |
| 54 | vfree2 | vfree2 | vfree2 | varchar2(101) |
| 55 | vfree3 | vfree3 | vfree3 | varchar2(101) |
| 56 | vfree4 | vfree4 | vfree4 | varchar2(101) |
| 57 | vfree5 | vfree5 | vfree5 | varchar2(101) |
| 58 | vfree6 | vfree6 | vfree6 | varchar2(101) |
| 59 | vfree7 | vfree7 | vfree7 | varchar2(101) |
| 60 | vfree8 | vfree8 | vfree8 | varchar2(101) |
| 61 | vfree9 | vfree9 | vfree9 | varchar2(101) |
| 62 | vfree10 | vfree10 | vfree10 | varchar2(101) |
| 63 | creationtime | creationtime | creationtime | char(19) |
| 64 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 65 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 66 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 67 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 68 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |