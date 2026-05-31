# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12401.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invregpk | pk_invregpk | pk_invregpk | char(20) | √ |
| 2 | code_invreg | code_invreg | code_invreg | varchar2(50) |
| 3 | eu_status | eu_status | eu_status | number(38, 0) |
| 4 | falg_iss | falg_iss | falg_iss | char(1) |
| 5 | invcn | invcn | invcn | number(38, 0) |
| 6 | invcn_canc | invcn_canc | invcn_canc | number(38, 0) |
| 7 | invcn_iss | invcn_iss | invcn_iss | number(38, 0) |
| 8 | invcn_iss_able | invcn_iss_able | invcn_iss_able | number(38, 0) |
| 9 | invcn_ret | invcn_ret | invcn_ret | number(38, 0) |
| 10 | num_begin | num_begin | num_begin | varchar2(50) |
| 11 | num_begin_iss | num_begin_iss | num_begin_iss | varchar2(50) |
| 12 | num_end | num_end | num_end | varchar2(50) |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_invissd_ret | pk_invissd_ret | pk_invissd_ret | varchar2(50) |
| 15 | pk_invreg | pk_invreg | pk_invreg | varchar2(20) |  |  | '~' |
| 16 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 17 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |