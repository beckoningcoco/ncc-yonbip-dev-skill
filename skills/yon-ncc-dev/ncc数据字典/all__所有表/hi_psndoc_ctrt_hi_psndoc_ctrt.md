# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8644.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | pk_psndoc_sub | pk_psndoc_sub | char(20) | √ |
| 2 | assgid | assgid | assgid | number(38, 0) | √ |
| 3 | begindate | begindate | begindate | char(10) |
| 4 | breachmoney | breachmoney | breachmoney | number(28, 8) |
| 5 | contid | contid | contid | number(38, 0) |
| 6 | continuetime | continuetime | continuetime | number(38, 0) |
| 7 | contmodel | contmodel | contmodel | blob |
| 8 | contractcode | contractcode | contractcode | varchar2(42) |
| 9 | contractnum | contractnum | contractnum | varchar2(42) | √ |
| 10 | conttype | conttype | conttype | number(38, 0) | √ |
| 11 | cont_unit | cont_unit | cont_unit | number(38, 0) |
| 12 | enddate | enddate | enddate | char(10) |
| 13 | filepath | filepath | filepath | varchar2(500) |
| 14 | ifprop | ifprop | ifprop | char(1) |
| 15 | ifwrite | ifwrite | ifwrite | char(1) | √ |  | 'N' |
| 16 | isrefer | isrefer | isrefer | char(1) | √ |  | 'N' |
| 17 | judgedate | judgedate | judgedate | char(10) |
| 18 | lastflag | lastflag | lastflag | char(1) | √ |  | 'Y' |
| 19 | memo | memo | memo | varchar2(1500) |
| 20 | neconomy | neconomy | neconomy | number(28, 8) |
| 21 | pk_conttext | pk_conttext | pk_conttext | varchar2(20) |  |  | '~' |
| 22 | pk_group | pk_group | pk_group | char(20) |
| 23 | pk_majorcorp | pk_majorcorp | pk_majorcorp | varchar2(20) |  |  | '~' |
| 24 | pk_org | pk_org | pk_org | char(20) |
| 25 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 26 | pk_psnjob | pk_psnjob | pk_psnjob | varchar2(20) | √ |  | '~' |
| 27 | pk_psnorg | pk_psnorg | pk_psnorg | varchar2(20) | √ |  | '~' |
| 28 | pk_termtype | pk_termtype | pk_termtype | varchar2(20) |  |  | '~' |
| 29 | pk_unchreason | pk_unchreason | pk_unchreason | varchar2(20) |  |  | '~' |
| 30 | presenter | presenter | presenter | number(38, 0) |
| 31 | probegindate | probegindate | probegindate | char(10) |
| 32 | probenddate | probenddate | probenddate | char(10) |
| 33 | probsalary | probsalary | probsalary | number(28, 8) |
| 34 | promonth | promonth | promonth | number(38, 0) |
| 35 | prop_unit | prop_unit | prop_unit | number(38, 0) |
| 36 | recordnum | recordnum | recordnum | number(38, 0) | √ |  | 0 |
| 37 | signaddr | signaddr | signaddr | varchar2(128) |
| 38 | signdate | signdate | signdate | char(10) |
| 39 | startsalary | startsalary | startsalary | number(28, 8) |
| 40 | termmonth | termmonth | termmonth | number(38, 0) |
| 41 | termtype | termtype | termtype | varchar2(30) |
| 42 | creationtime | creationtime | creationtime | char(19) |
| 43 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 44 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 45 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 46 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 47 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |