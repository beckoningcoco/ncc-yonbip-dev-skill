# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7227.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srvctrtypecate | pk_srvctrtypecate | pk_srvctrtypecate | char(20) | √ |
| 2 | dt_psnsrvtype | dt_psnsrvtype | dt_psnsrvtype | varchar2(50) |
| 3 | note | note | note | varchar2(256) |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 5 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 6 | pk_psnsrvtype | pk_psnsrvtype | pk_psnsrvtype | varchar2(20) |  |  | '~' |
| 7 | pk_srvcate | pk_srvcate | pk_srvcate | varchar2(50) |  |  | '~' |
| 8 | creationtime | creationtime | creationtime | char(19) |
| 9 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 12 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |