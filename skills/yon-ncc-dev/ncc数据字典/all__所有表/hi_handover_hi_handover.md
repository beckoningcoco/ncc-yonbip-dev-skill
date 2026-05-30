# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8629.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_handover | pk_handover | pk_handover | char(20) | √ |
| 2 | checkdate | checkdate | checkdate | char(10) |
| 3 | checker | checker | checker | varchar2(20) |  |  | '~' |
| 4 | ischeck | ischeck | ischeck | char(1) |
| 5 | memo | memo | memo | varchar2(512) |
| 6 | pk_bill | pk_bill | pk_bill | varchar2(20) |  |  | '~' |
| 7 | pk_group | pk_group | pk_group | char(20) |
| 8 | pk_handitem | pk_handitem | pk_handitem | varchar2(20) |  |  | '~' |
| 9 | pk_linkman | pk_linkman | pk_linkman | varchar2(512) |
| 10 | pk_org | pk_org | pk_org | char(20) |
| 11 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 12 | pk_psndoc_ctrt | pk_psndoc_ctrt | pk_psndoc_ctrt | varchar2(20) |  |  | '~' |
| 13 | pk_psnjob | pk_psnjob | pk_psnjob | varchar2(20) |  |  | '~' |
| 14 | setmemo | setmemo | setmemo | varchar2(600) |
| 15 | creationtime | creationtime | creationtime | char(19) |
| 16 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 19 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |