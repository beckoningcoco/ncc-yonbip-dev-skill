# |<<

**订单类型范围修订子实体 (sr_plcy_ord_r / nc.vo.sr.policy.revise.entity.PlcyOrdtypeReviseVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5468.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_plcy_ordtype_r | 订单类型范围修订子实体 | pk_plcy_ordtype_r | char(20) | √ | 主键 (UFID) |
| 2 | pk_plcy_ordtype | 订单类型范围子实体 | pk_plcy_ordtype | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | cordertypeid | 订单类型 | cordertypeid | varchar(20) |  | 销售订单交易类型 (m30trantype) |
| 5 | pk_plcy | 返利政策主实体 | pk_plcy | char(20) |  | 主键 (UFID) |