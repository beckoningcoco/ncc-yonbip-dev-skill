# |<<

**优质优价方案子表 (purp_qpscheme_b / nc.vo.pp.hqhp.qpschm.entity.QPSchmItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4812.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_qpscheme_b | 子表主键 | pk_qpscheme_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_qpstandardbase | 优质优价主体标准 | pk_qpstandardbase | varchar(20) |  | 优质优价标准主表 (QPStandardHeaderVO) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |
| 4 | pk_org_v | 组织版本信息 | pk_org_v | char(20) |  | 主键 (UFID) |
| 5 | fschemetype | 所属方案类型 | fschemetype | int |  | 方案标准类型 (StandardType) |  | 0=扣吨; |