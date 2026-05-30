# |<<

**辅计量管理 (bd_materialconvert / nc.vo.bd.material.MaterialConvertVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/893.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_materialconvert | 换算定义主键 | pk_materialconvert | char(20) | √ | 主键 (UFID) |
| 2 | pk_material | 物料基本信息主键 | pk_material | char(20) | √ | 物料基本信息（多版本） (material) |
| 3 | pk_measdoc | 计量单位名称 | pk_measdoc | char(20) | √ | 计量单位 (measdoc) |
| 4 | measrate | 主单位/辅单位 | measrate | varchar(50) | √ | 字符串 (String) |
| 5 | fixedflag | 固定换算 | fixedflag | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | isstorebalance | 结存 | isstorebalance | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | ispumeasdoc | 采购默认单位 | ispumeasdoc | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | isprodmeasdoc | 生产默认单位 | isprodmeasdoc | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | isstockmeasdoc | 库存默认单位 | isstockmeasdoc | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | issalemeasdoc | 销售默认单位 | issalemeasdoc | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | isretailmeasdoc | 零售默认单位 | isretailmeasdoc | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | flag_op | 门急诊默认单位 | flag_op | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | flag_ip | 住院默认单位 | flag_ip | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | ispiecemangage | 件数管理 | ispiecemangage | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | showorder | 辅计量拆解显示顺序号 | showorder | int |  | 整数 (Integer) |
| 16 | pk_apartmeasdoc | 拆解单位名称 | pk_apartmeasdoc | varchar(20) |  | 计量单位 (measdoc) |
| 17 | dataoriginflag | 分布式 | dataoriginflag | smallint |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |