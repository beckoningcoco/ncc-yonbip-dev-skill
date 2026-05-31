# |<<

**工程变更分析产品分析子表 (mm_eca_b / nc.vo.ecn.eco.eca.entity.EcaItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3672.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_eca_b | 工程变更分析子表主键 | pk_eca_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 计划组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 计划组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | cbmaterialid | 物料 | cbmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | cbmaterialvid | 物料版本 | cbmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | cbastunitid | 单位 | cbastunitid | varchar(20) |  | 计量单位 (measdoc) |
| 8 | cbunitid | 主单位 | cbunitid | varchar(20) |  | 计量单位 (measdoc) |
| 9 | vbchangerate | 换算率 | vbchangerate | varchar(50) |  | 字符串 (String) |
| 10 | ecaobjecttype | 分析对象类型 | ecaobjecttype | int |  | 工程变更分析对象类型 (ECAObjectTypeEnum) |  | 1=存量; |