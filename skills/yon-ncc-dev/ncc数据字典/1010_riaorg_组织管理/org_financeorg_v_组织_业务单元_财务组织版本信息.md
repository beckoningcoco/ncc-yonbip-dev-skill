# |<<

**组织_业务单元_财务组织版本信息 (org_financeorg_v / nc.vo.vorg.FinanceOrgVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4058.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vid | 版本主键 | pk_vid | char(20) | √ | 主键 (UFID) |
| 2 | pk_financeorg | 组织主键 | pk_financeorg | char(0) | √ | 组织_业务单元_财务组织 (financeorg) |
| 3 | name | 财务组织名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | code | 财务组织编码 | code | varchar(40) |  | 字符串 (String) |
| 5 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 6 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) | 1 | 1=未启用; |