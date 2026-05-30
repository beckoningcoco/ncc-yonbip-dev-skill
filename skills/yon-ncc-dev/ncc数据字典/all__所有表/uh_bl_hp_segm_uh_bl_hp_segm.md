# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12391.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stdt | pk_stdt | pk_stdt | char(20) | √ |
| 2 | amount | amount | amount | number(28, 8) |
| 3 | pk_group | pk_group | pk_group | varchar2(20) |
| 4 | pk_hp | pk_hp | pk_hp | varchar2(20) |
| 5 | pk_hpsegm | pk_hpsegm | pk_hpsegm | varchar2(20) |
| 6 | pk_hpst | pk_hpst | pk_hpst | varchar2(20) |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |
| 8 | segmcode | segmcode | segmcode | varchar2(50) |
| 9 | segmname | segmname | segmname | varchar2(50) |
| 10 | segmvalue | segmvalue | segmvalue | varchar2(500) |
| 11 | creationtime | creationtime | creationtime | char(19) |
| 12 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 15 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |