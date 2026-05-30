# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8832.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_relation_psn | pk_relation_psn | pk_relation_psn | char(20) | √ |
| 2 | assgid | assgid | assgid | number(38, 0) |
| 3 | invite_budprio | invite_budprio | invite_budprio | number(38, 0) |
| 4 | invite_budsource | invite_budsource | invite_budsource | varchar2(20) |
| 5 | invite_budtype | invite_budtype | invite_budtype | varchar2(50) |
| 6 | invite_builder | invite_builder | invite_builder | varchar2(20) |
| 7 | invite_busi | invite_busi | invite_busi | char(1) |
| 8 | ismainjob | ismainjob | ismainjob | char(1) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_hrorg | pk_hrorg | pk_hrorg | varchar2(20) |  |  | '~' |
| 11 | pk_psnjob | pk_psnjob | pk_psnjob | varchar2(20) |  |  | '~' |
| 12 | pk_psnorg | pk_psnorg | pk_psnorg | varchar2(20) |
| 13 | psndoc_budprio | psndoc_budprio | psndoc_budprio | number(38, 0) |
| 14 | psndoc_budtype | psndoc_budtype | psndoc_budtype | varchar2(50) |
| 15 | psndoc_builder | psndoc_builder | psndoc_builder | varchar2(20) |
| 16 | psndoc_busi | psndoc_busi | psndoc_busi | char(1) |
| 17 | psnpact_budprio | psnpact_budprio | psnpact_budprio | number(38, 0) |
| 18 | psnpact_budtype | psnpact_budtype | psnpact_budtype | varchar2(50) |
| 19 | psnpact_builder | psnpact_builder | psnpact_builder | varchar2(20) |
| 20 | psnpact_busi | psnpact_busi | psnpact_busi | char(1) |
| 21 | psnpe_budprio | psnpe_budprio | psnpe_budprio | number(38, 0) |
| 22 | psnpe_budtype | psnpe_budtype | psnpe_budtype | varchar2(50) |
| 23 | psnpe_builder | psnpe_builder | psnpe_builder | varchar2(20) |
| 24 | psnpe_busi | psnpe_busi | psnpe_busi | char(1) |
| 25 | salary_budprio | salary_budprio | salary_budprio | number(38, 0) |
| 26 | salary_budtype | salary_budtype | salary_budtype | varchar2(50) |
| 27 | salary_builder | salary_builder | salary_builder | varchar2(20) |
| 28 | salary_busi | salary_busi | salary_busi | char(1) |
| 29 | timemng_budprio | timemng_budprio | timemng_budprio | number(38, 0) |
| 30 | timemng_budtype | timemng_budtype | timemng_budtype | varchar2(50) |
| 31 | timemng_builder | timemng_builder | timemng_builder | varchar2(20) |
| 32 | timemng_busi | timemng_busi | timemng_busi | char(1) |
| 33 | training_budprio | training_budprio | training_budprio | number(38, 0) |
| 34 | training_budtype | training_budtype | training_budtype | varchar2(50) |
| 35 | training_builder | training_builder | training_builder | varchar2(20) |
| 36 | training_busi | training_busi | training_busi | char(1) |
| 37 | creationtime | creationtime | creationtime | char(19) |
| 38 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 39 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 40 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 41 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 42 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |