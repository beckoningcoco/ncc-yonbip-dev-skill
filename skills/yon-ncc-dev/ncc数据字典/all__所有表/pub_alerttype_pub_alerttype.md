# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10863.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_alerttype | pk_alerttype | pk_alerttype | char(20) | √ |
| 2 | apptag | apptag | apptag | varchar2(50) |
| 3 | belong_system | belong_system | belong_system | varchar2(20) |
| 4 | bizconfigclass | bizconfigclass | bizconfigclass | varchar2(128) |
| 5 | busi_plugin | busi_plugin | busi_plugin | varchar2(128) |
| 6 | category | category | category | varchar2(20) |
| 7 | control_level | control_level | control_level | number(38, 0) |  |  | 0 |
| 8 | description | description | description | varchar2(500) |
| 9 | descrip_resid | descrip_resid | descrip_resid | varchar2(40) |
| 10 | executeinterval | executeinterval | executeinterval | number(38, 0) |
| 11 | exeintervalunit | exeintervalunit | exeintervalunit | number(38, 0) |
| 12 | hycode | hycode | hycode | varchar2(20) |
| 13 | name_resid | name_resid | name_resid | varchar2(40) |
| 14 | orgtype | orgtype | orgtype | varchar2(20) |
| 15 | org_multiselectable | org_multiselectable | org_multiselectable | char(1) |
| 16 | org_nullable | org_nullable | org_nullable | char(1) |
| 17 | pk_alertquery | pk_alertquery | pk_alertquery | char(20) |
| 18 | pk_busiobj | pk_busiobj | pk_busiobj | varchar2(50) |
| 19 | pk_funcnode | pk_funcnode | pk_funcnode | varchar2(20) |
| 20 | tasktype | tasktype | tasktype | number(38, 0) |
| 21 | type_code | type_code | type_code | varchar2(50) |
| 22 | type_name | type_name | type_name | varchar2(75) |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |