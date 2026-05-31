# |<<

**收款单类型范围修订子实体 (sr_plcy_rece_r / nc.vo.sr.policy.revise.entity.PlcyRecetypeReviseVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5478.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_plcy_paytype_r | 收款单类型范围修订子实体 | pk_plcy_paytype_r | char(20) | √ | 主键 (UFID) |
| 2 | pk_plcy_paytype | 收款单类型范围子实体 | pk_plcy_paytype | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | crecetypeid | 收款单类型 | crecetypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 5 | pk_plcy | 返利政策主实体 | pk_plcy | char(20) |  | 主键 (UFID) |