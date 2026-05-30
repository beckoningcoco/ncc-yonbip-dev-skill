# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8677.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | pk_psndoc_sub | pk_psndoc_sub | char(20) | √ |
| 2 | assgid | assgid | assgid | number(38, 0) |
| 3 | begindate | begindate | begindate | char(10) | √ |
| 4 | changedate | changedate | changedate | char(10) |
| 5 | cperiod | cperiod | cperiod | char(2) |
| 6 | criterionvalue | criterionvalue | criterionvalue | number(31, 8) |
| 7 | crt_max_value | crt_max_value | crt_max_value | number(31, 8) |
| 8 | crt_min_value | crt_min_value | crt_min_value | number(31, 8) |
| 9 | cyear | cyear | cyear | char(4) |
| 10 | enddate | enddate | enddate | char(10) |
| 11 | iadjustmatter | iadjustmatter | iadjustmatter | number(38, 0) | √ |  | 2 |
| 12 | lastflag | lastflag | lastflag | char(1) | √ |
| 13 | negotiation_wage | negotiation_wage | negotiation_wage | char(1) |  |  | '0' |
| 14 | nmoney | nmoney | nmoney | number(31, 8) | √ |
| 15 | nprobationwage | nprobationwage | nprobationwage | number(31, 8) |  |  | 0 |
| 16 | partflag | partflag | partflag | char(1) |
| 17 | pk_changecause | pk_changecause | pk_changecause | varchar2(20) |
| 18 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 19 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 20 | pk_psndoc | pk_psndoc | pk_psndoc | char(20) |
| 21 | pk_psnjob | pk_psnjob | pk_psnjob | char(20) | √ |
| 22 | pk_wa_crt | pk_wa_crt | pk_wa_crt | varchar2(20) |
| 23 | pk_wa_grd | pk_wa_grd | pk_wa_grd | varchar2(20) |
| 24 | pk_wa_item | pk_wa_item | pk_wa_item | varchar2(20) | √ |
| 25 | pk_wa_prmlv | pk_wa_prmlv | pk_wa_prmlv | varchar2(20) |
| 26 | pk_wa_seclv | pk_wa_seclv | pk_wa_seclv | varchar2(20) |
| 27 | recordnum | recordnum | recordnum | number(38, 0) | √ |
| 28 | vbasefile | vbasefile | vbasefile | varchar2(100) |
| 29 | vnote | vnote | vnote | varchar2(100) |
| 30 | waflag | waflag | waflag | char(1) | √ |  | 'N' |
| 31 | workflowflag | workflowflag | workflowflag | char(1) | √ |  | '0' |
| 32 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 33 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |