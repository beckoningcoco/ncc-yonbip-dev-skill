# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11519.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_appregister | pk_appregister | pk_appregister | char(20) | √ |
| 2 | apptype | apptype | apptype | number(38, 0) |
| 3 | app_desc | app_desc | app_desc | varchar2(200) |
| 4 | code | code | code | varchar2(50) | √ |
| 5 | funtype | funtype | funtype | number(38, 0) |
| 6 | fun_property | fun_property | fun_property | number(38, 0) |  |  | 0 |
| 7 | height | height | height | number(38, 0) |
| 8 | help_name | help_name | help_name | varchar2(50) |
| 9 | image_src | image_src | image_src | varchar2(1000) |
| 10 | iscauserusable | iscauserusable | iscauserusable | char(1) |
| 11 | iscopypage | iscopypage | iscopypage | char(1) |  |  | 'n' |
| 12 | isenable | isenable | isenable | char(1) |
| 13 | mdid | mdid | mdid | varchar2(36) |  |  | '~' |
| 14 | mountid | mountid | mountid | varchar2(50) |
| 15 | name | name | name | varchar2(300) | √ |
| 16 | orgtypecode | orgtypecode | orgtypecode | varchar2(50) |
| 17 | own_module | own_module | own_module | varchar2(20) |  |  | '~' |
| 18 | parent_id | parent_id | parent_id | varchar2(20) |
| 19 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 20 | resid | resid | resid | varchar2(50) |
| 21 | scopeid | scopeid | scopeid | varchar2(200) |
| 22 | source_app_code | source_app_code | source_app_code | varchar2(50) |
| 23 | target_path | target_path | target_path | varchar2(500) |
| 24 | uselicense_load | uselicense_load | uselicense_load | char(1) |
| 25 | width | width | width | number(38, 0) |
| 26 | creationtime | creationtime | creationtime | char(19) |
| 27 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 28 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 29 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 30 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 31 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |