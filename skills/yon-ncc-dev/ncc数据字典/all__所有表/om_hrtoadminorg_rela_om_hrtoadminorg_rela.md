# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10103.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_relation | pk_relation | pk_relation | char(20) | √ |
| 2 | admin_code | admin_code | admin_code | varchar2(200) |
| 3 | admin_innercode | admin_innercode | admin_innercode | varchar2(200) |
| 4 | hr_code | hr_code | hr_code | varchar2(200) |
| 5 | hr_innercode | hr_innercode | hr_innercode | varchar2(200) |
| 6 | pk_adminorg | pk_adminorg | pk_adminorg | varchar2(20) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |
| 8 | pk_hrorg | pk_hrorg | pk_hrorg | varchar2(20) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |