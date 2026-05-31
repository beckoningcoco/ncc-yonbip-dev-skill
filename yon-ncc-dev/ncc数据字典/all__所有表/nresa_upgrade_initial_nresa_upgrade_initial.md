# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10079.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_initial | pk_initial | pk_initial | char(20) | √ |
| 2 | check_description | check_description | check_description | varchar2(400) |
| 3 | check_status | check_status | check_status | number(38, 0) | √ |  | 1 |
| 4 | code | code | code | varchar2(20) | √ |
| 5 | name | name | name | varchar2(200) | √ |
| 6 | pk_app_upgrade | pk_app_upgrade | pk_app_upgrade | char(20) | √ |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |