# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12493.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cnet | pk_cnet | pk_cnet | char(20) | √ |
| 2 | code_pvtype | code_pvtype | code_pvtype | varchar2(50) |
| 3 | date_et | date_et | date_et | char(19) |
| 4 | describe | describe | describe | varchar2(256) |
| 5 | eu_ettype | eu_ettype | eu_ettype | number(38, 0) |
| 6 | name | name | name | varchar2(50) |
| 7 | name_dept_et | name_dept_et | name_dept_et | varchar2(50) |
| 8 | name_psn_et | name_psn_et | name_psn_et | varchar2(300) |
| 9 | pk_dept_et | pk_dept_et | pk_dept_et | varchar2(20) |  |  | '~' |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(50) |  |  | '~' |
| 12 | pk_org_v | pk_org_v | pk_org_v | varchar2(50) |  |  | '~' |
| 13 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 14 | pk_psn_et | pk_psn_et | pk_psn_et | varchar2(20) |  |  | '~' |
| 15 | pk_pv | pk_pv | pk_pv | varchar2(20) |  |  | '~' |
| 16 | pk_pvtype | pk_pvtype | pk_pvtype | varchar2(20) |  |  | '~' |
| 17 | serialid | serialid | serialid | varchar2(50) |
| 18 | creationtime | creationtime | creationtime | char(19) |
| 19 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 22 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |