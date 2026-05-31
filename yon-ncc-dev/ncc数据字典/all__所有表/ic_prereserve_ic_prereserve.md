# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9120.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_prereserve | pk_prereserve | pk_prereserve | char(20) | √ |
| 2 | bsysflag | bsysflag | bsysflag | char(1) |
| 3 | clocationid | clocationid | clocationid | varchar2(20) |  |  | '~' |
| 4 | cmaterialoid | cmaterialoid | cmaterialoid | varchar2(20) |  |  | '~' |
| 5 | cmaterialvid | cmaterialvid | cmaterialvid | varchar2(20) |  |  | '~' |
| 6 | creqbillbid | creqbillbid | creqbillbid | varchar2(20) |
| 7 | creqbillid | creqbillid | creqbillid | varchar2(20) |
| 8 | creqbilltype | creqbilltype | creqbilltype | varchar2(50) |
| 9 | creqtranstype | creqtranstype | creqtranstype | varchar2(20) |  |  | '~' |
| 10 | csupplybid | csupplybid | csupplybid | varchar2(20) |
| 11 | csupplycode | csupplycode | csupplycode | varchar2(40) |
| 12 | csupplyhid | csupplyhid | csupplyhid | varchar2(20) |
| 13 | csupplyrowno | csupplyrowno | csupplyrowno | varchar2(20) |
| 14 | csupplytranstype | csupplytranstype | csupplytranstype | varchar2(20) |  |  | '~' |
| 15 | csupplytype | csupplytype | csupplytype | varchar2(50) |
| 16 | cunitid | cunitid | cunitid | varchar2(20) |  |  | '~' |
| 17 | cwarehouseid | cwarehouseid | cwarehouseid | varchar2(20) |  |  | '~' |
| 18 | dreqdate | dreqdate | dreqdate | varchar2(19) |
| 19 | dsupplydate | dsupplydate | dsupplydate | varchar2(19) |
| 20 | fresstate | fresstate | fresstate | number(38, 0) |
| 21 | nreleasenum | nreleasenum | nreleasenum | number(28, 8) |
| 22 | nrshandnum | nrshandnum | nrshandnum | number(28, 8) |
| 23 | nrsinnum | nrsinnum | nrsinnum | number(28, 8) |
| 24 | nrsnum | nrsnum | nrsnum | number(28, 8) |
| 25 | nrsoutnum | nrsoutnum | nrsoutnum | number(28, 8) |
| 26 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 27 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 28 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 29 | pk_reserve | pk_reserve | pk_reserve | char(20) | √ |
| 30 | vbatchcode | vbatchcode | vbatchcode | varchar2(40) |
| 31 | creationtime | creationtime | creationtime | char(19) |
| 32 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 33 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |