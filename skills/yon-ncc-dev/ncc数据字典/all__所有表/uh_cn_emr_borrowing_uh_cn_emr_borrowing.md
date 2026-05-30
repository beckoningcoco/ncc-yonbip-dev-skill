# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12465.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_emrborrowing | pk_emrborrowing | pk_emrborrowing | char(20) | √ |
| 2 | date_approval | date_approval | date_approval | char(19) |
| 3 | date_end | date_end | date_end | char(19) |
| 4 | date_end_real | date_end_real | date_end_real | char(19) |
| 5 | date_req | date_req | date_req | char(19) |
| 6 | desc_approval | desc_approval | desc_approval | varchar2(4000) |
| 7 | desc_req | desc_req | desc_req | varchar2(4000) |
| 8 | eu_emrtype | eu_emrtype | eu_emrtype | number(38, 0) |
| 9 | name_psn_approval | name_psn_approval | name_psn_approval | varchar2(50) |
| 10 | name_psn_req | name_psn_req | name_psn_req | varchar2(50) |
| 11 | pk_dept_approval | pk_dept_approval | pk_dept_approval | varchar2(20) |  |  | '~' |
| 12 | pk_dept_req | pk_dept_req | pk_dept_req | varchar2(20) |  |  | '~' |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | pk_pati | pk_pati | pk_pati | varchar2(50) |  |  | '~' |
| 16 | pk_psn_approval | pk_psn_approval | pk_psn_approval | varchar2(20) |  |  | '~' |
| 17 | pk_psn_req | pk_psn_req | pk_psn_req | varchar2(20) |  |  | '~' |
| 18 | pk_pv | pk_pv | pk_pv | varchar2(50) |  |  | '~' |
| 19 | status_req | status_req | status_req | number(38, 0) |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |