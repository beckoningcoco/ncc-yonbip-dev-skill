# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8834.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rpt_def | pk_rpt_def | pk_rpt_def | char(20) | √ |
| 2 | nodetype | nodetype | nodetype | number(38, 0) |
| 3 | obj_rpt_def | obj_rpt_def | obj_rpt_def | blob |
| 4 | obj_rpt_xml | obj_rpt_xml | obj_rpt_xml | blob |
| 5 | parnodepk | parnodepk | parnodepk | char(20) |
| 6 | pk_bu | pk_bu | pk_bu | char(20) |
| 7 | pk_group | pk_group | pk_group | char(20) |
| 8 | pk_org | pk_org | pk_org | char(20) |
| 9 | remark | remark | remark | varchar2(1536) |
| 10 | rpt_code | rpt_code | rpt_code | char(20) |
| 11 | rpt_name | rpt_name | rpt_name | varchar2(192) |
| 12 | rpt_name2 | rpt_name2 | rpt_name2 | varchar2(192) |
| 13 | rpt_name3 | rpt_name3 | rpt_name3 | varchar2(192) |
| 14 | rpt_name4 | rpt_name4 | rpt_name4 | varchar2(192) |
| 15 | rpt_name5 | rpt_name5 | rpt_name5 | varchar2(192) |
| 16 | rpt_name6 | rpt_name6 | rpt_name6 | varchar2(192) |
| 17 | rpt_type | rpt_type | rpt_type | number(38, 0) |
| 18 | creationtime | creationtime | creationtime | char(19) |
| 19 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 22 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |