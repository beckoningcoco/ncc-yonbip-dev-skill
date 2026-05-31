# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7200.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_phrecpi | pk_phrecpi | pk_phrecpi | char(20) | √ |
| 2 | dt_mctype | dt_mctype | dt_mctype | varchar2(50) |
| 3 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 4 | pk_mctype | pk_mctype | pk_mctype | varchar2(20) |  |  | '~' |
| 5 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 6 | pk_phdg | pk_phdg | pk_phdg | varchar2(50) |
| 7 | pk_phds | pk_phds | pk_phds | varchar2(50) |
| 8 | pk_phrec | pk_phrec | pk_phrec | varchar2(50) |
| 9 | tblname | tblname | tblname | varchar2(20) |  |  | '~' |
| 10 | creationtime | creationtime | creationtime | char(19) |
| 11 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 14 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |