# |<<

**自定义单据 (lfw_zdydj / uap.lfw.dbl.vo.MetaDataBaseVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3587.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_freeform | 主键 | pk_freeform | nchar(50) | √ | 主键 (UFID) |
| 2 | remark | 备注 | remark | nvarchar(1000) |  | 字符串 (String) |
| 3 | name | 名称 | name | nvarchar(50) |  | 多语文本 (MultiLangText) |
| 4 | code | 编码 | code | nvarchar(50) |  | 字符串 (String) |
| 5 | pk_org | 所属组织 | pk_org | nvarchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | pk_group | 所属集团 | pk_group | nvarchar(20) |  | 组织_集团 (group) |
| 7 | pk_doc | 公共对象主键 | pk_doc | nvarchar(20) |  | 字符串 (String) |
| 8 | billid | 单据ID | billid | nvarchar(50) |  | 字符串 (String) |
| 9 | billno | 单据号 | billno | nvarchar(50) |  | 字符串 (String) |
| 10 | busitype | 业务类型 | busitype | nvarchar(50) |  | 字符串 (String) |
| 11 | billmaker | 制单人 | billmaker | nvarchar(20) |  | 用户 (user) |
| 12 | approver | 审批人 | approver | nvarchar(20) |  | 用户 (user) |
| 13 | approvestatus | 审批状态 | approvestatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |