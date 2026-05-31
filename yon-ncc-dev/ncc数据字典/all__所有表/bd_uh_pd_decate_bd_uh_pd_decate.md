# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7186.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pddecate | pk_pddecate | pk_pddecate | char(20) | √ |
| 2 | code_demd | code_demd | code_demd | varchar2(30) |
| 3 | eu_pddetype | eu_pddetype | eu_pddetype | number(38, 0) |
| 4 | flag_active | flag_active | flag_active | char(1) |
| 5 | name_demd | name_demd | name_demd | varchar2(50) |
| 6 | note | note | note | varchar2(256) |
| 7 | pk_dept_pd | pk_dept_pd | pk_dept_pd | varchar2(20) |  |  | '~' |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 11 | wheresql | wheresql | wheresql | varchar2(4000) |
| 12 | creationtime | creationtime | creationtime | char(19) |
| 13 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 16 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |