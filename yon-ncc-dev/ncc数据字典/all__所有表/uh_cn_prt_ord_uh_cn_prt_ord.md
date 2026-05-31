# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12547.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cnprt | pk_cnprt | pk_cnprt | char(20) | √ |
| 2 | page | page | page | number(38, 0) |
| 3 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 4 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 5 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 6 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 7 | pk_pv | pk_pv | pk_pv | varchar2(20) |  |  | '~' |
| 8 | pk_pvtype | pk_pvtype | pk_pvtype | varchar2(20) |  |  | '~' |
| 9 | rowno | rowno | rowno | number(38, 0) |
| 10 | creationtime | creationtime | creationtime | char(19) |
| 11 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 14 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |