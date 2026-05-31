# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12064.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | avabusisystem | avabusisystem | avabusisystem | varchar2(20) |
| 3 | busisystem | busisystem | busisystem | varchar2(20) |
| 4 | busitype | busitype | busitype | char(2) |
| 5 | description | description | description | blob |
| 6 | isactive | isactive | isactive | char(1) |
| 7 | ischeckaccount | ischeckaccount | ischeckaccount | char(1) |
| 8 | objname | objname | objname | varchar2(100) | √ |
| 9 | objparam | objparam | objparam | number(38, 0) |  |  | 0 |
| 10 | paramap | paramap | paramap | blob |
| 11 | pk_accounttype | pk_accounttype | pk_accounttype | varchar2(20) |
| 12 | pk_busiattr | pk_busiattr | pk_busiattr | varchar2(20) |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |
| 15 | pk_orgstruct | pk_orgstruct | pk_orgstruct | varchar2(20) |
| 16 | pk_transtype | pk_transtype | pk_transtype | varchar2(20) |
| 17 | pk_uplevel | pk_uplevel | pk_uplevel | varchar2(20) |
| 18 | pk_workbook | pk_workbook | pk_workbook | varchar2(20) |
| 19 | tasktype | tasktype | tasktype | char(1) | √ |
| 20 | creationtime | creationtime | creationtime | char(19) |
| 21 | creator | creator | creator | varchar2(20) |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 24 | modifier | modifier | modifier | varchar2(20) |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |