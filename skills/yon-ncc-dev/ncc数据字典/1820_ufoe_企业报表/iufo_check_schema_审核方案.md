# |<<

**审核方案 (iufo_check_schema / nc.vo.iufo.check.CheckSchemaVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3402.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_check_schema | 审核方案主键 | pk_check_schema | char(20) | √ | 主键 (UFID) |
| 2 | id | 审核方案编码 | id | varchar(40) | √ | 字符串 (String) |
| 3 | name | 审核方案名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | note | 说明 | note | varchar(1024) |  | 备注 (Memo) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | parent_id | 所属分类 | parent_id | varchar(20) |  | 审核方案分类 (审核方案分类) |
| 8 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 9 | sealflag | 封存标记 | sealflag | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | usedflag | 启用标记 | usedflag | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | busi_prop | 业务属性 | busi_prop | varchar(20) |  | 业务属性(自定义档案) (Defdoc-ORG004_0xx) |
| 12 | dataorigin | 数据来源 | dataorigin | varchar(50) |  | 字符串 (String) |
| 13 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 14 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 15 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 16 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |