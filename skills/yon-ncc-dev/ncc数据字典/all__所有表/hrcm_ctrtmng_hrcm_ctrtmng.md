# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8743.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ctrtmng | pk_ctrtmng | pk_ctrtmng | char(20) | √ |
| 2 | apply_date | apply_date | apply_date | char(10) |
| 3 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 4 | approve_note | approve_note | approve_note | varchar2(50) |
| 5 | approve_state | approve_state | approve_state | number(38, 0) |
| 6 | approve_time | approve_time | approve_time | char(19) |
| 7 | assgid | assgid | assgid | number(38, 0) |
| 8 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 9 | bill_code | bill_code | bill_code | varchar2(28) |
| 10 | business_type | business_type | business_type | varchar2(20) |  |  | '~' |
| 11 | ctrticon | ctrticon | ctrticon | blob |
| 12 | newbegindate | newbegindate | newbegindate | char(10) |
| 13 | newbreachmoney | newbreachmoney | newbreachmoney | number(15, 2) |
| 14 | newcontractcode | newcontractcode | newcontractcode | varchar2(50) |
| 15 | newcontractnum | newcontractnum | newcontractnum | varchar2(50) |
| 16 | newconttype | newconttype | newconttype | number(38, 0) |
| 17 | newcont_unit | newcont_unit | newcont_unit | number(38, 0) |
| 18 | newenddate | newenddate | newenddate | char(10) |
| 19 | newifprop | newifprop | newifprop | char(1) |
| 20 | newjudgedate | newjudgedate | newjudgedate | char(10) |
| 21 | newmemo | newmemo | newmemo | varchar2(200) |
| 22 | newneconomy | newneconomy | newneconomy | number(15, 2) |
| 23 | newpk_conttext | newpk_conttext | newpk_conttext | varchar2(20) |  |  | '~' |
| 24 | newpk_majorcorp | newpk_majorcorp | newpk_majorcorp | varchar2(20) |  |  | '~' |
| 25 | newpk_unchreason | newpk_unchreason | newpk_unchreason | varchar2(20) |  |  | '~' |
| 26 | newpresenter | newpresenter | newpresenter | number(38, 0) |
| 27 | newprobegindate | newprobegindate | newprobegindate | char(10) |
| 28 | newprobenddate | newprobenddate | newprobenddate | char(10) |
| 29 | newprobsalary | newprobsalary | newprobsalary | number(15, 2) |
| 30 | newpromonth | newpromonth | newpromonth | number(38, 0) |
| 31 | newprop_unit | newprop_unit | newprop_unit | number(38, 0) |
| 32 | newsignaddr | newsignaddr | newsignaddr | varchar2(50) |
| 33 | newsigndate | newsigndate | newsigndate | char(10) |
| 34 | newstartsalary | newstartsalary | newstartsalary | number(15, 2) |
| 35 | newtermmonth | newtermmonth | newtermmonth | number(38, 0) |
| 36 | newtermtype | newtermtype | newtermtype | varchar2(50) |
| 37 | oldbegindate | oldbegindate | oldbegindate | char(10) |
| 38 | oldbreachmoney | oldbreachmoney | oldbreachmoney | number(15, 2) |
| 39 | oldcontractcode | oldcontractcode | oldcontractcode | varchar2(50) |
| 40 | oldcontractnum | oldcontractnum | oldcontractnum | varchar2(50) |
| 41 | oldconttype | oldconttype | oldconttype | number(38, 0) |
| 42 | oldcont_unit | oldcont_unit | oldcont_unit | number(38, 0) |
| 43 | oldenddate | oldenddate | oldenddate | char(10) |
| 44 | oldifprop | oldifprop | oldifprop | char(1) |
| 45 | oldjudgedate | oldjudgedate | oldjudgedate | char(10) |
| 46 | oldmemo | oldmemo | oldmemo | varchar2(200) |
| 47 | oldneconomy | oldneconomy | oldneconomy | varchar2(50) |
| 48 | oldpk_conttext | oldpk_conttext | oldpk_conttext | varchar2(20) |  |  | '~' |
| 49 | oldpk_majorcorp | oldpk_majorcorp | oldpk_majorcorp | varchar2(20) |  |  | '~' |
| 50 | oldpk_unchreason | oldpk_unchreason | oldpk_unchreason | varchar2(20) |  |  | '~' |
| 51 | oldpresenter | oldpresenter | oldpresenter | number(38, 0) |
| 52 | oldprobegindate | oldprobegindate | oldprobegindate | char(10) |
| 53 | oldprobenddate | oldprobenddate | oldprobenddate | char(10) |
| 54 | oldprobsalary | oldprobsalary | oldprobsalary | number(15, 2) |
| 55 | oldpromonth | oldpromonth | oldpromonth | number(38, 0) |
| 56 | oldprop_unit | oldprop_unit | oldprop_unit | number(38, 0) |
| 57 | oldsignaddr | oldsignaddr | oldsignaddr | varchar2(50) |
| 58 | oldsigndate | oldsigndate | oldsigndate | char(10) |
| 59 | oldstartsalary | oldstartsalary | oldstartsalary | number(15, 2) |
| 60 | oldtermmonth | oldtermmonth | oldtermmonth | number(38, 0) |
| 61 | oldtermtype | oldtermtype | oldtermtype | varchar2(50) |
| 62 | pk_billtype | pk_billtype | pk_billtype | varchar2(50) |  |  | '~' |
| 63 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 64 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 65 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 66 | pk_psndoc_sub | pk_psndoc_sub | pk_psndoc_sub | char(20) |
| 67 | pk_psnjob | pk_psnjob | pk_psnjob | varchar2(20) |  |  | '~' |
| 68 | pk_psnorg | pk_psnorg | pk_psnorg | char(20) |
| 69 | signtype | signtype | signtype | number(38, 0) |
| 70 | sign_state | sign_state | sign_state | number(38, 0) |
| 71 | transtype | transtype | transtype | varchar2(50) |
| 72 | transtypeid | transtypeid | transtypeid | varchar2(20) |  |  | '~' |
| 73 | creationtime | creationtime | creationtime | char(19) |
| 74 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 75 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 76 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 77 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 78 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |