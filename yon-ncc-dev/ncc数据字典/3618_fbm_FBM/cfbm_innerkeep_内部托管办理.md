# |<<

**内部托管办理 (cfbm_innerkeep / nc.vo.cfbm.innerkeep.InnerKeepVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1411.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_innerkeep | 主键 | pk_innerkeep | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资金组织 | pk_org | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 4 | pk_org_v | 资金组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 5 | trusttype | 托管类型 | trusttype | varchar(50) |  | 托管类型 (TrustTypeEnum) |  | keep=保管托管; |