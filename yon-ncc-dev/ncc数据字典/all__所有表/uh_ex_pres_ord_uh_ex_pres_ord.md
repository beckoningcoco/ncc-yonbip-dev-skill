# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12614.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pres | pk_pres | pk_pres | char(20) | √ |
| 2 | addr_agent | addr_agent | addr_agent | varchar2(256) |
| 3 | code_pres | code_pres | code_pres | varchar2(30) |
| 4 | code_pvtype | code_pvtype | code_pvtype | varchar2(30) |
| 5 | date_pres | date_pres | date_pres | char(19) |
| 6 | dt_prestype | dt_prestype | dt_prestype | varchar2(50) |
| 7 | idno_agent | idno_agent | idno_agent | varchar2(30) |
| 8 | name_agent | name_agent | name_agent | varchar2(50) |
| 9 | name_psn_phy | name_psn_phy | name_psn_phy | varchar2(50) |
| 10 | note | note | note | varchar2(256) |
| 11 | pk_dept_phy | pk_dept_phy | pk_dept_phy | varchar2(20) |  |  | '~' |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 15 | pk_prestype | pk_prestype | pk_prestype | varchar2(20) |  |  | '~' |
| 16 | pk_psn_phy | pk_psn_phy | pk_psn_phy | varchar2(20) |  |  | '~' |
| 17 | pk_pv | pk_pv | pk_pv | varchar2(20) |  |  | '~' |
| 18 | pk_pvtype | pk_pvtype | pk_pvtype | varchar2(20) |  |  | '~' |
| 19 | teleno_agent | teleno_agent | teleno_agent | varchar2(30) |
| 20 | creationtime | creationtime | creationtime | char(19) |
| 21 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 24 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |