# |<<

**利润中心 (org_profitcenter / nc.vo.profitcenter.ProfitCenterVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4136.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_profitcenter | 利润中心标识 | pk_profitcenter | char(20) | √ | 主键 (UFID) |
| 2 | pk_vid | 版本主键 | pk_vid | varchar(20) | √ | 利润中心版本 (profitcenterVersion) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 5 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | shortname | 简称 | shortname | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | principal | 负责人 | principal | varchar(20) |  | 人员基本信息 (psndoc) |
| 8 | isbudget | 是否预算 | isbudget | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | vnote | 备注 | vnote | image |  | BLOB (BLOB) |
| 10 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |