# |<<

**子集查询条件 (hrpub_rptdef_condition / nccloud.vo.hrpub.rptdef.RptDefConditionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2756.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | 主键 | id | char(20) | √ | 主键 (UFID) |
| 2 | fieldcode | 字段编码 | fieldcode | varchar(50) |  | 字符串 (String) |
| 3 | fieldname | 字段名称 | fieldname | varchar(50) |  | 字符串 (String) |
| 4 | pk_infoset | 所属信息集 | pk_infoset | varchar(20) |  | 信息集 (InfoSet) |
| 5 | pk_info_item | 所属信息项 | pk_info_item | varchar(20) |  | 信息项 (info_item) |
| 6 | table_code | 表编码 | table_code | varchar(50) |  | 字符串 (String) |
| 7 | table_name | 表名称 | table_name | varchar(50) |  | 字符串 (String) |
| 8 | wheresql | 查询条件 | wheresql | varchar(500) |  | 字符串 (String) |
| 9 | sqldscrpt | 条件描述 | sqldscrpt | varchar(500) |  | 字符串 (String) |
| 10 | href_key | 条件key | href_key | varchar(50) |  | 字符串 (String) |
| 11 | href_name | 条件显示名称 | href_name | varchar(200) |  | 字符串 (String) |
| 12 | href_path | 条件链接 | href_path | varchar(200) |  | 字符串 (String) |
| 13 | dataformat | 日期格式 | dataformat | int |  | 整数 (Integer) |
| 14 | prefix | 前缀 | prefix | varchar(50) |  | 字符串 (String) |
| 15 | suffix | 后缀 | suffix | varchar(50) |  | 字符串 (String) |
| 16 | pk_rpt_def | 卡片报表主键 | pk_rpt_def | varchar(50) |  | 字符串 (String) |
| 17 | pk_conmodel | 合同主键 | pk_conmodel | varchar(50) |  | 字符串 (String) |
| 18 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 19 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 20 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 21 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |