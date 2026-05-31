# |<<

**财资费用项目 (tmpub_FinCostProj / nc.vo.tmpub.bd.fincostproject.FinCostProjectVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5762.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fincostproject | 主键 | pk_fincostproject | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | summary | 摘要 | summary | varchar(200) |  | 备注 (Memo) |
| 6 | remark | 详细说明 | remark | varchar(200) |  | 备注 (Memo) |
| 7 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 8 | code | 编码 | code | varchar(200) |  | 字符串 (String) |
| 9 | sys_mark | 系统标识 | sys_mark | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | enable_status | 启用状态 | enable_status | varchar(50) |  | 财资费用项目启用状态 (FinCostProjectEnableState) |  | 1=已启用; |