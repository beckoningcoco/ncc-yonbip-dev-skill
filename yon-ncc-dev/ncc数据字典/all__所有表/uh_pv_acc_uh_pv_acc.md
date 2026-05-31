# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12734.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvacc | pk_pvacc | pk_pvacc | char(20) | √ |
| 2 | charged | charged | charged | number(14, 2) |
| 3 | cred | cred | cred | number(14, 2) |
| 4 | date_canc | date_canc | date_canc | char(19) |
| 5 | date_rec | date_rec | date_rec | char(19) |
| 6 | deposit | deposit | deposit | number(14, 2) |
| 7 | flag_canc | flag_canc | flag_canc | char(1) |
| 8 | name_psn_canc | name_psn_canc | name_psn_canc | varchar2(50) |
| 9 | name_psn_ensure | name_psn_ensure | name_psn_ensure | varchar2(50) |
| 10 | name_psn_rec | name_psn_rec | name_psn_rec | varchar2(50) |
| 11 | note | note | note | varchar2(256) |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 15 | pk_psn_canc | pk_psn_canc | pk_psn_canc | varchar2(20) |  |  | '~' |
| 16 | pk_psn_ensure | pk_psn_ensure | pk_psn_ensure | varchar2(20) |  |  | '~' |
| 17 | pk_psn_rec | pk_psn_rec | pk_psn_rec | varchar2(20) |  |  | '~' |
| 18 | pk_pv | pk_pv | pk_pv | varchar2(20) |  |  | '~' |
| 19 | creationtime | creationtime | creationtime | char(19) |
| 20 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 23 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |