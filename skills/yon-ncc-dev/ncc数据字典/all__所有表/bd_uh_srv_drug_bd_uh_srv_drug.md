# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7230.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srv_drug | pk_srv_drug | pk_srv_drug | char(20) | √ |
| 2 | constr | constr | constr | varchar2(200) |
| 3 | dispendmode | dispendmode | dispendmode | varchar2(50) |
| 4 | dt_anti | dt_anti | dt_anti | varchar2(50) |
| 5 | dt_dosage | dt_dosage | dt_dosage | varchar2(50) |
| 6 | dt_muputype | dt_muputype | dt_muputype | varchar2(50) |
| 7 | dt_pharm | dt_pharm | dt_pharm | varchar2(50) |
| 8 | dt_pois | dt_pois | dt_pois | varchar2(50) |
| 9 | dt_val | dt_val | dt_val | varchar2(50) |
| 10 | guide | guide | guide | varchar2(200) |
| 11 | indica | indica | indica | varchar2(200) |
| 12 | name_cham | name_cham | name_cham | varchar2(50) |
| 13 | name_gen | name_gen | name_gen | varchar2(50) | √ |
| 14 | pk_anti | pk_anti | pk_anti | varchar2(20) |  |  | '~' |
| 15 | pk_dosage | pk_dosage | pk_dosage | varchar2(50) | √ |  | '~' |
| 16 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 17 | pk_muputype | pk_muputype | pk_muputype | varchar2(50) |
| 18 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 19 | pk_pharm | pk_pharm | pk_pharm | varchar2(50) |  |  | '~' |
| 20 | pk_pois | pk_pois | pk_pois | varchar2(20) |  |  | '~' |
| 21 | pk_srv | pk_srv | pk_srv | varchar2(50) |  |  | '~' |
| 22 | pk_val | pk_val | pk_val | varchar2(20) |  |  | '~' |
| 23 | quan_dosage | quan_dosage | quan_dosage | number(14, 2) | √ |
| 24 | react | react | react | varchar2(200) |
| 25 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 26 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |