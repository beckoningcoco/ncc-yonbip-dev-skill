# |<<

**协同设置主表 (scm_coopsetup / nc.vo.scmf.coop.entity.CoopHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5211.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_coopsetup | 协同设置主表主键 | pk_coopsetup | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团PK | pk_group | varchar(0) |  | 组织_集团 (group) |
| 3 | pk_financeorg_dest | 目的结算财务组织 | pk_financeorg_dest | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_financeorg_src | 源结算财务组织 | pk_financeorg_src | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | vtrantypecode_dest | 目的单据交易类型编码 | vtrantypecode_dest | varchar(20) |  | 字符串 (String) |
| 6 | vtrantypecode_src | 源单据交易类型编码 | vtrantypecode_src | varchar(20) |  | 字符串 (String) |
| 7 | pk_org_dest | 目的购销组织 | pk_org_dest | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 8 | pk_org_src | 源购销组织 | pk_org_src | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 9 | vbilltype_src | 源单据类型 | vbilltype_src | varchar(50) |  | 单据类型 (billTypeEnum) |  | 21=采购订单; |