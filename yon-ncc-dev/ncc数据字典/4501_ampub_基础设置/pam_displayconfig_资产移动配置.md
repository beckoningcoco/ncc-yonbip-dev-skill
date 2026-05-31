# |<<

**资产移动配置 (pam_displayconfig / nc.vo.am.displayconfig.DisplayConfigHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4246.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_displayconfig | 主键 | pk_displayconfig | char(20) | √ | 主键 (UFID) |
| 2 | application_name | 移动应用名称 | application_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | application_code | 移动名称编码 | application_code | varchar(40) |  | 字符串 (String) |
| 4 | edit_state | 界面状态 | edit_state | int |  | 整数 (Integer) | 0 |
| 5 | innercode | 内码 | innercode | varchar(60) |  | 字符串 (String) |
| 6 | pk_transitype | 交易类型 | pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | pk_group | 集团主键 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |