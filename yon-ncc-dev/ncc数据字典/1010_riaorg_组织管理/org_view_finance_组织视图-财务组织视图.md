# |<<

**组织视图-财务组织视图 (org_view_finance / nc.vo.org.orgview.OrgViewFinanceSubVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4191.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_financesub | 主键 | pk_financesub | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 组织单元 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 4 | name | 名称 | name | varchar(200) |  | 字符串 (String) |
| 5 | pk_fatherorg | 上级业务单元 | pk_fatherorg | varchar(20) |  | 组织 (org) |
| 6 | innercode | 内部编码 | innercode | varchar(50) |  | 字符串 (String) |
| 7 | shortname | 简称 | shortname | varchar(50) |  | 字符串 (String) |
| 8 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 9 | ismainbook | 主账簿 | ismainbook | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | isreportbook | 报告账簿 | isreportbook | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | iscorp | 公司 | iscorp | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | isfinanceorg | 财务组织 | isfinanceorg | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | isbook | 账簿 | isbook | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | isfromfiorg | 按财务组织纬度 | isfromfiorg | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | isfrombook | 按账簿纬度 | isfrombook | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |