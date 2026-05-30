# |<<

**投融资品种 (tmpub_FinVar / nc.vo.tmpub.bd.finvariety.FinVarietyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5765.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_finvariety | 主键 | pk_finvariety | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | summary | 摘要 | summary | varchar(200) |  | 备注 (Memo) |
| 6 | remark | 详细说明 | remark | varchar(200) |  | 备注 (Memo) |
| 7 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 8 | type | 分类 | type | varchar(50) |  | 品种分类 (VariatyEnum) |  | 1=融资品种; |