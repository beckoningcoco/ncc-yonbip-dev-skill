# |<<

**利润中心版本 (org_profitcenter_v / nc.vo.profitcenter.ProfitcenterVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4137.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vid | 版本主键 | pk_vid | char(20) | √ | 主键 (UFID) |
| 2 | pk_profitcenter | 利润中心 | pk_profitcenter | varchar(20) | √ | 利润中心 (profitcenter) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 5 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | shortname | 简称 | shortname | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | principal | 负责人 | principal | varchar(20) |  | 人员基本信息 (psndoc) |
| 8 | isbudget | 是否预算 | isbudget | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | vnote | 备注 | vnote | image |  | BLOB (BLOB) |
| 10 | datatype | 档案类型 | datatype | int |  | 档案类型 (profitbdtype) |  | 1=业务单元; |