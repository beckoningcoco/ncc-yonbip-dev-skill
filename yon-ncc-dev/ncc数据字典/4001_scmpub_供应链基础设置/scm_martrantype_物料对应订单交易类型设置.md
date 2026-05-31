# |<<

**物料对应订单交易类型设置 (scm_martrantype / nc.vo.scmf.pu.ordertranstype.entity.OrderTransTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5222.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_martrantype | 主键 | pk_martrantype | char(20) | √ | 主键 (UFID) |
| 2 | pk_marbasclass | 物料基本分类 | pk_marbasclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 3 | pk_material | 物料编码 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 4 | vtrantypecode | 订单类型编码 | vtrantypecode | varchar(50) | √ | 字符串 (String) |
| 5 | pk_marpuclass | 物料采购分类 | pk_marpuclass | varchar(20) |  | 物料采购分类 (marpuclass) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |
| 8 | pk_materialpu | 采购分类物料 | pk_materialpu | varchar(20) |  | 主键 (UFID) |
| 9 | ctrantypeid | 订单类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 10 | pk_srcmaterial | 物料oid | pk_srcmaterial | varchar(20) |  | 物料基本信息 (material_v) |