# |<<

**物料生产信息 (bd_materialprod / nc.vo.bd.material.prod.MaterialProdVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/903.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_materialprod | 物料生产信息主键 | pk_materialprod | char(20) | √ | 主键 (UFID) |
| 2 | pk_material | 物料基本信息主键 | pk_material | char(20) | √ | 物料基本信息（多版本） (material) |
| 3 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 4 | pk_org | 所属工厂 | pk_org | char(20) | √ | 组织_业务单元_工厂 (factory) |
| 5 | prodmode | 生产模式 | prodmode | int | √ | 生产模式 (prodmode) | 1 | 1=流程制造; |