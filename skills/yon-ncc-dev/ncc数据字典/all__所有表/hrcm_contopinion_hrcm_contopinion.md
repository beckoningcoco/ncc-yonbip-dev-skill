# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8741.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_opinion | pk_opinion | pk_opinion | char(20) | √ |
| 2 | contopinion_unit | contopinion_unit | contopinion_unit | number(38, 0) |
| 3 | conttype | conttype | conttype | number(38, 0) |
| 4 | deptdirection | deptdirection | deptdirection | varchar2(1536) |
| 5 | deptopinion | deptopinion | deptopinion | char(1) |
| 6 | hropinion | hropinion | hropinion | char(1) |
| 7 | issendsuccess | issendsuccess | issendsuccess | char(1) |
| 8 | itermmonth | itermmonth | itermmonth | number(38, 0) |
| 9 | opdate | opdate | opdate | char(19) |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_psndoc_sub | pk_psndoc_sub | pk_psndoc_sub | char(20) | √ |
| 13 | pk_psnjob | pk_psnjob | pk_psnjob | varchar2(20) | √ |  | '~' |
| 14 | pk_termtype | pk_termtype | pk_termtype | varchar2(20) |  |  | '~' |
| 15 | psndirection | psndirection | psndirection | varchar2(1536) |
| 16 | psnopinion | psnopinion | psnopinion | char(1) |
| 17 | sedenddate | sedenddate | sedenddate | char(10) |
| 18 | termtype | termtype | termtype | varchar2(20) |
| 19 | creationtime | creationtime | creationtime | char(19) |
| 20 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 23 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |