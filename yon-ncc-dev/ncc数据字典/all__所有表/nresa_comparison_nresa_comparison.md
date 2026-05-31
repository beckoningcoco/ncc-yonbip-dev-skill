# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10018.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_factor_subjects | pk_factor_subjects | pk_factor_subjects | char(20) | √ |
| 2 | accasoa_auxiliary | accasoa_auxiliary | accasoa_auxiliary | varchar2(200) |
| 3 | accchart_version | accchart_version | accchart_version | varchar2(20) |
| 4 | check_description | check_description | check_description | varchar2(400) |
| 5 | check_status | check_status | check_status | number(38, 0) | √ |  | 1 |
| 6 | factorasoa_accassitem | factorasoa_accassitem | factorasoa_accassitem | varchar2(200) |
| 7 | factor_version | factor_version | factor_version | varchar2(20) | √ |
| 8 | pk_accasoa | pk_accasoa | pk_accasoa | varchar2(20) |  |  | '~' |
| 9 | pk_accchart | pk_accchart | pk_accchart | char(20) |  |  | '~' |
| 10 | pk_app_upgrade | pk_app_upgrade | pk_app_upgrade | char(20) | √ |
| 11 | pk_controlarea | pk_controlarea | pk_controlarea | char(20) | √ |
| 12 | pk_factorasoa | pk_factorasoa | pk_factorasoa | varchar2(20) |  |  | '~' |
| 13 | pk_factorchart | pk_factorchart | pk_factorchart | char(20) | √ |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |