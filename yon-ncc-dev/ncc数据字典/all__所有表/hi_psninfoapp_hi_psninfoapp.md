# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8681.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psninfoapprove | pk_psninfoapprove | pk_psninfoapprove | char(20) | √ |
| 2 | applydate | applydate | applydate | char(10) |
| 3 | checkdate | checkdate | checkdate | char(10) |
| 4 | checknote | checknote | checknote | varchar2(200) |
| 5 | checkstatus | checkstatus | checkstatus | number(38, 0) |
| 6 | errmsg | errmsg | errmsg | varchar2(200) |
| 7 | newvalue | newvalue | newvalue | blob |
| 8 | oldvalue | oldvalue | oldvalue | blob |
| 9 | pk_applicant | pk_applicant | pk_applicant | varchar2(20) |  |  | '~' |
| 10 | pk_checkuser | pk_checkuser | pk_checkuser | varchar2(20) |  |  | '~' |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_infoset | pk_infoset | pk_infoset | varchar2(20) |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 15 | pk_psnjob | pk_psnjob | pk_psnjob | varchar2(20) |  |  | '~' |
| 16 | readstatus | readstatus | readstatus | number(38, 0) |  |  | 0 |
| 17 | submitdate | submitdate | submitdate | char(10) |
| 18 | creationtime | creationtime | creationtime | char(19) |
| 19 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 22 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |