# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11015.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wfgroup_b | pk_wfgroup_b | pk_wfgroup_b | char(20) | √ |
| 2 | pk_member | pk_member | pk_member | varchar2(20) |  |  | '~' |
| 3 | pk_wfgroup | pk_wfgroup | pk_wfgroup | char(20) | √ |
| 4 | rely_attribute | rely_attribute | rely_attribute | varchar2(64) |
| 5 | rely_attrname | rely_attrname | rely_attrname | varchar2(256) |
| 6 | rule_code | rule_code | rule_code | varchar2(256) |
| 7 | rule_description | rule_description | rule_description | varchar2(256) |
| 8 | rule_type | rule_type | rule_type | varchar2(12) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |