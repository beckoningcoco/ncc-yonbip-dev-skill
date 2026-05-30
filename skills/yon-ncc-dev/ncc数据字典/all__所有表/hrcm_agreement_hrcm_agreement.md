# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8739.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_agreement | pk_agreement | pk_agreement | char(20) | √ |
| 2 | agreementcode | agreementcode | agreementcode | varchar2(28) |
| 3 | agreementid | agreementid | agreementid | number(38, 0) |
| 4 | agreementtype | agreementtype | agreementtype | varchar2(50) |
| 5 | agreement_unit | agreement_unit | agreement_unit | number(38, 0) |
| 6 | assgid | assgid | assgid | number(38, 0) | √ |
| 7 | begindate | begindate | begindate | char(10) |
| 8 | breachmoney | breachmoney | breachmoney | number(28, 8) |
| 9 | contcode | contcode | contcode | varchar2(42) |
| 10 | conttype | conttype | conttype | number(38, 0) | √ |
| 11 | enddate | enddate | enddate | char(10) |
| 12 | ifprop | ifprop | ifprop | char(1) |
| 13 | isrefer | isrefer | isrefer | char(1) | √ |
| 14 | lastflag | lastflag | lastflag | char(1) | √ |
| 15 | memo | memo | memo | varchar2(2250) |
| 16 | neconomy | neconomy | neconomy | number(28, 8) |
| 17 | ntrmoney | ntrmoney | ntrmoney | number(28, 8) |
| 18 | ntrpsnmoney | ntrpsnmoney | ntrpsnmoney | number(28, 8) |
| 19 | paymethod | paymethod | paymethod | varchar2(128) |
| 20 | pk_conttext | pk_conttext | pk_conttext | varchar2(20) |
| 21 | pk_group | pk_group | pk_group | varchar2(20) |
| 22 | pk_majorcorp | pk_majorcorp | pk_majorcorp | varchar2(20) |
| 23 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 24 | pk_post | pk_post | pk_post | varchar2(300) |
| 25 | pk_post_org | pk_post_org | pk_post_org | varchar2(20) |
| 26 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |
| 27 | pk_psnjob | pk_psnjob | pk_psnjob | varchar2(20) | √ |
| 28 | pk_psnorg | pk_psnorg | pk_psnorg | varchar2(20) | √ |
| 29 | pk_train | pk_train | pk_train | char(20) |
| 30 | pk_unchreason | pk_unchreason | pk_unchreason | varchar2(20) |
| 31 | probegindate | probegindate | probegindate | char(10) |
| 32 | probenddate | probenddate | probenddate | char(10) |
| 33 | probmonth | probmonth | probmonth | number(38, 0) |
| 34 | probsalary | probsalary | probsalary | number(28, 8) |
| 35 | prop_unit | prop_unit | prop_unit | number(38, 0) |
| 36 | serviceyear | serviceyear | serviceyear | number(38, 0) |
| 37 | signaddr | signaddr | signaddr | varchar2(150) |
| 38 | signdate | signdate | signdate | char(10) |
| 39 | startsalary | startsalary | startsalary | number(28, 8) |
| 40 | termmonth | termmonth | termmonth | number(38, 0) |
| 41 | trainaddr | trainaddr | trainaddr | varchar2(512) |
| 42 | traincode | traincode | traincode | varchar2(50) |
| 43 | traincontent | traincontent | traincontent | varchar2(128) |
| 44 | traindays | traindays | traindays | number(38, 0) |
| 45 | trainmethod | trainmethod | trainmethod | varchar2(30) |
| 46 | trainname | trainname | trainname | varchar2(128) |
| 47 | trainorg | trainorg | trainorg | varchar2(20) |
| 48 | trainperiod | trainperiod | trainperiod | number(38, 0) |
| 49 | traintype | traintype | traintype | varchar2(20) |
| 50 | trmbegindtate | trmbegindtate | trmbegindtate | char(10) |
| 51 | trmenddate | trmenddate | trmenddate | char(10) |
| 52 | creationtime | creationtime | creationtime | char(19) | √ |
| 53 | creator | creator | creator | varchar2(20) | √ |
| 54 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 55 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 56 | modifier | modifier | modifier | varchar2(20) |
| 57 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |