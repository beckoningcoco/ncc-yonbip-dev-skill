# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12461.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cndiaghist | pk_cndiaghist | pk_cndiaghist | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | date_diag | date_diag | date_diag | char(19) |
| 4 | descc | descc | descc | varchar2(256) |
| 5 | dt_diagsys | dt_diagsys | dt_diagsys | varchar2(50) |
| 6 | dt_diagtype | dt_diagtype | dt_diagtype | varchar2(50) |
| 7 | flag_final | flag_final | flag_final | char(1) |
| 8 | flag_maj | flag_maj | flag_maj | char(1) |
| 9 | flag_susp | flag_susp | flag_susp | char(1) |
| 10 | name | name | name | varchar2(50) |
| 11 | note | note | note | varchar2(256) |
| 12 | pk_cnet | pk_cnet | pk_cnet | varchar2(20) |  |  | '~' |
| 13 | pk_diagsys | pk_diagsys | pk_diagsys | varchar2(20) |  |  | '~' |
| 14 | pk_diagtype | pk_diagtype | pk_diagtype | varchar2(20) |  |  | '~' |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 17 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 18 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 19 | pk_psn_phy | pk_psn_phy | pk_psn_phy | varchar2(20) |  |  | '~' |
| 20 | pk_pv | pk_pv | pk_pv | varchar2(20) |  |  | '~' |
| 21 | pk_pvtype | pk_pvtype | pk_pvtype | varchar2(20) |  |  | '~' |
| 22 | creationtime | creationtime | creationtime | char(19) |
| 23 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 26 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |