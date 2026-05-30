# |<<

**负面清单 (ipmpg_negative / nc.vo.ipmpg.negativelist.NegativeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3353.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_negative | 负面清单主键 | pk_negative | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织版本 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | vbillcode | 编码 | vbillcode | varchar(50) |  | 字符串 (String) |
| 6 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | dpublishdate | 发布日期 | dpublishdate | char(19) |  | 日期 (UFDate) |
| 8 | biseffect | 生效状态 | biseffect | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | vmemo | 说明 | vmemo | varchar(2048) |  | 备注 (Memo) |
| 10 | vreserve1 | 预留字段1 | vreserve1 | varchar(100) |  | 字符串 (String) |
| 11 | vreserve2 | 预留字段2 | vreserve2 | varchar(100) |  | 字符串 (String) |
| 12 | vreserve3 | 预留字段3 | vreserve3 | varchar(100) |  | 字符串 (String) |
| 13 | vreserve4 | 预留字段4 | vreserve4 | varchar(100) |  | 字符串 (String) |
| 14 | vreserve5 | 预留字段5 | vreserve5 | varchar(100) |  | 字符串 (String) |
| 15 | vreserve6 | 预留字段6 | vreserve6 | varchar(100) |  | 字符串 (String) |
| 16 | vreserve7 | 预留字段7 | vreserve7 | varchar(100) |  | 字符串 (String) |
| 17 | vreserve8 | 预留字段8 | vreserve8 | varchar(100) |  | 字符串 (String) |
| 18 | vreserve9 | 预留字段9 | vreserve9 | varchar(100) |  | 字符串 (String) |
| 19 | vreserve10 | 预留字段10 | vreserve10 | varchar(100) |  | 字符串 (String) |
| 20 | vreserve11 | 预留字段11 | vreserve11 | varchar(100) |  | 字符串 (String) |
| 21 | vreserve12 | 预留字段12 | vreserve12 | varchar(100) |  | 字符串 (String) |
| 22 | vreserve13 | 预留字段13 | vreserve13 | varchar(100) |  | 字符串 (String) |
| 23 | vreserve14 | 预留字段14 | vreserve14 | varchar(100) |  | 字符串 (String) |
| 24 | vreserve15 | 预留字段15 | vreserve15 | varchar(100) |  | 字符串 (String) |
| 25 | vreserve16 | 预留字段16 | vreserve16 | varchar(100) |  | 字符串 (String) |
| 26 | vreserve17 | 预留字段17 | vreserve17 | varchar(100) |  | 字符串 (String) |
| 27 | vreserve18 | 预留字段18 | vreserve18 | varchar(100) |  | 字符串 (String) |
| 28 | vreserve19 | 预留字段19 | vreserve19 | varchar(100) |  | 字符串 (String) |
| 29 | vreserve20 | 预留字段20 | vreserve20 | varchar(100) |  | 字符串 (String) |
| 30 | cbilltypecode | 单据类型 | cbilltypecode | varchar(20) |  | 字符串 (String) |
| 31 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |