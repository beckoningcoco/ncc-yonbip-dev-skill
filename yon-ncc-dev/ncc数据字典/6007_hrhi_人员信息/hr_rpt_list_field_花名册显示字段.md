# |<<

**花名册显示字段 (hr_rpt_list_field / nc.vo.hi.repdef.RptListFieldVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2697.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rpt_field | 主键 | pk_rpt_field | char(20) | √ | 主键 (UFID) |
| 2 | pk_rpt_def | 花名册主键 | pk_rpt_def | char(20) |  | 主键 (UFID) |
| 3 | pk_flddict | 信息项主键 | pk_flddict | char(20) |  | 主键 (UFID) |
| 4 | fieldcode | 字段编码 | fieldcode | varchar(70) |  | 字符串 (String) |
| 5 | fieldname | 字段名称 | fieldname | varchar(256) |  | 字符串 (String) |
| 6 | showorder | 显示顺序号 | showorder | int |  | 整数 (Integer) |
| 7 | isdisplay | 是否显示 | isdisplay | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 9 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 10 | creator | 创建人 | creator | char(20) |  | 主键 (UFID) |
| 11 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | modifier | 修改人 | modifier | char(20) |  | 主键 (UFID) |
| 13 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |