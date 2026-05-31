# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12486.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_emrrecall | pk_emrrecall | pk_emrrecall | char(20) | √ |
| 2 | date_approval | date_approval | date_approval | char(19) |
| 3 | date_req | date_req | date_req | char(19) |
| 4 | desc_approval | desc_approval | desc_approval | varchar2(2000) |
| 5 | desc_req | desc_req | desc_req | varchar2(2000) |
| 6 | name_psn_approval | name_psn_approval | name_psn_approval | varchar2(300) |
| 7 | name_psn_req | name_psn_req | name_psn_req | varchar2(300) |
| 8 | pk_dept_approval | pk_dept_approval | pk_dept_approval | varchar2(20) |
| 9 | pk_dept_req | pk_dept_req | pk_dept_req | varchar2(20) |
| 10 | pk_group | pk_group | pk_group | char(20) |
| 11 | pk_org | pk_org | pk_org | char(20) | √ |
| 12 | pk_pati | pk_pati | pk_pati | varchar2(20) |
| 13 | pk_psn_approval | pk_psn_approval | pk_psn_approval | varchar2(20) |
| 14 | pk_psn_req | pk_psn_req | pk_psn_req | varchar2(20) |
| 15 | pk_pv | pk_pv | pk_pv | varchar2(20) |
| 16 | status_req | status_req | status_req | number(38, 0) |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |