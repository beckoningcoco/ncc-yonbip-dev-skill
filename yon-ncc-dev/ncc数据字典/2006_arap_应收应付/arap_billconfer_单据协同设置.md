# |<<

**单据协同设置 (arap_billconfer / nc.vo.arap.billconfer.BillconferVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/166.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bconfer | 主键 | pk_bconfer | char(20) | √ | 主键 (UFID) |
| 2 | sourcebill | 来源交易类型 | sourcebill | char(20) | √ | 单据类型 (BilltypeVO) |
| 3 | targetbill | 目的交易类型 | targetbill | char(20) | √ | 单据类型 (BilltypeVO) |
| 4 | sourceorg | 来源财务组织 | sourceorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | targetorg | 目的财务组织 | targetorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | afterclass | 后续处理类 | afterclass | varchar(50) |  | 字符串 (String) |
| 7 | docontrol | 控制点 | docontrol | int |  | 整数 (Integer) |
| 8 | scomment | 摘要 | scomment | varchar(36) |  | 常用摘要 (summary) |
| 9 | receivers | 收方 | receivers | varchar(20) |  | 角色 (Role) |
| 10 | busitype | 业务类型 | busitype | varchar(20) |  | 业务流程 (BusitypeVO) |
| 11 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 12 | sourceorg_v | 来源组织版本 | sourceorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 13 | targetorg_v | 目的组织版本 | targetorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 14 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 15 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 16 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 17 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |