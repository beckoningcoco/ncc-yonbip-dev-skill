# |<<

**物料清单多产出 (bd_bom_outputs / nc.vo.bd.bom.bom0202.entity.BomOutputsVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/374.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbom_outputsid | 物料清单多产出 | cbom_outputsid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 计划组织最新版本 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 计划组织 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | vrowno | 行号 | vrowno | varchar(50) |  | 字符串 (String) |
| 6 | foutputtype | 产出类型 | foutputtype | int | √ | 产出类型 (outputtype) |  | 1=主产品; |