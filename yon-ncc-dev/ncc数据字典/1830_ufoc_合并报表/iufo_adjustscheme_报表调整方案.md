# |<<

**报表调整方案 (iufo_adjustscheme / nc.vo.hbbb.adjustscheme.AdjustSchemeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3389.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_adjustscheme | 调整方案主键 | pk_adjustscheme | char(20) | √ | 主键 (UFID) |
| 2 | code | 编号 | code | int |  | 整数 (Integer) |
| 3 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | version | 数据版本编号 | version | int |  | 整数 (Integer) |
| 5 | isaddadjust | 允许下级增加调整凭证 | isaddadjust | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | note | 说明 | note | varchar(1024) |  | 备注 (Memo) |
| 9 | usedflag | 启用标记 | usedflag | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | sealflag | 封存标记 | sealflag | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | parent_id | 所属分类 | parent_id | varchar(20) |  | 报表调整方案分类 (adjschemesort) |
| 12 | dataorigin | 数据来源 | dataorigin | varchar(50) |  | 字符串 (String) |
| 13 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 14 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 15 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 16 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |