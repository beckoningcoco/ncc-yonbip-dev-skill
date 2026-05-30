# |<<

**集采控制规则子表 (scm_cenpurule_b / nc.vo.scmf.pu.cenpurule.entity.CenPuRuleItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5209.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cenpurule_b | 集采控制规则子表 | pk_cenpurule_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_ctrlorg | 受控采购组织编码 | pk_ctrlorg | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |
| 4 | pk_org | 控制采购组织编码 | pk_org | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |
| 5 | pk_marpuclass | 物料采购分类编码 | pk_marpuclass | varchar(20) |  | 物料采购分类 (marpuclass) |
| 6 | fctrltype | 控制类型 | fctrltype | int |  | 控制类型 (ctrltype) |  | 0=集采合同; |