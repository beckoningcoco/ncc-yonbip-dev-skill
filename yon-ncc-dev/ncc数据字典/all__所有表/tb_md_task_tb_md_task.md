# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12063.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | avabusisystem | avabusisystem | avabusisystem | varchar2(20) |
| 3 | busisystem | busisystem | busisystem | varchar2(20) |
| 4 | busitype | busitype | busitype | char(2) |
| 5 | cancomplie | cancomplie | cancomplie | char(1) |
| 6 | copytime | copytime | copytime | char(19) |
| 7 | description | description | description | blob |
| 8 | ishavefile | ishavefile | ishavefile | char(1) |
| 9 | managestatus | managestatus | managestatus | char(1) | √ |
| 10 | objname | objname | objname | varchar2(400) | √ |
| 11 | paramap | paramap | paramap | blob |
| 12 | pk_aimcurr | pk_aimcurr | pk_aimcurr | varchar2(20) |
| 13 | pk_approver | pk_approver | pk_approver | varchar2(20) |
| 14 | pk_compiler | pk_compiler | pk_compiler | varchar2(20) |
| 15 | pk_copyfrom | pk_copyfrom | pk_copyfrom | varchar2(20) |
| 16 | pk_currency | pk_currency | pk_currency | varchar2(20) |
| 17 | pk_dataent | pk_dataent | pk_dataent | varchar2(20) |
| 18 | pk_dataent_s | pk_dataent_s | pk_dataent_s | varchar2(20) |
| 19 | pk_dept | pk_dept | pk_dept | varchar2(20) |
| 20 | pk_group | pk_group | pk_group | varchar2(20) |
| 21 | pk_month | pk_month | pk_month | varchar2(20) |
| 22 | pk_mvtype | pk_mvtype | pk_mvtype | varchar2(20) |
| 23 | pk_org | pk_org | pk_org | varchar2(20) |
| 24 | pk_orgstruct | pk_orgstruct | pk_orgstruct | varchar2(20) |
| 25 | pk_paradims | pk_paradims | pk_paradims | varchar2(512) |
| 26 | pk_planent | pk_planent | pk_planent | varchar2(20) |
| 27 | pk_planent_s | pk_planent_s | pk_planent_s | varchar2(20) |
| 28 | pk_taskdef | pk_taskdef | pk_taskdef | varchar2(20) | √ |
| 29 | pk_version | pk_version | pk_version | varchar2(20) |
| 30 | pk_workbook | pk_workbook | pk_workbook | varchar2(20) |
| 31 | pk_year | pk_year | pk_year | varchar2(20) |
| 32 | planstatus | planstatus | planstatus | char(3) | √ |
| 33 | sheetlist | sheetlist | sheetlist | blob |
| 34 | versionstatus | versionstatus | versionstatus | char(2) | √ |
| 35 | creationtime | creationtime | creationtime | char(19) |
| 36 | creator | creator | creator | varchar2(20) |
| 37 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 38 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 39 | modifier | modifier | modifier | varchar2(20) |
| 40 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |