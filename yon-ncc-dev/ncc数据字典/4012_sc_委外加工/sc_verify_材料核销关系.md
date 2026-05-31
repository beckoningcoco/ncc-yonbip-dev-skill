# |<<

**材料核销关系 (sc_verify / nc.vo.sc.m66.entity.VerifyHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5028.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_verify | 材料核销关系 | pk_verify | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 6 | pk_subcontin | 委托加工入库单 | pk_subcontin | varchar(20) |  | 委托加工入库 (SubcontInHeadVO) |
| 7 | csubcontinbillcode | 委托加工入库单号 | csubcontinbillcode | varchar(40) |  | 字符串 (String) |
| 8 | pk_subcontin_b | 委托加工入库单行 | pk_subcontin_b | varchar(20) |  | 委托加工入库表体 (SubcontInBodyVO) |
| 9 | csubcontinrowno | 委托加工入库单行号 | csubcontinrowno | varchar(20) |  | 字符串 (String) |
| 10 | billmaker | 核销人 | billmaker | varchar(20) |  | 用户 (user) |
| 11 | creationtime | 核销时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |