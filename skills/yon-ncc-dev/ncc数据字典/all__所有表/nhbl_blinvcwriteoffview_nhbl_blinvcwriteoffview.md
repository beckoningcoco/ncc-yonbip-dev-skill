# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9996.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invwriteoffiss | pk_invwriteoffiss | pk_invwriteoffiss | char(20) | √ |
| 2 | amt_vorcher | amt_vorcher | amt_vorcher | number(14, 2) |
| 3 | date_canc | date_canc | date_canc | char(19) |
| 4 | date_chk | date_chk | date_chk | char(19) |
| 5 | date_invwriteoff | date_invwriteoff | date_invwriteoff | char(19) |
| 6 | eu_invwriteoff | eu_invwriteoff | eu_invwriteoff | number(38, 0) |
| 7 | eu_status | eu_status | eu_status | number(38, 0) |
| 8 | invnos_canc | invnos_canc | invnos_canc | varchar2(4000) |
| 9 | invno_begin | invno_begin | invno_begin | varchar2(50) |
| 10 | invno_end | invno_end | invno_end | varchar2(50) |
| 11 | note | note | note | varchar2(256) |
| 12 | no_vorcher | no_vorcher | no_vorcher | varchar2(50) |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_invcate | pk_invcate | pk_invcate | varchar2(20) |  |  | '~' |
| 15 | pk_invisspk | pk_invisspk | pk_invisspk | varchar2(20) |  |  | '~' |
| 16 | pk_invwriteoff | pk_invwriteoff | pk_invwriteoff | char(20) |  |  | '~' |
| 17 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 18 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 19 | pk_psn_canc | pk_psn_canc | pk_psn_canc | varchar2(20) |  |  | '~' |
| 20 | pk_psn_chk | pk_psn_chk | pk_psn_chk | varchar2(20) |  |  | '~' |
| 21 | pk_psn_invwriteoff | pk_psn_invwriteoff | pk_psn_invwriteoff | varchar2(20) |  |  | '~' |
| 22 | creationtime | creationtime | creationtime | char(19) |
| 23 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 26 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |