# |<<

**报表项目体系 (bd_reportsystem / nc.vo.bd.reportsystem.ReportSystemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/960.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reportsystem | 主键 | pk_reportsystem | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) | √ | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | remark | 备注 | remark | varchar(200) |  | 字符串 (String) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_报表组织 (reportorg) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | repflag | 被财务报表使用 | repflag | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 9 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 11 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |