# |<<

**物料医卫信息 (bd_materialcn / nc.vo.bd.material.MaterialcnVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/892.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_materialcn | 物料医卫信息主键 | pk_materialcn | char(20) | √ | 主键 (UFID) |
| 2 | pk_material | 物料基本信息主键 | pk_material | varchar(20) | √ | 物料基本信息（多版本） (material) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属医卫组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | quan_def | 默认用量 | quan_def | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | pk_measdoc_def | 默认用量单位 | pk_measdoc_def | varchar(20) |  | 计量单位 (measdoc) |
| 7 | pk_freq_def | 默认频次 | pk_freq_def | varchar(20) |  | 医嘱频次(自定义档案) (Defdoc-HPCM_0002) |
| 8 | pk_usage_def | 默认用法 | pk_usage_def | varchar(20) |  | 药品用法(自定义档案) (Defdoc-030401) |
| 9 | pk_measdoc_op | 门急诊默认单位 | pk_measdoc_op | varchar(20) |  | 计量单位 (measdoc) |
| 10 | pk_measdoc_ip | 住院默认单位 | pk_measdoc_ip | varchar(20) |  | 计量单位 (measdoc) |
| 11 | eu_pdprice | 零售价计价方式 | eu_pdprice | varchar(50) |  | 零售价计价方式 (ValuationModeEnum) |  | 0=固定价格; |