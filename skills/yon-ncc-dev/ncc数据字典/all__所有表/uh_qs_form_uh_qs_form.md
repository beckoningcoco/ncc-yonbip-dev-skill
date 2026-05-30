# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12766.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_form | pk_form | pk_form | char(20) | √ |
| 2 | eu_type | eu_type | eu_type | number(38, 0) |
| 3 | flag_templet | flag_templet | flag_templet | varchar2(1) |
| 4 | form_class | form_class | form_class | number(38, 0) |
| 5 | form_code | form_code | form_code | varchar2(40) |
| 6 | form_name | form_name | form_name | varchar2(80) |
| 7 | form_type | form_type | form_type | varchar2(20) |
| 8 | issue_flag | issue_flag | issue_flag | varchar2(1) |
| 9 | memo | memo | memo | varchar2(1000) |
| 10 | page_footer | page_footer | page_footer | varchar2(4000) |
| 11 | page_header | page_header | page_header | varchar2(4000) |
| 12 | page_size | page_size | page_size | number(38, 0) |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | standard_code | standard_code | standard_code | varchar2(40) |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |