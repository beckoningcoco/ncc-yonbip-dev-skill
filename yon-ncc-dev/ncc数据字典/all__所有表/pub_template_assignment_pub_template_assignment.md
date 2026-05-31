# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10996.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_assignment | pk_assignment | pk_assignment | char(20) | √ |
| 2 | app_code | app_code | app_code | varchar2(50) |
| 3 | is_default | is_default | is_default | char(1) |
| 4 | page_code | page_code | page_code | varchar2(50) |
| 5 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | pk_page_templet | pk_page_templet | pk_page_templet | varchar2(20) | √ |
| 8 | target | target | target | varchar2(20) |
| 9 | target_type | target_type | target_type | varchar2(20) |
| 10 | template_type | template_type | template_type | varchar2(20) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |