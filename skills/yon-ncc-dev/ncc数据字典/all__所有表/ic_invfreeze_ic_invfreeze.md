# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9090.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cfreezeid | cfreezeid | cfreezeid | char(20) | √ |
| 2 | breverseflag | breverseflag | breverseflag | char(1) |
| 3 | castunitid | castunitid | castunitid | varchar2(20) |  |  | '~' |
| 4 | ccorrespondbid | ccorrespondbid | ccorrespondbid | varchar2(20) |
| 5 | ccorrespondcode | ccorrespondcode | ccorrespondcode | varchar2(40) |
| 6 | ccorrespondhid | ccorrespondhid | ccorrespondhid | varchar2(20) |
| 7 | ccorrespondrowno | ccorrespondrowno | ccorrespondrowno | varchar2(40) |
| 8 | cffileid | cffileid | cffileid | varchar2(20) |
| 9 | cfreezerid | cfreezerid | cfreezerid | varchar2(20) |  |  | '~' |
| 10 | cthawerid | cthawerid | cthawerid | varchar2(20) |  |  | '~' |
| 11 | cthawsourceid | cthawsourceid | cthawsourceid | char(20) |
| 12 | cunitid | cunitid | cunitid | varchar2(20) |  |  | '~' |
| 13 | dfreezedate | dfreezedate | dfreezedate | varchar2(19) |
| 14 | dthawdate | dthawdate | dthawdate | varchar2(19) |
| 15 | ndefrzastnum | ndefrzastnum | ndefrzastnum | number(28, 8) |
| 16 | ndefrzgrsnum | ndefrzgrsnum | ndefrzgrsnum | number(28, 8) |
| 17 | ndefrznum | ndefrznum | ndefrznum | number(28, 8) |
| 18 | nfrzastnum | nfrzastnum | nfrzastnum | number(28, 8) |
| 19 | nfrzgrsnum | nfrzgrsnum | nfrzgrsnum | number(28, 8) |
| 20 | nfrznum | nfrznum | nfrznum | number(28, 8) |
| 21 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 22 | pk_onhanddim | pk_onhanddim | pk_onhanddim | varchar2(20) |  |  | '~' |
| 23 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 24 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 25 | vchangerate | vchangerate | vchangerate | varchar2(60) |
| 26 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |