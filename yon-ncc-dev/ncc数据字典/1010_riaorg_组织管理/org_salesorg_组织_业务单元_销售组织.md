# |<<

**组织_业务单元_销售组织 (org_salesorg / nc.vo.org.SalesOrgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4163.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_salesorg | 销售组织主键 | pk_salesorg | char(20) | √ | 主键 (UFID) |
| 2 | code | 销售组织编码 | code | varchar(50) | √ | 字符串 (String) |
| 3 | name | 销售组织名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 5 | pk_fatherorg | 上级销售组织 | pk_fatherorg | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 6 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) | 1 | 1=未启用; |