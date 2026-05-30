# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8688.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_seqcontrol | pk_seqcontrol | pk_seqcontrol | char(20) | √ |
| 2 | funcode | funcode | funcode | varchar2(200) |
| 3 | function_node | function_node | function_node | varchar2(200) |
| 4 | isallowedit | isallowedit | isallowedit | char(1) |
| 5 | issysinit | issysinit | issysinit | char(1) |
| 6 | lastflag | lastflag | lastflag | char(1) |
| 7 | memo | memo | memo | varchar2(2048) |
| 8 | org_infoitem | org_infoitem | org_infoitem | varchar2(200) |
| 9 | org_scope | org_scope | org_scope | number(38, 0) |
| 10 | pk_group | pk_group | pk_group | char(20) |
| 11 | pk_org | pk_org | pk_org | char(20) |
| 12 | psn_infoitem | psn_infoitem | psn_infoitem | varchar2(200) |
| 13 | psn_scope | psn_scope | psn_scope | number(38, 0) |
| 14 | creationtime | creationtime | creationtime | char(19) |
| 15 | creator | creator | creator | varchar2(20) |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 18 | modifier | modifier | modifier | varchar2(20) |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |