# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8673.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | pk_psndoc_sub | pk_psndoc_sub | char(20) | √ |
| 2 | absence_count | absence_count | absence_count | number(38, 0) |
| 3 | activetype | activetype | activetype | number(38, 0) |
| 4 | act_code | act_code | act_code | varchar2(50) |
| 5 | act_name | act_name | act_name | varchar2(300) |
| 6 | act_name2 | act_name2 | act_name2 | varchar2(300) |
| 7 | act_name3 | act_name3 | act_name3 | varchar2(300) |
| 8 | act_name4 | act_name4 | act_name4 | varchar2(300) |
| 9 | act_name5 | act_name5 | act_name5 | varchar2(300) |
| 10 | act_name6 | act_name6 | act_name6 | varchar2(300) |
| 11 | assist_unit | assist_unit | assist_unit | varchar2(384) |
| 12 | ass_option | ass_option | ass_option | varchar2(768) |
| 13 | ass_result | ass_result | ass_result | number(28, 8) |
| 14 | begindate | begindate | begindate | char(10) |
| 15 | certificate_date | certificate_date | certificate_date | char(10) |
| 16 | certificate_unit | certificate_unit | certificate_unit | varchar2(192) |
| 17 | contcode | contcode | contcode | varchar2(28) |
| 18 | enddate | enddate | enddate | char(10) |
| 19 | entrepreneur | entrepreneur | entrepreneur | varchar2(384) |
| 20 | isallduty | isallduty | isallduty | char(1) |
| 21 | lastflag | lastflag | lastflag | char(1) |
| 22 | memo | memo | memo | varchar2(1500) |
| 23 | pk_act | pk_act | pk_act | varchar2(20) |
| 24 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 25 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 26 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 27 | pk_psnjob | pk_psnjob | pk_psnjob | varchar2(20) |
| 28 | pk_psnorg | pk_psnorg | pk_psnorg | varchar2(20) |
| 29 | pk_trmagreement | pk_trmagreement | pk_trmagreement | varchar2(20) |
| 30 | purveyor | purveyor | purveyor | varchar2(384) |
| 31 | recordnum | recordnum | recordnum | number(38, 0) |
| 32 | signon_dt | signon_dt | signon_dt | char(10) |
| 33 | source_type | source_type | source_type | number(38, 0) |
| 34 | taketrm_method | taketrm_method | taketrm_method | number(38, 0) |
| 35 | traim | traim | traim | varchar2(256) |
| 36 | trainorg | trainorg | trainorg | varchar2(256) |
| 37 | tra_content | tra_content | tra_content | varchar2(1536) |
| 38 | tra_cost | tra_cost | tra_cost | number(28, 8) |
| 39 | tra_mode | tra_mode | tra_mode | varchar2(20) |  |  | '~' |
| 40 | tra_result | tra_result | tra_result | varchar2(128) |
| 41 | tra_time | tra_time | tra_time | number(28, 8) |
| 42 | tra_type | tra_type | tra_type | varchar2(20) |  |  | '~' |
| 43 | trm_certif_code | trm_certif_code | trm_certif_code | varchar2(128) |
| 44 | trm_certif_name | trm_certif_name | trm_certif_name | varchar2(128) |
| 45 | trm_location | trm_location | trm_location | varchar2(192) |
| 46 | creationtime | creationtime | creationtime | char(19) |
| 47 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 48 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 49 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 50 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 51 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |