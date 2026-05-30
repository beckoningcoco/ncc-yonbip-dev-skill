# |<<

**卷积方案 (sca_convscheme / nc.vo.sca.costsimulation.entity.ConvSchemeHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5042.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_convscheme | 卷积方案 | pk_convscheme | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 业务单元版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | schemecode | 卷积方案编码 | schemecode | varchar(200) |  | 字符串 (String) |
| 6 | schemename | 卷积方案名称 | schemename | varchar(400) |  | 字符串 (String) |
| 7 | cbomsource | BOM来源 | cbomsource | int |  | 生产BOM来源 (cProdBomSourceEnum) | 1 | 1=默认卷积BOM; |