# |<<

**营销费用归集分摊规则主实体 (me_allotset / nc.vo.me.allotset.entity.AllotSetHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3602.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_allotset_h | 营销费用归集分摊规则主实体 | pk_allotset_h | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_集团 (group) |
| 4 | ctrantypeid | 归集单类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 5 | cfactorid | 核算要素 | cfactorid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 6 | fallotsetflag | 分摊依据 | fallotsetflag | int |  | 分摊依据 (allotsetflag) |  | 1=订单金额; |