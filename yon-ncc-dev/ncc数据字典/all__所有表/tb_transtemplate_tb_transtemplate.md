# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12125.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | creatertime | creatertime | creatertime | char(19) |
| 3 | dimlevelname | dimlevelname | dimlevelname | blob |
| 4 | other | other | other | blob |
| 5 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |
| 6 | pk_cube | pk_cube | pk_cube | varchar2(20) | √ |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |
| 8 | pk_taskdef | pk_taskdef | pk_taskdef | varchar2(20) | √ |
| 9 | pk_transtype | pk_transtype | pk_transtype | varchar2(20) | √ |
| 10 | pk_workbook | pk_workbook | pk_workbook | varchar2(20) |
| 11 | templatebody | templatebody | templatebody | varchar2(1024) |
| 12 | templatefix | templatefix | templatefix | varchar2(1024) |
| 13 | templateheader | templateheader | templateheader | varchar2(1024) |
| 14 | templatehide | templatehide | templatehide | varchar2(1024) |
| 15 | templatename | templatename | templatename | varchar2(100) |
| 16 | templateother | templateother | templateother | varchar2(1024) |
| 17 | templateproperty | templateproperty | templateproperty | varchar2(100) |
| 18 | templatetail | templatetail | templatetail | varchar2(1024) |
| 19 | transtype | transtype | transtype | varchar2(100) |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |