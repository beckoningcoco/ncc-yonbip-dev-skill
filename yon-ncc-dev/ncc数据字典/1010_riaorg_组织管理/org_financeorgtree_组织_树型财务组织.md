# |<<

**组织_树型财务组织 (org_financeorgtree / nc.vo.org.FinanceOrgTreeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4059.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_financeorg | 财务组织主键 | pk_financeorg | char(20) | √ | 主键 (UFID) |
| 2 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | code | 编码 | code | varchar(40) |  | 字符串 (String) |
| 4 | pk_fatherorg | 上级组织 | pk_fatherorg | varchar(20) |  | 组织_树型财务组织 (financeorgtree) |
| 5 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 6 | pk_vid | 版本主键 | pk_vid | char(20) |  | 主键 (UFID) |
| 7 | istaxorg | 税务组织 | istaxorg | char(1) |  | 布尔类型 (UFBoolean) |